package avlyakulov.timur.epam.chapter_2.matrix;

//Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое

public class AverageNumberMatrix {
    public static void findSubtractAverage() {
        int[][] matrix = FillMatrix.fillMatrix();
        OutputMatrix.printMatrix(matrix);
        System.out.println("Matrix.length " + matrix.length);
        int average = 0;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j)
                average += matrix[i][j];
            average /= matrix.length;
            System.out.println("Average of this line " + average);
            for (int j = 0; j < matrix.length; ++j)
                matrix[i][j] -= average;
        }
        OutputMatrix.printMatrix(matrix);
    }
}
