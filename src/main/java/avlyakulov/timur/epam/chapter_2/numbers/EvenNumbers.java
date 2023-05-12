package avlyakulov.timur.epam.chapter_2.numbers;

import java.util.Scanner;

//Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.
public class EvenNumbers {
    public static void findEvenNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length ");
        int length = in.nextInt();
        int[] mas = new int[length];
        int[] numEven = new int[length];
        int[] coupleNum = new int[length];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < mas.length; ++i)
            mas[i] = in.nextInt();
        int iter = 0;
        int iter1 = 0;
        for (int x : mas) {
            int mark = 0;
            int len = String.valueOf(x).length();
            String num = String.valueOf(x);
            for (int i = 0; i < len; ++i) {
                char temp = num.charAt(i);
                if (temp % 2 == 0)
                    ++mark;
                if (mark == len) {
                    numEven[iter] = x;
                    ++iter;
                }
                if (mark == (len - mark)) {
                    coupleNum[iter1] = x;
                    ++iter1;
                }
            }
        }
        printEvenNum(numEven);
        printCouplesNum(coupleNum);
    }
    public static void printEvenNum(int [] array){
        System.out.print("Числа которые содержат только четные цифры: ");
        for (int i : array) {
            if (i == 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printCouplesNum(int [] array){
        System.out.print("Числа которые содержат одинаковое количество четных цифр и нечётных: ");
        for (int i : array) {
            if (i == 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}