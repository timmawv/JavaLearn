package avlyakulov.timur.chapter_2.matrix;

import java.util.Scanner;

//Повернуть матрицу на 90, 180 или 270 градусов против часовой стрелки TODO(доделать)
public class TurnMatrix {
    public static void turnMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of matrix a[n][n]");
        System.out.print("Enter n ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = 10 + (int) (Math.random() * 20);
            }
        OutputMatrix.printMatrix(matrix);
    }
}

