package avlyakulov.timur.epam.chapter_2.matrix;

import java.util.Scanner;

//заполнить матрицу как спираль todo Доделать поворот по спирали
public class OutputSpiralMatrix {
    public void fillMatrixSpiral() {
        System.out.println("Enter length of matrix a[n][n]");
        System.out.print("Enter n ");
        int n = new Scanner(System.in).nextInt();
        int[][] matrix = new int[n][n];
        int number = 1;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = number;
                ++number;
            }

        }
        OutputMatrix.printMatrix(matrix);
    }
}