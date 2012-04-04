/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Miracle
 */
interface StackInterface {
    
    /**
     * push value to the stack
     *
     * @param value value, which you want to push
     */
    void push(int val);

    /**
     * pop an element from the stack
     */
    int pop();

    /**
     * to return value of the top element
     *
     * @return value of the top element
     */
    int top();
    
    /**
     * checks that the stack is empty or not
     *
     * @return true if stack is empty else false
     */
    boolean isEmpty();
}

public class StackCalculate {

    /**
     * constructor for calculator
     *
     * @param stack
     */
    StackCalculate () {
       this.stack = stack;
    }
    
    /**
     * adds two values
     *
     * @return summ two values
     */
    public int add() {
        return (stack.pop() + stack.pop());
    }

    int sub() {
        return (stack.pop() - stack.pop());
    }

    int mul() {
        return (stack.pop() * stack.pop());
    }

    int div() {
        return (stack.pop() / stack.pop());
    }
    
    void printResult(StackInterface stack) {
        System.out.format("%d\n", stack.pop());
    }

    /**
     * the stack of the calculator
     */
    private StackInterface stack;
}
