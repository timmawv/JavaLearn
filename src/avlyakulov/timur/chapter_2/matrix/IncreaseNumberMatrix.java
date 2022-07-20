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
        int begin;
        int end;
        int numFrequency;
        int [] arrFreq = new int[n];
        System.out.println("Matrix: ");
        OutputMatrix.printMatrix(matrix);
            for (int j = 0; j < n; ++j) {
                numFrequency = 0;
                for (int x = 0; x < n - 1; ++x) {
                    if (matrix[j][x] < matrix[j][x + 1])
                        ++numFrequency;
                    else {
                        end = x;
                        numFrequency = 0;
                    }
                }
                arrFreq[j] = numFrequency;
            }
        for (int i : arrFreq)
            System.out.print(i + " ");
    }
}