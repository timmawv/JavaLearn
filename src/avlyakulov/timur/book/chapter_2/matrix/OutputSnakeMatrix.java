package avlyakulov.timur.book.chapter_2.matrix;


//Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
public class OutputSnakeMatrix {
    public static void printSnakeMatrix() {
        int[][] matrix = FillMatrix.fillMatrix();
        System.out.println("Матрица в виде змейки");
        for (int i = 0; i < matrix.length; ++i) {
            if (i % 2 == 0)
                for (int j = 0; j < matrix.length; ++j) {
                    System.out.print(matrix[i][j] + " ");
                }
            else {
                for (int j = matrix.length - 1; j >= 0; --j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}