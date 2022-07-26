package avlyakulov.timur.chapter_2.matrix;

import java.util.Scanner;

//Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.
public class PositiveMatrix {
    public static void findElementsBetweenPositive() {
        int[][] matrix = FillMatrix.fillMatrix();
        System.out.println("Our matrix");
        OutputMatrix.printMatrix(matrix);
        int sum;
        for (int i = 0; i < matrix.length; ++i) {
            sum = 0;
            for (int j = 0; j < matrix.length - 1; ++j) {
                int next = j + 1;
                if (matrix[i][j] > 0 && matrix[i][next] < 0) {
                    while (matrix[i][next] < 0 && next < matrix.length - 1) {
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