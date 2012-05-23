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
        System.out.print(digit + ' ');
    }
    
    /**
     * calculates element
     *
     * @return digit
     */
    @Override
    public int calculate() {
        return digit;//Integer.parseInt(String.valueOf(digit));//Integer.parseInt(digit);
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
}
