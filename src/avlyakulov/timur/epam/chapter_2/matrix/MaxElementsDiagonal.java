package avlyakulov.timur.epam.chapter_2.matrix;

//Путем перестановки элементов квадратной вещественной матрицы добиться того, чтобы ее максимальный элемент находился в левом верхнем углу, сле-
//дующий по величине — в позиции (2, 2), следующий по величине — в позиции (3, 3) и т.д., заполнив таким образом всю главную диагональ.
public class MaxElementsDiagonal {
    public static void putMaxElementsDiagonal() {
        int[][] matrix = FillMatrix.fillMatrix();
        OutputMatrix.printMatrix(matrix);
        int[] maxElements = new int[matrix.length];
        int max;
        for (int i = 0; i < matrix.length; ++i){
            max = 0;
            for (int j = 0; j < matrix.length; ++j) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
            maxElements[i] = max;
        }

        for (int i : maxElements)
            System.out.print(i + " ");
        System.out.println();
        System.out.println();
        int i = 0;
        for (int j = 0; j < matrix.length; ++j) {
            matrix[i][j] = maxElements[j];
            ++i;
        }
        OutputMatrix.printMatrix(matrix);
    }
}