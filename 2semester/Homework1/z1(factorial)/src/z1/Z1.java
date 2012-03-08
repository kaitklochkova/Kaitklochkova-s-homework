/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z1;

/**
 *
 * @author Miracle
 */
public class Z1 {

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.format("%d\n", factorial(4));
    }
}
