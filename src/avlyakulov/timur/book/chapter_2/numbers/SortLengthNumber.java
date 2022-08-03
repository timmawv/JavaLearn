package avlyakulov.timur.book.chapter_2.numbers;

//Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины

import java.util.Scanner;

public class SortLengthNumber {

    public static void sortNumLength() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length ");
        int len = in.nextInt();
        int[] mas = new int[len];
        System.out.print("Enter numbers ");
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        for (int j = 0; j < mas.length; ++j)
            for (int i = 0; i < mas.length - 1; ++i) {
                if (String.valueOf(mas[i]).length() > String.valueOf(mas[i + 1]).length()) {
                    int c = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = c;
                }
            }
        for (int i : mas)
            System.out.println(i + " ");

    }
}