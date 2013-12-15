package lesson11_MultidimensionalArray;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 02.11.13
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 */
public class Printer {
    public static void print(int[][] arrays) {
        System.out.println();
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j <arrays[i].length; j++ ) {
                System.out.print(arrays[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
