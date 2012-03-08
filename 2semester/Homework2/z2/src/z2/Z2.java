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

    /**
     * @param args the command line arguments
     */
    public static void outputArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.format("%d ", a[i][j]);
            }
            System.out.format("\n");
        }
    }

    public static void swapColumn(int[][] a, int i, int j) {
        for (int k = 0; k < a.length; k++) {
            a[k][j] = a[k][j] + a[k][i];
            a[k][i] = a[k][j] - a[k][i];
            a[k][j] = a[k][j] - a[k][i];
        }
    }

    public static void sorting(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[0][j - 1] > a[0][j]) 
                    swapColumn(a, j - 1, j);
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {{5, 4, 3, 2, 1}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};//{{3, 2, 1}, {4, 5, 6}, {7, 8, 9}}; //
        sorting(a);
        outputArray(a);
    }
}