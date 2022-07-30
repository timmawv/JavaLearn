package avlyakulov.timur.book.chapter_2.numbers;

import java.util.Scanner;

//Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них /todo(Доделать когда будут большие числа и надо будет найти минимальную разницу)
public class DifferentNumbers {
    public static void findMinDifferentNumbers() {
        int[] mas = FillArray.fillArray();
        int counter;
        int position = 0;
        int[] masCounter = new int[mas.length];
        for (int i = 0; i < mas.length; ++i) {
            counter = 0;
            String temp = String.valueOf(mas[i]);
            for (int j = 1; j < temp.length(); ++j)
                if (!(temp.charAt(0) == temp.charAt(j)))
                    ++counter;
            masCounter[i] = counter;
        }
        int min = masCounter[0];
        for (int i = 1; i < masCounter.length; ++i) {
            if (masCounter[i] < min) {
                min = masCounter[i];
                position = i;
            }
        }
        System.out.println("Element with min different in numbers " + mas[position]);
    }
}