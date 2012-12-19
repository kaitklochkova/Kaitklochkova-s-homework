/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author Miracle
 */
public class TreeElement {
  
    /*
     * constructor for TreeElement
     */
    public TreeElement(int value) {
        this.value = value;
        rightSon = null;
        leftSon = null;
    }
    
    /**
     * return value of the element
     *
     * @return value of the element
     */
    public int getValue() {
        return this.value;
    }

    /**
     * set value of the element
     *
     * @param value is a new value of the element
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * return left son of the element
     *
     * @return left son of the element
     */
    public TreeElement getLeftSon() {
        return this.leftSon;
    }
    
    /**
     * return right son of the element
     *
     * @return right son of the element
     */
    public TreeElement getRightSon() {
        return this.rightSon;
    }

    /**
     * set left son of the element
     *
     * @param leftSon element which will be left child of the current element
     */
    public void setLeftSon(TreeElement leftSon) {
        this.leftSon = leftSon;
    }
    
    /**
     * set right son of the element
     *
     * @param rightSon element which will be right child of the current element
     */
    public void setRightSon(TreeElement rightSon) {
        this.rightSon = rightSon;
    }

    
    /**
     * add new element
     *
     * @param value value of the new element, that should be added
     */
    public void addElement(int value) {
        TreeElement newEl = new TreeElement(value);
        if (value >= this.value) {
            if (this.getRightSon() != null) {
                this.getRightSon().addElement(value);
            } else {
                this.setRightSon(newEl);
            }
        } else {
            if (this.getLeftSon() != null) {
                this.getLeftSon().addElement(value);
            } else {
                this.setLeftSon(newEl);
            }
        }
    }
    
    /**
     * check if element with this value is in the tree
     *
     * @param value element, wich is founded
     * @return true, if the element is found, false isn't
     */
    public boolean searchElement(int value) {
        if (this != null) {
            if (value == this.value) {
                return true;
            } else if (value > this.value && this.getRightSon() != null) {
                return this.getRightSon().searchElement(value);
            } else if (value < this.value && this.getLeftSon() != null) {
                return this.getLeftSon().searchElement(value);
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
    
    /**
     * value of the element
     */
    private int value;
    /* 
     * left sun of current treeElement
     */
    private TreeElement leftSon;
    /* 
     * right sun of current treeElement
     */
    private TreeElement rightSon;
    
    /**
     * treeElement is before current one
     */
    private TreeElement parent;
}
