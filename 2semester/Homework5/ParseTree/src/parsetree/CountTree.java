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
    
    public CountTree(ParseTree tree) {
        root = tree.copyTree();
}
    
    public int calculateTree(TreeElement temp) throws IncorrectOperation, IncorrectTree{
        temp = root;
        if (temp.getLeftSon().isDigit() && temp.getRightSon().isDigit()) {
            return temp.calculate(temp.getLeftSon().getDigit(), temp.getRightSon().getDigit());
        }
        if (temp.getLeftSon().isDigit() && !temp.getRightSon().isDigit()) {
            int rightValue = calculateTree(temp.getRightSon());
            return temp.calculate(temp.getLeftSon().getDigit(), rightValue);
        }
        if (!temp.getLeftSon().isDigit() && temp.getRightSon().isDigit()) {
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
    
    TreeElement root;
}
