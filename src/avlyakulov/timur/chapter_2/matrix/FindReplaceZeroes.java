package avlyakulov.timur.chapter_2.matrix;


//Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
public class FindReplaceZeroes {
    public static void replaceZeroes () {
        int [] [] matrix = FillMatrix.fillMatrixWithZeroes();
        OutputMatrix.printMatrix(matrix);
        for (int x = 0; x < matrix.length; ++x)
            for (int i = 0; i < matrix.length; ++i)
                for (int j = 0; j < matrix.length - 1; ++j)
                    if (matrix[i][j] == 0) {
                        int c = matrix[i][j];
                        matrix[i][j] = matrix[i][j+1];
                        matrix[i][j+1] = c;
                    }
        OutputMatrix.printMatrix(matrix);
    }
}
