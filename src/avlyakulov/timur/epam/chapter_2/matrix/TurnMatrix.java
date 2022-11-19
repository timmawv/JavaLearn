package avlyakulov.timur.epam.chapter_2.matrix;

import java.util.Arrays;
import java.util.Scanner;

//Повернуть матрицу на 90, 180 или 270 градусов против часовой стрелки //TODO(доделать) (что то вообще анриал сделать)
public class TurnMatrix {
    public static void turnMatrix() {
        int[][] matrix = FillMatrix.fillMatrix();
        OutputMatrix.printMatrix(matrix);
        System.out.println("Enter round to turn 90,180,270");
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        turnMatrixWithParameters(matrix,round);
        sc.close();
    }

    public static void turnMatrixWithParameters(int[][] matrix, int round) {
        switch (round) {
            case 90 -> {
                int [] mas = new int[matrix.length];
                for (int i = 0; i < matrix.length; ++i) {
                    mas[i] = matrix[0][i];
                }
                System.out.println(Arrays.toString(mas));
            }
            case 180 -> {

            }
            case 270 -> {}
            default -> System.out.println("You enter the wrong value!");
        }
        OutputMatrix.printMatrix(matrix);
    }
}

