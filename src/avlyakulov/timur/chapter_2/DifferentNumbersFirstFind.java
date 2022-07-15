package avlyakulov.timur.chapter_2;

import java.util.Scanner;

//Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них
public class DifferentNumbersFirstFind {
    public static void findDifferentNumbersFirstFind() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int length = in.nextInt();
        int[] mas = new int[length];
        System.out.print("Enter elements of array:");
        for (int i = 0; i < length; ++i)
            mas[i] = in.nextInt();
        int findNum = 0;
        for (int x = 0; x < length; ++x) {
            boolean checkEquality = true;
            int len = String.valueOf(mas[x]).length();
            for (int i = 0; i < len - 1; ++i) {
                char num = String.valueOf(mas[x]).charAt(i);
                for (int j = i + 1; j < len; ++j) {
                    if (num == String.valueOf(mas[x]).charAt(j)) {
                        checkEquality = false;
                    }
                    if (num != String.valueOf(mas[x]).charAt(j) && i == len - 2) {
                            findNum = mas[x];
                            break;
                    }
                }
                if (!checkEquality)
                    break;
            }
        }
        System.out.println("Первое число с различными цифрами: " + findNum);
    }
}