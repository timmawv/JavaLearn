package avlyakulov.timur.practise_tasks.leetcode;

public class DiagonalSum {
    public int diagonalSumMatrix(int[][] mat) {
        int sum = 0;
        int counterDiagonal = 0;
        while (counterDiagonal != mat.length) {
            sum += mat[counterDiagonal][counterDiagonal];
            sum += mat[mat.length - counterDiagonal - 1][counterDiagonal];
            ++counterDiagonal;
        }
        return mat.length % 2 == 0 ? sum : (sum - mat[mat.length / 2][mat.length / 2]);
    }

    public static void main(String[] args) {
        int[][] martix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(new DiagonalSum().diagonalSumMatrix(martix1));
    }
}