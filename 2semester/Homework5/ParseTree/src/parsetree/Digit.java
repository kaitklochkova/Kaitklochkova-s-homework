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
      * Check, is it a digit
      *
      * @param sign
      * @return true 
      */ 
    @Override
    public boolean isDigit() {
        return true;
    }
    
    /*
     * @return value of digit of TreeElement if isDigit
     */
    @Override
    public int getDigit() {
        return digit;
    }
    
    /*
     * Unsupported operation 
     */
    @Override
    public int calculate(int value1, int value2) throws IncorrectOperation{
        throw new UnsupportedOperationException("Not supported yet.");
    }    

    /*
     * Unsupported operation 
     */
    @Override
    public void setLeftSon(TreeElement left) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Unsupported operation 
     */
    @Override
    public TreeElement getLeftSon() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Unsupported operation 
     */
    @Override
    public void setRightSon(TreeElement right) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Unsupported operation 
     */
    @Override
    public TreeElement getRightSon() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /*
     * value of digit
     */
    private int digit;
}
