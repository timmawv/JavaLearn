package avlyakulov.timur.epam.chapter_2.matrix;

//Повернуть матрицу на 90, 180 или 270 градусов против часовой стрелки TODO(доделать)
public class TurnMatrix {
    public static void turnMatrix() {
        int[][] matrix = FillMatrix.fillMatrix();
        OutputMatrix.printMatrix(matrix);
    }
}

