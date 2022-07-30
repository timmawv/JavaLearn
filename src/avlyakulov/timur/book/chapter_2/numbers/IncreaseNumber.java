package avlyakulov.timur.book.chapter_2.numbers;

import java.util.Scanner;

//Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
public class IncreaseNumber {
    public static void findIncreaseNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length ");
        int length = in.nextInt();
        int[] mas = new int[length];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < mas.length; ++i)
            mas[i] = in.nextInt();
        for (int x : mas) {
            int mark = 0;
            int len = String.valueOf(x).length();
            for (int i = 0; i < len - 1; ++i) {
                char num = String.valueOf(x).charAt(i);
                char num1 = String.valueOf(x).charAt(i + 1);
                if (num < num1)
                    mark++;
            }
            if (mark == (len - 1)) {
                System.out.println("Первое число которое идёт в порядке возрастания: " + x);
                break;
            }
        }
    }
}