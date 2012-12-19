/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author Miracle
 */
public class Tree implements Iterable<Integer>{

    /*
     * costructor for tree
     */
    Tree() {
        this.root = null;
    }
    
    public boolean isEmpty() {
        return this.root == null;
    }
    
    /**
     * add element to the tree
     *
     * @param value value of the element, that should be added
     */
    public void add(int value) {
        if (this.isEmpty()) {
            root = new TreeElement(value);
        } else {
            root.addElement(value);
        }
    }
    
    /**
     * check if element with this value is in the tree
     *
     * @param value element, wich is founded
     * @return true, if the element is found, false isn't
     */
    public boolean search(int value) {
        if (!this.isEmpty()) {
            return root.searchElement(value);
        } else {
            return false;
        }
    }
    
    /**
     * return root of the tree
     *
     * @return root of the tree
     */
    public TreeElement getRoot() {
        return root;
    }
    
    /*
     * @return iterator
     */
    @Override
    public TreeIterator iterator() {
        return new TreeIterator(this);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private TreeElement root;
}
