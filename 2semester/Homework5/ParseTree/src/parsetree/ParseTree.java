/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parsetree;

/**
 *
 * @author Miracle
 */
public class ParseTree {

    /*
     * constructor for ParseTree @param arithmeticExpression, which we want use
     * to build the tree
     */
    public ParseTree(String arithmeticExpression) throws IncorrectString {
        try {
            root = buildParseTree(arithmeticExpression);
        } catch (IncorrectString exception1) {
            throw exception1;
        }
        count = 0;
    }

    public void print() {
        root.print();
    }

    public TreeElement getRoot() {
        return root;
    }

    /*
     * Build the ParseTree @param arithmeticExpression, which we want use to
     * build the tree
     */
    private TreeElement buildParseTree(String arithmeticExpression) throws IncorrectString {
        if (isBracket(arithmeticExpression.charAt(count))) {
            count++;
            if (isOperation(arithmeticExpression.charAt(count))) {
                TreeElement newOperation = new Operation(arithmeticExpression.charAt(count));
                count++;
                if (isBracket(arithmeticExpression.charAt(count))) {
                    newOperation.setLeftSon(buildParseTree(arithmeticExpression));
                    count++;
                } else {
                    if (isDigit(arithmeticExpression.charAt(count))) {
                        int digit = Integer.parseInt(String.valueOf(arithmeticExpression.charAt(count)));
                        TreeElement newDigit = new Digit(digit);
                        newOperation.setLeftSon(newDigit);
                        count++;
                    } else {
                        if (arithmeticExpression.charAt(count) == ')') {
                            count++;
                        } else {
                            throw new IncorrectString();
                        }
                    }
                }
                if (isBracket(arithmeticExpression.charAt(count))) {
                    newOperation.setLeftSon(buildParseTree(arithmeticExpression));
                    count++;
                } else {
                    if (isDigit(arithmeticExpression.charAt(count))) {
                        int digit = Integer.parseInt(String.valueOf(arithmeticExpression.charAt(count)));
                        TreeElement newDigit = new Digit(digit);
                        newOperation.setRightSon(newDigit);
                        count++;
                    } else {
                        if (arithmeticExpression.charAt(count) == ')') {
                            count++;
                        } else {
                            throw new IncorrectString();
                        }
                    }
                }
                return newOperation;
            } else {
                throw new IncorrectString();
            }

        } else {
            throw new IncorrectString();
        }
    }

    /**
     * Check, is it a operation
     *
     * @param sign
     * @return True if sign the operation and false if doesn't
     */
    private boolean isOperation(char sign) {
        return (sign == '+' || sign == '-' || sign == '*' || sign == '/');
    }

    /**
     * Check, is it a digit
     *
     * @param sign
     * @return True if sign the digit and false if doesn't
     */
    private boolean isDigit(char sign) {
        return (('0' <= sign) && (sign <= '9'));
    }

    /**
     * Check, is it a bracket
     *
     * @param sign
     * @return True if sign the bracket and false if doesn't
     */
    private boolean isBracket(char sign) {
        return (sign == '(');
    }
    
    /*
     * root of the tree
     */
    private TreeElement root;
    
    /*
     * count of added element to the tree
     */
    private int count;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IncorrectString, IncorrectOperation, IncorrectTree {
        ParseTree newTree = new ParseTree("(*(+23)(+45))");
        newTree.print();
        CountTree countTree = new CountTree(newTree);
        System.out.format("%d ", countTree.calculateTree(newTree.getRoot()));
    }
}
