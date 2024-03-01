package avlyakulov.timur.practise_tasks.leetcode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        String sumArr = "";
        for (Integer i : digits)
            sumArr += i.toString();
        BigInteger result = new BigInteger(sumArr);
        result = result.add(BigInteger.valueOf(1));
        sumArr = result.toString();
        if (sumArr.length() > digits.length)
            digits = new int[sumArr.length()];
        char[] digitsStr = new char[digits.length];
        for (int i = 0; i < sumArr.length(); ++i) {
            digitsStr[i] = sumArr.charAt(i);
            System.out.println(digitsStr[i]);
            digits[i] = Character.getNumericValue(digitsStr[i]);
        }
        return digits;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] arr = {9};
        System.out.println(Arrays.toString(plusOne.plusOne(arr)));
    }
}
