package avlyakulov.timur.chapter_2.matrix;

import java.util.Scanner;

//Округлить все элементы матрицы до целого числа
public class MatrixElementRounding {
    public static void roundElements() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of matrix a[n][n]");
        System.out.print("Enter n ");
        int n = in.nextInt();
        double[][] matrix = new double[n][n];
        int [][] matrixInt = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = Math.random() * 20;
            }
        System.out.println("Матрица до округления");
        OutputMatrix.printMatrix(matrix);
        System.out.println("Матрица после округления");
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                matrixInt[i][j] =(int) matrix[i][j];
            }
        OutputMatrix.printMatrix(matrixInt);
    }
}
