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
     * 
     * @return value of the top element
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
    StackCalculate (StackInterface stack) {
       this.stack = stack;
    }
    
    /**
     * adds two values
     *
     * @return summ two values
     */
    public int add() {
        stack.push(stack.pop() + stack.pop());
        return stack.top();
    }

    /**
     * subtracts two values
     *
     * @return difference two values
     */
    int sub() {
        stack.push(stack.pop() - stack.pop());
        return stack.top();
    }

    /**
     * multiplate two values
     *
     * @return product two values
     */
    int mul() {
        stack.push(stack.pop() * stack.pop());
        return stack.top();
    }

    /**
     * divides two values
     *
     * @return quotient two values
     */
    int div() {
        stack.push(stack.pop() / stack.pop());
        return stack.top();
    }
    
    void printResult(StackInterface stack) {
        System.out.format("%d\n", stack.pop());
    }

    /**
     * the stack of the calculator
     */
    private StackInterface stack;
}
