package homework4_Matrix;

public abstract class Matrix {
    private float data[][];
    private int rowsNumber;
    private int colsNumber;

    /**
     * Конструктор создания матрицы из двухмерного массива
     * @param data двухмерный массив, на основе которого создаётся матрица
     */
    public Matrix(float data[][]) {
        //Если массив не задан кидаем исключение
        if (data == null) {
            throw new NullPointerException();
        }

        this.data = data;
    }

    /**
     * Получить количество строк в матрице
     * @return количество строк
     */
    public int getRowsNumber() {
        return rowsNumber;
    }

    /**
     * Задать количество строк в матрице.
     * @param rowsNumber количество строк
     */
    protected void setRowsNumber(int rowsNumber) {
        this.rowsNumber = rowsNumber;
    }

    /**
     * Получить количество столбцов в матрице
     * @return количество столбцов
     */
    public int getColsNumber() {
        return colsNumber;
    }

    /**
     * Задать количество столбцов в матрице
     * @param colsNumber
     */
    protected void setColsNumber(int colsNumber) {
        this.colsNumber = colsNumber;
    }

    /**
     * Задать строку в матрице в виде массива
     * @param row номер строки
     * @param rowArray задаваемая строка
     */
    protected void setDataRow(int row, float[] rowArray) {
        data[row] = rowArray;
    }

    /**
     * Возвращает значение из двумерного массива по номеру строки и столбца
     * @param row номер строки
     * @param col номер столбца
     * @return возвращаемое значение
     */
    protected float getDataValue(int row, int col) {
        return data[row][col];
    }

    /**
     * Задать значение в двумерном массиве по номеру строки и столбца
     * @param row номер строки
     * @param col номер столбца
     * @param value значение
     */
    protected void setDataValue(int row, int col, float value) {
        data[row][col] = value;
    }

    /**
     * Получить значение из матрицы по номеру строки и столбца
     * @param row номер строки
     * @param col номер столбца
     * @return возвращаемое значение
     */
    public abstract float getValue(int row, int col);

    /**
     * Задание значения в матрице по номеру строки и столбца
     * @param row номер строки
     * @param col номер столбца
     * @param value задаваемое значение
     */
    public abstract void setValue(int row, int col, float value);

    /**
     * Умножить текущую матрицу на матрицу передаваемую в параметру
     * @param m2 матрица, на которую идёт умножение
     * @return матрица получившаяся в результате
     */
    public abstract Matrix multiply(Matrix m2);

    /**
     * Суммировать текущую матрицу с матрицей, переданной в параметре
     * @param m2 матрица для сложения
     * @return результат в виде новой матрицы
     */
    public abstract Matrix add(Matrix m2);

    /**
     * Проверка на возможность сложения двух матриц
     * @param m1 первая матрица
     * @param m2 вторая матрица
     * @return возвращает true если сложение возможно и false в обратном случае
     */
    static private boolean canAddM1ToM2(Matrix m1, Matrix m2) {
        if (m1.getColsNumber() != m2.getColsNumber()) {
            return false;
        }
        if (m1.getRowsNumber() != m2.getRowsNumber()) {
            return false;
        }

        return true;
    }

    /**
     * Проверка на возможность умножения двух матриц. Важен порядок матриц
     * @param m1 первая матрица
     * @param m2 вторая матрица
     * @return возвращает true если умножение возможно и false в обратном случае
     */
    static private boolean canMultiplyM1ByM2(Matrix m1, Matrix m2) {
        if (m1.getColsNumber() != m2.getRowsNumber()) {
            return false;
        }

        return true;
    }

    /**
     * Метод класса для сложения двух объектов типа Matrix.
     * @param m1 первая матрица
     * @param m2 вторая матрица
     * @return результат в виде двухмерного массива
     */
    static protected float[][] addOneMatrixToAnother(Matrix m1, Matrix m2) {
        if (!canAddM1ToM2(m1, m2)) {
            return null;
        }

        float res[][] = new float[m1.getRowsNumber()][m1.getColsNumber()];

        for (int rowNum = 0; rowNum < m1.getRowsNumber(); rowNum++) {
            for (int colNum = 0; colNum < m1.getColsNumber(); colNum++) {
                res[rowNum][colNum] = m1.getValue(rowNum, colNum) + m2.getValue(rowNum, colNum);
            }
        }

        return res;
    }

    /**
     * Метод класса для умножения двух объектов типа Matrix.
     * @param m1 первая матрица
     * @param m2 вторая матрица
     * @return результат в виде двухмерного массива
     */
    static protected float[][] multiplyOneMatrixByAnother(Matrix m1, Matrix m2) {
        if (!canMultiplyM1ByM2(m1, m2)) {
            return null;
        }

        float res[][] = new float[m1.getRowsNumber()][m2.getColsNumber()];

        for (int rowNum = 0; rowNum < m1.getRowsNumber(); rowNum++) {
            for (int colNum = 0; colNum < m2.getColsNumber(); colNum++) {
                res[rowNum][colNum] = getMultiplySumValue(m1, m2, rowNum, colNum);
            }
        }

        return res;
    }

    /**
     * Вычисление элемента для матрицы при умножении двух матриц по заданным строке и столбцу
     * @param m1 первая матрица
     * @param m2 вторая матрица
     * @param rowNum строка в новой матрице
     * @param colNum столбец в новой матрице
     * @return результат вычислений
     */
    static private float getMultiplySumValue(Matrix m1, Matrix m2, int rowNum, int colNum) {
        float res = 0;
        for (int sumNum = 0; sumNum < m1.getColsNumber(); sumNum++) {
            res += ( m1.getValue(rowNum, sumNum) * m2.getValue(sumNum, colNum) );
        }

        return res;
    }

    /**
     * Вывод матрицы на экран
     */
    public void print() {
        System.out.println();
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                System.out.printf("%4.0f",data[row][col]);
            }
            System.out.println();
        }
    }
}
