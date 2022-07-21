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
        int begin;
        int end;
        int counter = 0;
        int[] masBegEnd = new int[2 * n];
        int counterMas = 0;
        for (int i = 0; i < n; ++i) {
            begin = 0;
            end = 0;
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] > 0 && counter == 0) {
                    begin = j;
                    masBegEnd[counterMas] = begin;
                    ++counterMas;
                    ++counter;
                    continue;
                }
                if (matrix[i][j] > 0 && counter == 1) {
                    end = j;
                    masBegEnd[counterMas] = end;
                    ++counterMas;
                    counter = 0;
                    break;
                }
            }
        }
        System.out.println("MasBegEnd");
        for (int i : masBegEnd)
            System.out.print(i + " ");
    }
}