package avlyakulov.timur.epam.chapter_2.matrix;


import java.util.Scanner;

//Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
public class OutputSnakeMatrix {
    public int[][] fillMatrix () {
        System.out.println("Enter length of matrix a[n][n]");
        System.out.print("Enter n ");
        int n = new Scanner(System.in).nextInt();
        int[][] matrix = new int[n][n];
        int number = 1;
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = number;
                ++number;
            }
        return matrix;
    }
    public static void printSnakeMatrix() {
        int[][] matrix = new OutputSnakeMatrix().fillMatrix();
        System.out.println("Матрица в виде змейки");
        for (int i = 0; i < matrix.length; ++i) {
            if (i % 2 == 0)
                for (int j = 0; j < matrix.length; ++j) {
                    System.out.print(matrix[i][j] + " ");
                }
            else {
                for (int j = matrix.length - 1; j >= 0; --j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSnakeMatrix();
    }
}