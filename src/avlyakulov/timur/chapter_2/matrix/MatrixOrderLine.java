package avlyakulov.timur.chapter_2.matrix;

//Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).

import java.util.Scanner;

public class MatrixOrderLine {
    public static void orderLineMatrix () {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of matrix a[n][n]");
        System.out.print("Enter n ");
        int n = in.nextInt();
        int [][] matrix = new int [n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j){
                matrix [i][j] = (int) (Math.random() * 20);
            }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
