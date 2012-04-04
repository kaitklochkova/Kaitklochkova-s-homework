/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Miracle
 */
class StackArray implements StackInterface {

    /**
     * constructor for array stack
     */
    StackArray() {
        this.array = new int[1000];
        count = 0;
    }

    /**
     * push value to the stack
     *
     * @param value value, which you want to push
     */
    @Override 
    public void push(int valueForAdd) {
            array[count] = valueForAdd;
            count++;
    }
      
    /**
     * pop an element from the stack
     * 
     * @return value of the top element
     */
    @Override 
    public int pop() {
        int result = array[count - 1];
        array[count - 1] = 0;
        count--;
        return result;
    }
    
    /**
     * to return value of the top element
     *
     * @return value of the top element
     */
    @Override 
    public int top() {
        return array[count - 1];
    }
    
    /**
     * checks that the stack is empty or not
     *
     * @return true if stack is empty else false
     */
    @Override 
    public boolean isEmpty() {
        return count == 0;
    }
    
    /**
     * array of the stack
     */
    private int[] array;
    
    /**
     * count of the elements of the stack
     */
    private int count;
}
