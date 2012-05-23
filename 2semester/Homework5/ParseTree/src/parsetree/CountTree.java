/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parsetree;

/**
 *
 * @author Miracle
 */
public class CountTree {
    
    /*
     * costructor for CountTree
     */
    public CountTree(ParseTree tree) {
        root = tree.getRoot();
    }

    /*
     * calculate expression in the node
     * 
     * @param temp - node, whose value we want to calculate
     * @return value of expression in our node
     */
    public int calculateTree(TreeElement temp) throws IncorrectOperation, IncorrectTree {
        if (temp.getLeftSon().isDigit() && temp.getRightSon().isDigit()) {
            return temp.calculate(temp.getLeftSon().getDigit(), temp.getRightSon().getDigit());
        }
        if (temp.getLeftSon().isDigit() && !temp.getRightSon().isDigit()) {
            int rightValue = calculateTree(temp.getRightSon());
            return temp.calculate(temp.getLeftSon().getDigit(), rightValue);
        }
        if (temp.getRightSon().isDigit() && !temp.getLeftSon().isDigit()) {
            int leftValue = calculateTree(temp.getLeftSon());
            return temp.calculate(leftValue, temp.getRightSon().getDigit());
        }
        if (!temp.getLeftSon().isDigit() && !temp.getRightSon().isDigit()) {
            int leftValue = calculateTree(temp.getLeftSon());
            int rightValue = calculateTree(temp.getRightSon());
            return temp.calculate(leftValue, rightValue);
        }
        throw new IncorrectTree();
    }
    
    /*
     * root of the CountTree
     */
    private TreeElement root;
}
