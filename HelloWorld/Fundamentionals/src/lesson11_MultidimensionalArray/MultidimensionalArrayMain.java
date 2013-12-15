package lesson11_MultidimensionalArray;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 02.11.13
 * Time: 21:38
 * To change this template use File | Settings | File Templates.
 */
public class MultidimensionalArrayMain {
    public static void main(String[] args) {

        //Инициализация одномерного массива с предустановленными значениями
        int[] array = new int[]{1,2,3};

        //Инициализация двухмерного массива с предустановленными значениями
        int[][] matrix = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //Алгоритмическая инициализация двухмерного массива
        int dimensionalInVar = 3;
        int[][] matrix2 = new int[3][dimensionalInVar];
        //Внешний цикл осуществляет перебор массива массивов и выбор одного из них
        for (int i = 0; i < matrix2.length; i++) {
            //Проход по элементам одного из массивов двухмерного массива
            for (int j = 0; j <matrix2[i].length; j++ ) {
                matrix2[i][j] = j * i;
            }
        }

        //Рваные массивы
        int[][] matrix3 = new int[4][];
        for (int i = 0; i < matrix3.length; i++) {
            matrix3[i] = new int[i + 1];
            //Проход по элементам одного из массивов двухмерного массива
            for (int j = 0; j <matrix3[i].length; j++ ) {
                matrix3[i][j] = j * i;
            }
        }

        Printer.print(matrix);
        Printer.print(matrix2);
        Printer.print(matrix3);
    }
}
