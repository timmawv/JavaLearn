package avlyakulov.timur.chapter_2;

import java.util.Scanner;

//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class LengthNumber {
    public static void numLength() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length ");
        int len = in.nextInt();
        int[] mas = new int[len];
        System.out.print("Enter numbers ");
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        for (int i : mas)
            System.out.println(String.valueOf(i).length());

    }
}