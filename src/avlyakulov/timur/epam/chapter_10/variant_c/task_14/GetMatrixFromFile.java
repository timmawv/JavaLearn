package avlyakulov.timur.epam.chapter_10.variant_c.task_14;

import avlyakulov.timur.epam.chapter_2.matrix.OutputMatrix;

import java.io.*;
import java.util.Scanner;

/*
Входной файл содержит совокупность строк. Строка файла содержит строку
квадратной матрицы. Ввести матрицу в двумерный массив (размер матрицы
найти). Вывести исходную матрицу
 */
public class GetMatrixFromFile {
    public static void main(String[] args) {
        File file = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_c\\task_14\\matrix.txt");
        int[][] matrix;
        String line = "";
        int n = 0, m;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            m = reader.readLine().split("\\s").length;
            ++n;
            while ((line = reader.readLine()) != null) {
                ++n;
            }
            System.out.println(m);
            System.out.println(n);
            matrix = new int[n][m];
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
        try (Scanner reader = new Scanner(new FileReader(file))) {
            for (int i = 0; i < matrix.length; ++i)
                for (int j = 0; j < matrix.length; ++j)
                    matrix[i][j] = Integer.parseInt(reader.next());
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
        OutputMatrix.printMatrix(matrix);
    }
}