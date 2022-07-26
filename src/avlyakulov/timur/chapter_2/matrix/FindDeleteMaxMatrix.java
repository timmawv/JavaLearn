package avlyakulov.timur.chapter_2.matrix;

//Найти максимальный элемент(ы) в матрице и удалить из матрицы все строки и столбцы, его содержащие
public class FindDeleteMaxMatrix {
    public static void findDeleteMax() {
        int[][] matrix = FillMatrix.fillMatrix();
        OutputMatrix.printMatrix(matrix);
        int max = 0;
        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix.length; ++j) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        System.out.println("Максимальный элемент матрицы " + max);
        int counter = 0;
        for (int k = 0; k < matrix.length; ++k)
            for (int i = 0; i < matrix.length; ++i)
                for (int j = 0; j < matrix.length; ++j) {
                    if (matrix[i][j] == max) {
                        if (i == matrix.length - 1) {
                            break;
                        } else {
                            for (int x = i; x < matrix.length - 1; ++x) {
                                int[] c = matrix[x];
                                matrix[x] = matrix[x + 1];
                                matrix[x + 1] = c;
                            }
                        }
                    }
                }
        OutputMatrix.printMatrix(matrix);
        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix.length; ++j)
                if (matrix[i][j] == max)
                    ++counter;
        System.out.println("Количество перестановок " + counter);
        int [] [] temp = new int[matrix.length - counter] [matrix.length];
        for (int i = 0; i < matrix.length - counter; ++i)
            for (int j = 0; j < matrix.length; ++j)
                temp[i][j] = matrix[i][j];
        matrix = temp;
        OutputMatrix.printMatrix(matrix);
    }
}