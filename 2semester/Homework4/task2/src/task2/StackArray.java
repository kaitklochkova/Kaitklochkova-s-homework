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
        for (int i = 0; i < 1000; i++)
            array[i] = 0;
    }
    public void push(int valueForAdd) {
        for (int i = array.length; i >=0; i--)
            array[i + 1] = array[i];
        array[0] = valueForAdd;
    }
    public int top() {
        return array[0];
    }
    public void pop() {
        for (int i = 0; i < array.length; i++)
            array[i] = array[i + 1];
    }
    private int[] array;
}

