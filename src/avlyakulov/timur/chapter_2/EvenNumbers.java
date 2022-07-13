package avlyakulov.timur.chapter_2;

import java.util.Scanner;

//Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.
public class EvenNumbers {
    public static void findEvenNumbers() {
        int len = 0;
        int iter = 0;
        char temp = 0;
        int mark = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length ");
        int length = in.nextInt();
        int[] mas = new int[length];
        int[] numEven = new int[length];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < mas.length; ++i)
            mas[i] = in.nextInt();
        for (int x : mas) {
            len = String.valueOf(x).length();
            String num = String.valueOf(x);
            for (int i = 0; i < len; ++i) {
                temp = num.charAt(i);
                //System.out.println(temp);
                if (temp % 2 == 0)
                    mark++;
                //System.out.println(mark);
                if (mark == len) {
                    numEven[iter] = x;
                    ++iter;
                }
            }
            mark = 0;
        }
        System.out.print("Числа которые содержат только четные цифры: ");
        for (int i : numEven) {
            if (i == 0)
                continue;
            System.out.print(i + " ");
        }
    }
}