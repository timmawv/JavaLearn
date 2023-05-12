package avlyakulov.timur.epam.chapter_2.matrix;

//Вычислить определитель матрицы todo (for 3 and more)

public class MatrixDeterminant {
    public static void countDeterminant() {
        int[][] matrix = FillMatrix.fillMatrix();
        int[][] matrixIncr = new int[matrix.length][2 * matrix.length - 1];
        OutputMatrix.printMatrix(matrix);
        int det = 0;
        if (matrix.length == 2) {
            for (int i = 0; i < 1; ++i)
                det = matrix[i][i] * matrix[i + 1][i + 1] - matrix[i + 1][i] * matrix[i][i + 1];
            System.out.println("Определитель матрицы " + det);
        } else {
            for (int i = 0; i < matrix.length ; ++i) {
                System.arraycopy(matrix[i], 0, matrixIncr[i], 0, matrix.length);
                System.arraycopy(matrix[i], 0, matrixIncr[i], matrix.length, matrix.length - 1);
            }
        }
    }
}