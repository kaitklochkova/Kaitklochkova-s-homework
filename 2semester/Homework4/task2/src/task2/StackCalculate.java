/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Miracle
 */
public class StackCalculate {

    interface StackCalc {
        // Добавить число в стек.

        void push(int val);
        // Сложить.

        int add() throws Exception;
        // Вычесть.

        int sub() throws Exception;
        // Умножить.

        int mul() throws Exception;
        // Разделить.

        int div() throws Exception;
        // Показать вершину стека.

        int top() throws Exception;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
