package avlyakulov.timur.chapter_2.matrix;

import java.util.Scanner;

//Найти и вывести наибольшее число возрастающих\убывающих элементов матрицы, идущих подряд. todo (очень близок к завершению, доделать через время)
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

        int numFrequency = 0;
        int[] arrFreq = new int[n];
        System.out.println("Matrix: ");
        OutputMatrix.printMatrix(matrix);
        for (int j = 0; j < n; ++j) {
            numFrequency = 0;
            for (int x = 0; x < n - 1; ++x) {
                if (matrix[j][x] < matrix[j][x + 1]) {
                    ++numFrequency;
                } else {
                    if (numFrequency > arrFreq[j])
                        arrFreq[j] = numFrequency;
                    numFrequency = 0;
                }
            }
        }
        System.out.println("Array of frequency numbers");
        for (int i : arrFreq)
            System.out.print(i + " ");
        int max = arrFreq[0];
        int position = 0;
        for (int i = 1; i < arrFreq.length; ++i) {
            if (arrFreq[i] > max) {
                max = arrFreq[i];
                position = i;
            }
        }
        System.out.println();
        int[] mas = new int[numFrequency + 1];
        System.out.println(mas.length);
        System.out.println("Max column of our arrFreq " + max + " Index of this array " + position);
        int counter = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (counter == mas.length)
                break;
            System.out.print(matrix[position][i] + " ");
            if (matrix[position][i] < matrix[position][i + 1]) {
                mas[counter] = matrix[position][i];
                ++counter;
            }
        }
        for (int i : mas)
            System.out.print(i + " ");
    }
}