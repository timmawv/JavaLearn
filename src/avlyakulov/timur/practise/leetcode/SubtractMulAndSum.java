package avlyakulov.timur.practise.leetcode;

import java.util.Arrays;

/*
Input: n = 4421
Output: 21
Explanation:
Product of digits = 4 * 4 * 2 * 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11
Result = 32 - 11 = 21
 */
public class SubtractMulAndSum {

    public int subtractProductAndSum(int n) {
        int len = String.valueOf(n).length();
        int[] nums = new int[len];
        for (int i = 0; i < len; ++i) {
            nums[i] = n % 10;
            n /= 10;
        }
        int sum = 0;
        int multiple = 1;
        for (int i = 0; i < len; ++i) {
            sum += nums[i];
            multiple *= nums[i];
        }
        return multiple - sum;
    }

    public static void main(String[] args) {
        new SubtractMulAndSum().subtractProductAndSum(123);
    }
}
