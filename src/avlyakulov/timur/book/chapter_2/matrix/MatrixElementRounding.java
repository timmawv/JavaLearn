package avlyakulov.timur.book.chapter_2.matrix;

//Округлить все элементы матрицы до целого числа
public class MatrixElementRounding {
    public static void roundElements() {
        double[][] matrix = FillMatrix.fillMatrixDouble();
        int[][] matrixInt = new int [matrix.length][matrix.length];
        System.out.println("Матрица до округления");
        OutputMatrix.printMatrix(matrix);
        System.out.println("Матрица после округления");
        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix.length; ++j) {
                matrixInt[i][j] = (int) matrix[i][j];
            }
        OutputMatrix.printMatrix(matrixInt);
    }
}
