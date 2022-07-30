package avlyakulov.timur.book.chapter_2.matrix;

import java.util.Scanner;

//В матрице найти минимальный элемент и переместить его на место заданного элемента путем перестановки строк и столбцов todo (добавить переставление не только строк а и элементов)
public class FindMinToReplace {
    public static void findAndReplaceMinElement() {
        int[][] matrix = FillMatrix.fillMatrix();
        OutputMatrix.printMatrix(matrix);
        int min = matrix[0][0];
        int minI = 0;
        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix.length; ++j)
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minI = i;
                }
        System.out.println("Min Element " + min + " " + minI);
        System.out.print("Выберите элемент который хотите заменить с минимальным ");
        Scanner in = new Scanner(System.in);
        int elementI = in.nextInt();
        int [] c = matrix[minI];
        matrix[minI] = matrix[elementI];
        matrix[elementI] = c;
        OutputMatrix.printMatrix(matrix);
    }
}