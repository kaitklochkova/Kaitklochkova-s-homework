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
    int pop() throws EmptyStack;

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
    public int add() throws EmptyStack {
        stack.push(stack.pop() + stack.pop());
        return stack.top();
    }

    /**
     * subtracts two values
     *
     * @return difference two values
     */
    public int sub() throws EmptyStack {
        stack.push(stack.pop() - stack.pop());
        return stack.top();
    }

    /**
     * multiplate two values
     *
     * @return product two values
     */
    public int mul() throws EmptyStack {
        stack.push(stack.pop() * stack.pop());
        return stack.top();
    }

    /**
     * divides two values
     *
     * @return quotient two values
     */
    public int div() throws EmptyStack {
        stack.push(stack.pop() / stack.pop());
        return stack.top();
    }
    
    public void addTwoElementsToStack(int a, int b) {
        stack.push(a);
        stack.push(b);
    }
    
    /**
     * print the result of calculate
     */
    public void printResult() throws EmptyStack {
        System.out.format("%d\n", stack.pop());
    }

    /**
     * pop an element from the stack and catch exception
     */
    private void popElement() throws EmptyStack {
        try {
            stack.pop();
        } catch (EmptyStack emptyStack) {
            throw emptyStack;
        }
    }
    
    /**
     * the stack of the calculator
     */
    private StackInterface stack;

    public static void main(String[] args) {
    
    }
}