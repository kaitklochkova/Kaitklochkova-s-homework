/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Miracle
 */
class StackArray {

    StackArray() {
        int[] array = new int[1000];
        count = 0;
    }

    public boolean push(int valueForAdd) {
        if (count < 1000) {
            array[count] = valueForAdd;
            return true;
        } else {
            return false;
        }
    }

    public int top() {
        return array[count];
    }

    public void pop() {
        array[count] = 0;
        count--;
    }
    private int[] array;
    private int count;
}
