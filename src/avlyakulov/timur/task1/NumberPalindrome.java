package avlyakulov.timur.task1;

import java.util.Scanner;

//Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
public class NumberPalindrome {
    public void findPalindromes() {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] mas = new int[len];
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        for (Integer i : mas) {
            String temp = i.toString();
        }
    }
}
