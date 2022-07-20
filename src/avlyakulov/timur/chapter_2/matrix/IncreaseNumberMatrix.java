package avlyakulov.timur.chapter_2.matrix;

import java.util.Scanner;

//Найти и вывести наибольшее число возрастающих\убывающих элементов матрицы, идущих подряд.
public class IncreaseNumberMatrix {
    public static void findFrequencyNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of matrix a[n][n]");
        System.out.print("Enter n ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = (int) (Math.random() * 20);
            }
        System.out.println("Matrix: ");
        OutputMatrix.printMatrix(matrix);
    }
}