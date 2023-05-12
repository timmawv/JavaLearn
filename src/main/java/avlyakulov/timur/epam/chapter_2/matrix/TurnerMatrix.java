package avlyakulov.timur.epam.chapter_2.matrix;

import java.util.Scanner;

//Повернуть матрицу на 90, 180 или 270 градусов против часовой стрелки
public class TurnerMatrix {
    public static void turnMatrix() {
        int[][] matrix = FillMatrix.fillMatrix();
        OutputMatrix.printMatrix(matrix);
        System.out.println("Enter round to turn 90,180,270");
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        turnMatrixWithParameters(matrix, round);
        sc.close();
    }

    public static void turnMatrixWithParameters(int[][] matrix, int round) {
        int n = matrix.length;
        int[][] turnedMatrix = new int[n][n];
        switch (round) {
            case 90 -> {
                for (int i = n - 1; i >= 0; --i) {
                    for (int j = 0; j < n; ++j) {
                        turnedMatrix[j][i] = matrix[n - i - 1][j];
                    }
                }
                OutputMatrix.printMatrix(turnedMatrix);
            }
            case 180 -> {

            }
            case 270 -> {
            }
            default -> System.out.println("You enter the wrong value!");
        }
    }
}

