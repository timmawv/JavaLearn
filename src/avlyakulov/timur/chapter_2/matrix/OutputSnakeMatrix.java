package avlyakulov.timur.chapter_2.matrix;


import java.util.Scanner;

//Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
public class OutputSnakeMatrix {
    public static void printSnakeMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину матрицы ");
        int len = in.nextInt();
        int[][] matrix = new int[len][len];
        int counter = 10;
        for (int i = 0; i < len; ++i)
            for (int j = 0; j < len; ++j) {
                matrix[i][j] = counter;
                ++counter;
            }
        System.out.println("Матрица в виде змейки");
        for (int i = 0; i < len; ++i) {
            if (i % 2 == 0)
                for (int j = 0; j < len; ++j) {
                    System.out.print(matrix[i][j] + " ");
                }
            else {
                for (int j = len - 1; j >= 0; --j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}