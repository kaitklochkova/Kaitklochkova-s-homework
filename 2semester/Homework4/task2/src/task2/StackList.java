/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Miracle
 */
public class StackList implements StackInterface{
    
    /**
     * push value to the stack
     *
     * @param value value, which you want to push
     */
    @Override public void push(int valueForAdd) {
        StackElement temp = new StackElement(valueForAdd, head);
        head = temp;
    }
    
    /**
     * pop an element from the stack
     * 
     * @return value of the top element
     */
    @Override public int pop() {
        if (!isEmpty()) {
            int answer = head.value;
            head = head.next;
            return answer;
        } else {
            return -1;
        }
    }
    
    /**
     * to return value of the top element
     *
     * @return value of the top element
     */
    @Override public int top() {
        if (!isEmpty()) {
            return head.value;
        } else {
            return -1;
        }
    }
    
    /**
     * checks that the stack is empty or not
     *
     * @return true if stack is empty else false
     */
    @Override public boolean isEmpty() {
        return head == null;
    }
    
    /**
     * element of the stack
     */
    private class StackElement {
        public StackElement(int valueForAdd, StackElement next) {
            this.value = valueForAdd;
            this.next = next;
        }
        private int value;
        private StackElement next;
    }
    /**
     * the head of the stack
     */
    private StackElement head;
}
