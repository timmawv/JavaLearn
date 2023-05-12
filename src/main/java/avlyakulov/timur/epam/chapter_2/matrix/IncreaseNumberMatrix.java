package avlyakulov.timur.epam.chapter_2.matrix;

//Найти и вывести наибольшее число возрастающих\убывающих элементов матрицы, идущих подряд. todo (выводит 2 из 3 элементов)
public class IncreaseNumberMatrix {
    public static void findFrequencyNumber() {
        int[][] matrix = FillMatrix.fillMatrix();
        OutputMatrix.printMatrix(matrix);
        int numFrequency;
        int end = 0;
        int[] arrFreq = new int[matrix.length];
        for (int i = 0; i < matrix.length; ++i) {
            numFrequency = 0;
            for (int j = 0; j < matrix.length - 1; ++j) {
                if (matrix[i][j] < matrix[i][j + 1]) {
                    ++numFrequency;
                } else {
                    if (arrFreq[i] < numFrequency)
                        arrFreq[i] = numFrequency;
                    numFrequency = 0;
                }
                if (arrFreq[i] < numFrequency) {
                    arrFreq[i] = numFrequency;
                }
            }
        }
        for (int i : arrFreq)
            System.out.print(i + " ");
        int max = arrFreq[0];
        int pos = 0;
        for (int i = 1; i < arrFreq.length; ++i)
            if (arrFreq[i] > max) {
                pos = i;
                max = arrFreq[i];
            }
        System.out.println();
        System.out.println(max + "," + pos);
        for (int i = 0; i < matrix.length - 1; ++i)
            if (matrix[pos][i] < matrix[pos][i + 1])
                System.out.print(matrix[pos][i] + " ");
    }
}