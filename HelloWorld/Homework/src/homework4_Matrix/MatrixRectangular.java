package homework4_Matrix;

public class MatrixRectangular extends Matrix {

    /**
     * Конструктор создания матрицы из двухмерного массива
     * @param data двухмерный массив, на основе которого создаётся матрица
     */
    public MatrixRectangular(float[][] data) {
        super(data);

        if (!isMatrixRectangular(data)) {
            throw new NullPointerException();
        }

        this.setRowsNumber(data.length);
        this.setColsNumber(data[0].length);
    }

    /**
     * Конструктор для создания матрицы с указанием количества строк и столбцов
     * @param rowsNumber количество строк
     * @param colsNumber количество столбцов
     */
    public MatrixRectangular(int rowsNumber, int colsNumber) {
        super(new float[rowsNumber][colsNumber]);
        this.setRowsNumber(rowsNumber);
        this.setColsNumber(colsNumber);
    }

    /**
     * Проверка двухмерного массива одинаковую длину строк
     * @param data двухмерный массив
     * @return возвращает true если все строки одинаковой длины и false в обратном случае
     */
    private boolean isMatrixRectangular(float[][] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i].length != data[i-1].length ) {
                return false;
            }
        }

        return true;
    }

    @Override
    public float getValue(int row, int col) {
        return super.getDataValue(row, col);
    }

    @Override
    public void setValue(int row, int col, float value) {
        super.setDataValue(row, col, value);
    }

    @Override
    public MatrixRectangular add(Matrix m2) {
        float sumResultArray[][] = addOneMatrixToAnother(this, m2);
        MatrixRectangular result = new MatrixRectangular(sumResultArray);
        return result;
    }

    @Override
    public MatrixRectangular multiply(Matrix m2) {
        float multiResultArray[][] = multiplyOneMatrixByAnother(this, m2);
        MatrixRectangular result = new MatrixRectangular(multiResultArray);
        return result;
    }
}
