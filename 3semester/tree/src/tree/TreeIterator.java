/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;
import java.util.Stack;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Miracle
 */
public class TreeIterator implements Iterator<Integer>{
    
    /**
     * constructor for TreeIterator
     */
    public TreeIterator(Tree tree) {
        iterator = tree.getRoot();
        stack.push(iterator);
    }
    
    /*
     * @return next of element pointed to by the iterator
     */
    @Override
    public Integer next() {
        iterator = stack.pop();
        int value = iterator.getValue();
        if (iterator.getLeftSon() != null) {
            stack.push(iterator.getLeftSon());
        }
        if (iterator.getRightSon() != null) {
            stack.push(iterator.getRightSon());
        }
        if (stack.empty()) {
            iterator = null;
        }      
        return value;       
    }

    /**
      * checks that the element pointed to by the iterator points to not null
      *
      * @return true if element points to not null else false
      */
    @Override
    public boolean hasNext() {
        if (iterator == null) {
            return false;
        } else {
            return (iterator.getLeftSon() != null || iterator.getRightSon() != null);
        }
    }
    
    /**
     * current element of the tree
     */
    private TreeElement iterator;
    /**
     * stack for elements of the tree
     */
    private Stack<TreeElement> stack = new Stack<TreeElement>();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
