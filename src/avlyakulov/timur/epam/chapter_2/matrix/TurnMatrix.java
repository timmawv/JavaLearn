package avlyakulov.timur.epam.chapter_2.matrix;

import java.util.Scanner;

//Повернуть матрицу на 90, 180 или 270 градусов против часовой стрелки //TODO(доделать)
public class TurnMatrix {
    public static void turnMatrix() {
        int[][] matrix = FillMatrix.fillMatrix();
        OutputMatrix.printMatrix(matrix);

        System.out.println("Enter round to turn 90,180,270");
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();


        sc.close();
    }

    public void turnMatrixWithParameters(int[][] matrix, int round) {
        switch (round) {
            case 90 -> {

            }
            case 180 -> {}
            case 270 -> {}
            default -> System.out.println("You enter the wrong value!");
        }
    }
}

