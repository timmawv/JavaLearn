package avlyakulov.timur.chapter_2.matrix;

//Найти максимальный элемент(ы) в матрице и удалить из матрицы все строки и столбцы, его содержащие.
public class FindDeleteMaxMatrix {
    public static void findDeleteMax () {
        int[][] matrix = FillMatrix.fillMatrix();
        OutputMatrix.printMatrix(matrix);
        int max = 0;
        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix.length; ++j) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        System.out.println("Максимальный элемент матрицы " + max);
        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix.length; ++j) {
                if (matrix[i][j] == max && i != matrix.length - 1)
                    matrix[i] = matrix[i + 1];
            }
        OutputMatrix.printMatrix(matrix);
    }
}