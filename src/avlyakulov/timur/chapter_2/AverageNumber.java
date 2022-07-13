package avlyakulov.timur.chapter_2;

//Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.

import java.util.Scanner;

public class AverageNumber {
    public static void findAverageNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length ");
        int len = in.nextInt();
        int[] mas = new int[len];
        System.out.print("Enter numbers ");
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        int average = 0;
        int[] lengthMas = new int[len];
        for (int x = 0; x < mas.length; ++x)
            lengthMas[x] = String.valueOf(mas[x]).length();
        for (int lengthMa : lengthMas)
            average += lengthMa;
        average = average / lengthMas.length;
        System.out.println("Средняя длина массива " + average);
        System.out.println("Выведем те числа которые меньше средней длины:");
        for (int i : mas) {
            if (String.valueOf(i).length() < average)
                System.out.println(i + " Length: " + String.valueOf(i).length());
        }
        System.out.println("Выведем те числа которые больше средней длины:");
        for (int i : mas) {
            if (String.valueOf(i).length() > average)
                System.out.println(i + " Length: " + String.valueOf(i).length());
        }
    }
}
