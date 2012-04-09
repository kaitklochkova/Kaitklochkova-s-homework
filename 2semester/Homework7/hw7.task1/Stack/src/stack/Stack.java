/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Miracle
 */
public class Stack <Type> {
    /**
     * push value to the stack
     *
     * @param value value, which you want to push
     */
    public void push(Type valueForAdd) {
        StackElement temp = new StackElement(valueForAdd, head);
        head = temp;
    }

    /**
     * pop an element from the stack
     *
     * @return value of the top element
     */
    public Type pop() throws EmptyStack {
        if (isEmpty()) {
            throw new EmptyStack();
        } else {
        Type answer = head.value;
        head = head.next;
        return answer;
        }
    }

    /**
     * to return value of the top element
     *
     * @return value of the top element
     */
    public Type top() throws EmptyStack {
        if (isEmpty()) {
            throw new EmptyStack();           
        } else {
            return head.value;
        }
    }

    /**
     * checks that the stack is empty or not
     *
     * @return true if stack is empty else false
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * element of the stack
     */
    private class StackElement {

        public StackElement(Type valueForAdd, StackElement next) {
            this.value = valueForAdd;
            this.next = next;
        }
        private Type value;
        private StackElement next;
    }
    /**
     * the head of the stack
     */
    private StackElement head;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
