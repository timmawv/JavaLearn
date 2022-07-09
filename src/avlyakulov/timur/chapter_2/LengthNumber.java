package avlyakulov.timur.chapter_2;

import java.util.Scanner;

//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class LengthNumber {
    public static void numLength() {
        Scanner in = new Scanner(System.in);
        int max = 0,min = 0;
        System.out.print("Enter length ");
        int len = in.nextInt();
        int[] mas = new int[len];
        System.out.print("Enter numbers ");
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        for (int i = 0; i < mas.length - 1; ++i) {
            max = mas[0];
            min = mas[0];
            if (mas[i + 1] > max )
                max = mas[i + 1];
            if ( mas[i + 1] < min)
                min = mas[i + 1];
        }

            System.out.println("Number: " + max + ", Length: " + String.valueOf(max).length());
            System.out.println("Number: " + min + ", Length: " + String.valueOf(min).length());
    }
}