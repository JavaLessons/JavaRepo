package homework4_Matrix;

public class MatrixIncomplete extends Matrix {

    /**
     * Конструктор создания матрицы из двухмерного массива
     * @param data двухмерный массив, на основе которого создаётся матрица
     */
    public MatrixIncomplete(float[][] data) {
        super(data);

        int colsNumber = 0;
        for (int i = 0; i < data.length; i++) {
            setDataRow(i, data[i]);
            if (data[i].length > colsNumber) {
                colsNumber = data[i].length;
            }
        }

        setRowsNumber(data.length);
        setColsNumber(colsNumber);
    }

    /**
     * Конструктор для создания матрицы с заданием количество строк
     * @param rowsNumber
     */
    public MatrixIncomplete(int rowsNumber) {
        super(new float[rowsNumber][]);
        this.setRowsNumber(rowsNumber);
        this.setColsNumber(0);
    }

    @Override
    public float getValue(int row, int col) {
        float result;
        try {
            result = getDataValue(row, col);
        } catch (ArrayIndexOutOfBoundsException e) {
            result = 0;
        }

        return result;
    }
    @Override
    public void setValue(int row, int col, float value) {
        try {
            setDataValue(row, col, value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Попытка установить значение за пределы матрицы");
        }
    }

    @Override
    public MatrixIncomplete add(Matrix m2) {
        float sumResultArray[][] = addOneMatrixToAnother(this, m2);
        MatrixIncomplete result = new MatrixIncomplete(sumResultArray);
        return result;
    }

    @Override
    public MatrixIncomplete multiply(Matrix m2) {
        float multiResultArray[][] = multiplyOneMatrixByAnother(this, m2);
        MatrixIncomplete result = new MatrixIncomplete(multiResultArray);
        return result;
    }
}
