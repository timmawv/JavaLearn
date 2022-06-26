package avlyakulov.timur.chapter_1;

import java.util.Scanner;

//Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
public class NumberPalindrome {

    public static void findPalindromes() {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] mas = new int[len];
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        for (Integer i : mas) {
            String temp = reverse(i.toString());
            if (i.toString().equals(temp))
                System.out.println(i);
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
