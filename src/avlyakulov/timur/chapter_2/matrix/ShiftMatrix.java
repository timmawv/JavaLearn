package avlyakulov.timur.chapter_2.matrix;

import java.util.Scanner;

//Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
public class ShiftMatrix {
    public static void shiftMatrix() {
        Scanner in = new Scanner(System.in);
        int[][] matrix = FillMatrix.fillMatrix();
        System.out.println("Our matrix");
        OutputMatrix.printMatrix(matrix);
        System.out.println("Choose shift: right or left or up or down");
        String chooseWay = in.next();
        switch (chooseWay) {
            case "left" -> shiftLeft(matrix);
            case "right" -> shiftRight(matrix);
            case "up" -> shiftUp(matrix);
            case "down" -> shiftDown(matrix);
            default -> System.out.println("You put wrong word");
        }
        System.out.println("Matrix after shift");
        OutputMatrix.printMatrix(matrix);
    }

    public static void shiftRight(int[][] arr) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of position to shift ");
        int num = in.nextInt();
        for (int i = 0; i < num; ++i) // благодаря этому циклу осущетвляется нужное количество сдвигов, без него сдвиг всегда будет на 1 элемент
            for (int x = 0; x < arr.length; ++x)
                for (int j = arr.length - 1; j > 0; --j) {
                    int c = arr[x][j];
                    arr[x][j] = arr[x][j - 1];
                    arr[x][j - 1] = c;
                }
    }

    public static void shiftLeft(int[][] arr) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of position to shift ");
        int num = in.nextInt();
        for (int i = 0; i < num; ++i) // благодаря этому циклу осущетвляется нужное количество сдвигов, без него сдвиг всегда будет на 1 элемент
            for (int x = 0; x < arr.length; ++x)
                for (int j = 0; j < arr.length - 1; ++j) {
                    int c = arr[x][j];
                    arr[x][j] = arr[x][j + 1];
                    arr[x][j + 1] = c;
                }
    }

    public static void shiftUp(int[][] arr) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of position to shift ");
        int num = in.nextInt();
        for (int i = 0; i < num; ++i) // благодаря этому циклу осущетвляется нужное количество сдвигов, без него сдвиг всегда будет на 1 элемент
            for (int x = 0; x < arr.length - 1; ++x) {
                int[] c = arr[x];
                arr[x] = arr[x + 1];
                arr[x + 1] = c;
            }
    }
    public static void shiftDown(int[][] arr) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of position to shift ");
        int num = in.nextInt();
        for (int i = 0; i < num; ++i) // благодаря этому циклу осущетвляется нужное количество сдвигов, без него сдвиг всегда будет на 1 элемент
            for (int x = arr.length - 1; x > 0; --x) {
                int[] c = arr[x];
                arr[x] = arr[x - 1];
                arr[x - 1] = c;
            }
    }
}