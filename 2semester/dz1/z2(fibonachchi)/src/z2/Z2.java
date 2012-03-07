/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z2;

/**
 *
 * @author Miracle
 */
public class Z2 {

    public static int fibonachchi(int count) {
        if (count <= 2) {
            return 1;
        } else {
            return fibonachchi(count - 1) + fibonachchi(count - 2);
        }
    }

    public static void main(String[] args) {
        System.out.format("%d\n", fibonachchi(5));
    }
}
