package homework4_Matrix;

public class MatrixMain {
    public static void main(String[] args) {

        float[][] array1 = new float[][]{
                {1, 2, 3, 2, 1},
                {4, 5, 6, 5, 4},
                {7, 8, 9, 8, 7}};

        float[][] array2 = new float[][]{
                {1, 2, 3, 2},
                {4, 5, 6, 5},
                {7, 8, 9, 8},
                {7, 8, 9, 8},
                {7, 8, 9, 8}};

        MatrixRectangular matrixRect1 = new MatrixRectangular(array1);
        MatrixRectangular matrixRect2 = new MatrixRectangular(array2);

        matrixRect1.print();
        matrixRect2.print();

        MatrixRectangular sumMatrix = matrixRect1.add(matrixRect1);
        sumMatrix.print();
        sumMatrix = matrixRect2.add(matrixRect2);
        sumMatrix.print();


        MatrixRectangular multMatrix = matrixRect1.multiply(matrixRect2);
        multMatrix.print();



        float[][] array3 = new float[][]{
                {1, 2, 3},
                {4, 5, 6, 5, 4},
                {7, 8}};

        float[][] array4 = new float[][]{
                {1},
                {4, 5, 6, 5},
                {7, 8},
                {7, 8, 9, 8},
                {7, 8, 9}};

        MatrixIncomplete matrixIncomplete1 = new MatrixIncomplete(array3);
        MatrixIncomplete matrixIncomplete2 = new MatrixIncomplete(array4);
        matrixIncomplete1.print();
        matrixIncomplete2.print();

        MatrixIncomplete sumMatrix2 = matrixIncomplete1.add(matrixIncomplete1);
        sumMatrix2.print();
        sumMatrix2 = matrixIncomplete2.add(matrixIncomplete2);
        sumMatrix2.print();


        MatrixIncomplete multMatrix2 = matrixIncomplete1.multiply(matrixIncomplete2);
        multMatrix2.print();
    }

}
