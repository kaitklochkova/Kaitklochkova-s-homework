/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Miracle
 */
class StackArray{
    StackArray() {
        int[] array = new int[1000];
    }
    public void push(int valueForAdd) {
        array[array.length] = valueForAdd;
    }
    public int top() {
        return array[array.length];
    }
    public void pop() {
            array[array.length] = 0;
    }
    private int[] array;
}

