package avlyakulov.timur.chapter_2.matrix;

public class OutputMatrix {
    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; ++j) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    public static void printMatrix(double[][] matrix) {
        for (double[] ints : matrix) {
            for (int j = 0; j < matrix.length; ++j) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}