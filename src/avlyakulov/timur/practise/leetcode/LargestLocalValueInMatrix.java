package avlyakulov.timur.practise.leetcode;

import avlyakulov.timur.epam.chapter_2.matrix.OutputMatrix;

public class LargestLocalValueInMatrix {
    //   3 3 3 9
    //   1 2 5 7
    //   1 1 4 6
    //   1 1 4 5
    //   answer:
    //   5 9
    //   5 7
    public static int[][] largestLocal(int[][] grid) {
        int[][] matrix = new int[grid.length - 2][grid.length - 2];
        int length = matrix.length;

        return matrix;
    }

    public static void main(String[] args) {
        int[][] grid = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        OutputMatrix.printMatrix(grid);
        largestLocal(grid);
    }
}