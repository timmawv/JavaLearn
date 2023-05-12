package avlyakulov.timur.epam.chapter_10.variant_c.task_15;

import avlyakulov.timur.epam.chapter_10.variant_c.task_14.GetMatrixFromFile;
import avlyakulov.timur.epam.chapter_2.matrix.OutputMatrix;
import avlyakulov.timur.epam.chapter_2.matrix.TurnerMatrix;

import java.io.File;
/*
Входной файл хранит квадратную матрицу по принципу: строка представ-
ляет собой число. Определить размерность. Построить двумерный массив,
содержащий матрицу. Вывести исходную матрицу и результат ее поворота
на 90˚ по часовой стрелке.
 */
public class TurnMatrix {
    public static void main(String[] args) {
        File file = new File("src/avlyakulov/timur/epam/chapter_10/variant_c/task_14/matrix.txt");
        int[][] matrix = new GetMatrixFromFile().getMatrixFromFile(file);
        OutputMatrix.printMatrix(matrix);
        TurnerMatrix.turnMatrixWithParameters(matrix,90);
    }
}