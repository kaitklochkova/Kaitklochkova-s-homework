/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z4.stack;

/**
 *
 * @author Miracle
 */
class Stack {

    public void push(int valueForAdd) {
        StackElement temp = new StackElement(valueForAdd, head);
        head = temp;
    }

    public int pop() {
        if (!isEmpty()) {
            int answer = head.value;
            head = head.next;
            return answer;
        } else {
            return -1;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int top() {
        if (!isEmpty()) {
            return head.value;
        } else {
            return -1;
        }
    }

    private class StackElement {

        public StackElement(int valueForAdd, StackElement next) {
            this.value = valueForAdd;
            this.next = next;
        }
        private int value;
        private StackElement next;
    }
    private StackElement head;
}

public class Z4Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
}
