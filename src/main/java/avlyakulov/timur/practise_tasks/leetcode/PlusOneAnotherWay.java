package avlyakulov.timur.practise_tasks.leetcode;

import java.util.Arrays;

public class PlusOneAnotherWay {
    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (digits[i] == 9) {
            digits[i] = 0;
            if (i == 0) {
                int[] arr = new int[digits.length + 1];
                System.arraycopy(digits, 0, arr, 0, digits.length);
                digits = arr;
            }
            if (i == 0)
                break;
            --i;
        }
        if (digits[i] == 9)
            digits[i] = 1;
        else
            digits[i] = ++digits[i];
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        System.out.println(Arrays.toString(PlusOneAnotherWay.plusOne(arr)));
    }
}