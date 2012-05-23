/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parsetree;

/**
 *
 * @author Miracle
 */
public class Digit implements TreeElement {
    
    /*
     * constructor for digit
     */
    public Digit(int value) {
        this.digit = value;
    }
    
    /*
     * prints the digit
     */
    @Override
    public void print() {
        System.out.format("%d ", digit);
    }
    
    /**
     * calculates element
     *
     * @return digit
     */
    @Override
    public int calculate(int value1, int value2) throws IncorrectOperation{
        throw new UnsupportedOperationException("Not supported yet.");
    }    

    @Override
    public void setLeftSon(TreeElement left) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TreeElement getLeftSon() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setRightSon(TreeElement right) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TreeElement getRightSon() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /*
     * value of digit
     */
    private int digit;

    @Override
    public boolean isDigit() {
        return true;
    }

    @Override
    public boolean isOperation() {
        return false;
    }

    @Override
    public int getDigit() {
        return digit;
    }

    @Override
    public char getOperation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
