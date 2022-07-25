package avlyakulov.timur.chapter_2.matrix;

import java.util.Scanner;

//Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.
public class PositiveMatrix {
    public static void findElementsBetweenPositive() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of matrix a[n][n]");
        System.out.print("Enter n ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = -10 + (int) (Math.random() * 20);
            }
        System.out.println("Our matrix");
        OutputMatrix.printMatrix(matrix);
        int sum;
        for (int i = 0; i < n; ++i) {
            sum = 0;
            for (int j = 0; j < n - 1; ++j) {
                int next = j + 1;
                if (matrix[i][j] > 0 && matrix[i][next] < 0) {
                    while (matrix[i][next] < 0 && next < n - 1) {
                        sum += matrix[i][next];
                        ++next;
                    }
                    break;
                }
            }
            System.out.println("Сума элементов строчки " + sum);
        }

    }
}