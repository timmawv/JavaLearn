package avlyakulov.timur.chapter_2;

import java.util.Scanner;

//Среди чисел найти число-палиндром. Если таких чисел больше одного, найти второе.
public class NumberPalindromeSecond {
    public static void findPalindromesSecond() {
        boolean checkFirstMet = false;
        System.out.print("Enter length- ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] mas = new int[len];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        for (Integer i : mas) {
            String temp = reverse(i.toString());
            if (checkFirstMet)
                System.out.println("Палиндром который встретился 2 раз: " + i);
            if (i.toString().equals(temp))
                checkFirstMet = true;
        }
    }
    public static String reverse(String src) {
        String result = "";
        for (int i = 0; i < src.length(); i++) {
            result = src.charAt(i) + result;
        }
        return result;
    }

}