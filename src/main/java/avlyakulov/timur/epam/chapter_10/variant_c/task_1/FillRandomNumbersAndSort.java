package avlyakulov.timur.epam.chapter_10.variant_c.task_1;


import java.io.*;
import java.util.Arrays;

/*
Создать и заполнить файл случайными целыми числами. Отсортировать
содержимое файла по возрастанию.
 */
public class FillRandomNumbersAndSort {
    public static void main(String[] args) {
        File file = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_c\\task_1\\numbers.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            System.out.println("Генерируем количество случайных чисел которое будет записано в файл");
            int number = (int) (Math.random() * 10 + 1);
            System.out.printf("Количество случайных числел, которое будет записано в массив %d\n", number);
            int[] numbers = new int[number];
            for (int i = 0; i < numbers.length; ++i) {
                numbers[i] = (int) (Math.random() * 20 + 10);
            }
            Arrays.sort(numbers);
            writer.write(Arrays.toString(numbers));
            System.out.println(Arrays.toString(numbers));
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
    }
}