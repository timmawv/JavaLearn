package avlyakulov.timur.tp;

import java.text.DecimalFormat;
import java.util.Random;

public class MatrixGross {


    public static void main(String[] args) {
        int[][] matrix = new int[32][32];
        Random random = new Random();
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 32; j++) {
                matrix[i][j] = (int) (Math.random() * 9 + 1);
                DecimalFormat decimalFormat = new DecimalFormat("#.###");
                String result = decimalFormat.format(matrix[i][j]);
                System.out.print(result + " ");

            }
            System.out.println();
        }
    }
}