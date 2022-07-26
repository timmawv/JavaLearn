package avlyakulov.timur.chapter_2.matrix;

//Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).

import java.util.Scanner;

public class MatrixOrderLine {
    public static void orderLineMatrix() {
        int[][] matrix = FillMatrix.fillMatrix();
        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix.length; ++j) {
                matrix[i][j] = (int) (Math.random() * 20);
            }
        System.out.println("Our matrix");
        OutputMatrix.printMatrix(matrix);
        for (int k = 0; k < matrix.length; ++k)
            for (int i = 0; i < matrix.length; ++i)
                for (int j = 0; j < matrix.length - 1; ++j) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        int c = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = c;
                    }
                }
        System.out.println("Our matrix after sort");
        OutputMatrix.printMatrix(matrix);
    }
}