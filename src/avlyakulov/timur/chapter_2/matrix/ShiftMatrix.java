package avlyakulov.timur.chapter_2.matrix;

import java.util.Scanner;

//Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз). /todo (доделать сдвиг вверх и вниз)
public class ShiftMatrix {
    public static void shiftMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of matrix a[n][n]");
        System.out.print("Enter n ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = (int) (Math.random() * 20);
            }
        System.out.println("Our matrix");
        OutputMatrix.printMatrix(matrix);
        System.out.println("Choose shift: right or left");
        String chooseWay = in.next();
        switch (chooseWay) {
            case "left" -> shiftLeft(matrix);
            case "right" -> shiftRight(matrix);
            default -> System.out.println("You put wrong word");
        }
        System.out.println("Matrix after shift");
        OutputMatrix.printMatrix(matrix);
    }

    public static void shiftLeft(int[][] arr) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of position to shift ");
        int num = in.nextInt();
        for (int i = 0; i < num; ++i)
            for (int x = 0; x < arr.length; ++x)
                for (int j = 0; j < arr.length - 1; ++j) {
                    int c = arr[x][j];
                    arr[x][j] = arr[x][j + 1];
                    arr[x][j + 1] = c;
                }
    }

    public static void shiftRight(int[][] arr) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of position to shift ");
        int num = in.nextInt();
        for (int i = 0; i < num; ++i)
            for (int x = 0; x < arr.length; ++x)
                for (int j = arr.length - 1; j > 0; --j) {
                    int c = arr[x][j];
                    arr[x][j] = arr[x][j - 1];
                    arr[x][j - 1] = c;
                }
    }
}