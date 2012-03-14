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
            array[count - 1] = valueForAdd;
            count++;
            return true;
        } else {
            return false;
        }
    }

    public int top() {
        return array[count - 1];
    }

    public int pop() {
        int result = array[count - 1];
        array[count - 1] = 0;
        count--;
        return result;
    }
    private int[] array;
    private int count;
}
