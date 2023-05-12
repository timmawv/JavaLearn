package avlyakulov.timur.epam.chapter_2.matrix;

import java.util.Scanner;

public class FillMatrix {
    public static int[][] fillMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of matrix a[n][n]");
        System.out.print("Enter n ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = 10 + (int) (Math.random() * 20);
            }
        return matrix;
    }

    public static int[][] fillMatrixWithZeroes() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of matrix a[n][n]");
        System.out.print("Enter n ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = (int) (Math.random() * 5);
            }
        return matrix;
    }

    public static double[][] fillMatrixDouble() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of matrix a[n][n]");
        System.out.print("Enter n ");
        int n = in.nextInt();
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = 10 + (int) (Math.random() * 20);
            }
        return matrix;
    }
}
