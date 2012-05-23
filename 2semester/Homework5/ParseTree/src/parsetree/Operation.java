/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parsetree;

/**
 *
 * @author Miracle
 */
public class Operation implements TreeElement{
    
    public Operation(char operation) {
        this.operation = operation;
        rightSon = null;
        leftSon = null;
    }
    /**
     * prints element
     */
    @Override
    public void print() {
        System.out.print('(');
        System.out.print(operation + ' ');
        leftSon.print();
        rightSon.print();
        System.out.print(')');
    }

    /**
     * add leftSon child to element
     *
     * @param leftSon element, which you want to add
     */
    @Override
    public void setLeftSon(TreeElement leftSon) {
        this.leftSon = leftSon;
    }

    /**
     * return leftSon child
     *
     * @return leftSon child
     */
    @Override
    public TreeElement getLeftSon() {
        return leftSon;
    }

    /**
     * add rightSon child to element
     *
     * @param rightSon element, which you want to add
     */
    @Override
    public void setRightSon(TreeElement rightSon) {
        this.rightSon = rightSon;
    }

    /**
     * returns rightSon child
     *
     * @return rightSon child
     */
    @Override
    public TreeElement getRightSon() {
        return rightSon;
    }
    
    private char operation;
    private TreeElement leftSon;
    private TreeElement rightSon;

    @Override
    public int calculate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
