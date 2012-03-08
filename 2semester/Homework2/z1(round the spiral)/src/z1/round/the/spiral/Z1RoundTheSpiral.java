/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z1.round.the.spiral;

/**
 *
 * @author Miracle
 */
public class Z1RoundTheSpiral {

    /**
     * @param args the command line arguments
     */
    /*
     * public static void down(int[][] a, int x, int y, int howToPrint) {
     *
     * }
     */
    public static void down(int[][] a, int x, int y, int howToPrint, int countPrinted) {
        for (int i = x; i < x + howToPrint; i++) {
            System.out.format("%d \n", a[i][y]);
        }
    }

    public static void left(int[][] a, int x, int y, int howToPrint, int countPrinted) {
        for (int i = y; i > y - howToPrint; i--) {
            System.out.format("%d \n", a[x][i]);
        }
    }

    public static void up(int[][] a, int x, int y, int howToPrint, int countPrinted) {
        for (int i = x; i > x - howToPrint; i--) {
            System.out.format("%d \n", a[i][y]);
        }
    }

    public static void right(int[][] a, int x, int y, int howToPrint, int countPrinted) {
        for (int i = y; i < y + howToPrint; i++) {
            System.out.format("%d \n", a[x][i]);
        }
    }

    public static int count(int countPrinted, int howToPrint) {
        return countPrinted + howToPrint;
    }

    public static void roundTheSpiral (int[][] a) {
        int x = a.length / 2;
        int y = a.length / 2;
        int howToPrint = 1;
        int countPrinted = 0;
        while (countPrinted < a.length * a.length) {
            down(a, x, y, howToPrint, countPrinted);
            countPrinted = count(countPrinted, howToPrint);
            x = x + howToPrint;
            if (countPrinted < a.length * a.length) {
                left(a, x, y, howToPrint, countPrinted);
                countPrinted = count(countPrinted, howToPrint);
            }
            y = y - howToPrint;
            howToPrint++;
            if (countPrinted < a.length * a.length) {
                up(a, x, y, howToPrint, countPrinted);
                countPrinted = count(countPrinted, howToPrint);
            }
            x = x - howToPrint;
            if (countPrinted < a.length * a.length) {
                right(a, x, y, howToPrint, countPrinted);
                countPrinted = count(countPrinted, howToPrint);
            }
            y = y + howToPrint;
            howToPrint++;
        }
    }
    
    public static void main(String[] args) {
        int[][] a =  {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        roundTheSpiral(a);
    }
}
