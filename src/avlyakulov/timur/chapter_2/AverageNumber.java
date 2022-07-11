package avlyakulov.timur.chapter_2;

//Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.

import java.util.Scanner;

public class AverageNumber {
    public static void findAverageNumbers() {
        Scanner in = new Scanner(System.in);
        int max = 0, min = 0;
        System.out.print("Enter length ");
        int len = in.nextInt();
        int[] mas = new int[len];
        System.out.print("Enter numbers ");
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        int average = 0;
        int[] lengthMas = new int[len];
        for (int i : mas) {
            for (int x = 0; x < mas.length; ++x)
                lengthMas[x] = String.valueOf(i).length();
        }
        for (int lengthMa : lengthMas) {
            average += lengthMa;
        }
        average = average / lengthMas.length;
        System.out.println(average);
    }
}
