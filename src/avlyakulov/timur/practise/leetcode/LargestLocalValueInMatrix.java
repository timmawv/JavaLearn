package avlyakulov.timur.practise.leetcode;

import avlyakulov.timur.epam.chapter_2.matrix.OutputMatrix;

public class LargestLocalValueInMatrix {
    public static int[][] largestLocal(int[][] grid) {
        int[][] matrix = new int[grid.length - 2][grid.length - 2];

        return matrix;
    }

    public static void main(String[] args) {
        int[][] grid = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        OutputMatrix.printMatrix(grid);
        largestLocal(grid);
    }
}