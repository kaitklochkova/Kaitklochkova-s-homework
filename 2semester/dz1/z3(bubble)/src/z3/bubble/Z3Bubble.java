/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z3.bubble;

/**
 *
 * @author Miracle
 */
public class Z3Bubble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {0, 9, 5, 7, 3, 7, 0, 0, 4, 9};
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    a[j] = a[j] + a[j - 1];
                    a[j - 1] = a[j] - a[j - 1];
                    a[j] = a[j] - a[j - 1];
                }
            }
        }
        System.out.format("Sorted array in ascending order: \n");
        for (int i = 0; i < a.length; i++) {
            System.out.format("%d \n", a[i]);
        }
    }
}
