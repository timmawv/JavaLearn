package avlyakulov.timur.practise.leetcode;

import java.util.Arrays;

public class LeftRightDifference {
    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int[] arrNum = new int[nums.length * 2];
        int sum = 0, minus = 0, counterArr = 0;
        int minusCounter = arrNum.length - 1;
        while (counterArr != nums.length) {
            arrNum[counterArr] = sum;
            arrNum[minusCounter] = minus;
            sum += nums[counterArr];
            minus += nums[minusCounter - nums.length];
            ++counterArr;
            --minusCounter;
        }
        for (int i = 0; i < nums.length; ++i)
            answer[i] = Math.abs(arrNum[i] - arrNum[i + nums.length]);
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 8, 3};
        new LeftRightDifference().leftRightDifference(arr);
    }
}
