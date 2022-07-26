package avlyakulov.timur.chapter_2.matrix;

//Вычислить определитель матрицы todo (for 3 and more)

import java.util.Scanner;

public class MatrixDeterminant {
    public static void countDeterminant() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of matrix a[n][n]");
        System.out.print("Enter n ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        int[][] matrixIncr = new int[n][2 * n - 1];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = 10 + (int) (Math.random() * 20);
            }
        OutputMatrix.printMatrix(matrix);
        int det = 0;
        if (n == 2) {
            for (int i = 0; i < 1; ++i)
                det = matrix[i][i] * matrix[i + 1][i + 1] - matrix[i + 1][i] * matrix[i][i + 1];
            System.out.println("Определитель матрицы " + det);
        } else {
            for (int i = 0; i < n ; ++i) {
                System.arraycopy(matrix[i], 0, matrixIncr[i], 0, n);
                System.arraycopy(matrix[i], 0, matrixIncr[i], n, n - 1);
            }
        }
    }
}