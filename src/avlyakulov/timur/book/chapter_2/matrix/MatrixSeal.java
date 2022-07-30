package avlyakulov.timur.book.chapter_2.matrix;

//Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями
public class MatrixSeal {
    public static void findDeleteZeroes() {
        int[][] matrix = FillMatrix.fillMatrixWithZeroes();
        OutputMatrix.printMatrix(matrix);
        int len = matrix.length;
        int counter = 0;
        for (int k = 0; k < matrix.length; ++k)
            for (int i = 0; i < matrix.length; ++i)
                for (int j = 0; j < matrix.length; ++j) {
                    if (matrix[i][j] == 0) {
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
                if (matrix[i][j] == 0) {
                    ++counter;
                    break;
                }
        System.out.println("Количество перестановок " + counter);
        int[][] temp = new int[matrix.length - counter][matrix.length];
        for (int i = 0; i < matrix.length - counter; ++i)
            for (int j = 0; j < matrix.length; ++j)
                temp[i][j] = matrix[i][j];
        matrix = temp;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < len; ++j)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
