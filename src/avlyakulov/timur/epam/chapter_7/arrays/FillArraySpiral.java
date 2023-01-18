package avlyakulov.timur.epam.chapter_7.arrays;

/*
Вывести массив NxN, заполненный по спирали в порядке возрастания.
 */
public class FillArraySpiral {
    //todo доделать нормальный цикл для заполнения спиралью
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length; ++j) {
                System.out.printf("%2d\t", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*int n = (int) (Math.random() * 5 + 1);*/
        int n = 4;
        int count = 1;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[0][i] = count;
            ++count;
        }
        for (int i = 1; i < n; ++i) {
            matrix[i][3] = count;
            ++count;
        }
        for (int i = n - 2; i >= 0; --i) {
            matrix[3][i] = count;
            ++count;
        }
        for (int i = n - 2; i >= 1; --i) {
            matrix[i][0] = count;
            ++count;
        }
        printMatrix(matrix);
    }
}