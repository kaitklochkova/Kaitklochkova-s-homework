/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Miracle
 */
interface Stack {

    void push(int val);

    int pop();

    int top();

    boolean isEmpty();
}

public class StackCalculate {

    StackCalculate (Stack stack) {
        
    }
            
    public int add(Stack stack) {
        return (stack.pop() + stack.pop());
    }

    int sub(Stack stack) {
        return (stack.pop() - stack.pop());
    }

    int mul(Stack stack) {
        return (stack.pop() * stack.pop());
    }

    int div(Stack stack) {
        return (stack.pop() / stack.pop());
    }
    
    void printResult(Stack stack) {
        System.out.format("%d\n", stack.pop());
    }

    /**
     * @param args the command line arguments
     */
}
