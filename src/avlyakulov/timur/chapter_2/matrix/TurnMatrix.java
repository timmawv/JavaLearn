package avlyakulov.timur.chapter_2.matrix;

import java.util.Scanner;

//Повернуть матрицу на 90, 180 или 270 градусов против часовой стрелки TODO(доделать)
public class TurnMatrix {
    public static void turnMatrix() {
        int[][] matrix = FillMatrix.fillMatrix();
        OutputMatrix.printMatrix(matrix);
    }
}

