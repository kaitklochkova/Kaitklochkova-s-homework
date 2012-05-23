/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parsetree;

/**
 *
 * @author Miracle
 */
public interface TreeElement {

    /**
     * add left sun to element
     *
     * @param left element, which you want to add
     */
    void setLeftSon(TreeElement left);

    /**
     * return left sun
     *
     * @return left sun
     */
    TreeElement getLeftSon();

    /**
     * add right sun to element
     *
     * @param right element, which you want to add
     */
    void setRightSon(TreeElement right);

    /**
     * returns right sun
     *
     * @return right sun
     */
    TreeElement getRightSon();
    
        
    /**
     * prints element
     */
    void print();

    /**
     * calculates element
     *
     * @return number, if element is number; 
     * result of the operation if element is operation
     */
     int calculate(int value1, int value2) throws IncorrectOperation;
     
     boolean isDigit();
     
     boolean isOperation();
     
     int getDigit();
     
     char getOperation();
}
