package avlyakulov.timur.practise_tasks.leetcode;

import java.util.Arrays;

public class MinimumSum {
    public int minimumSum(int num) {
        int[] nums = new int[4];
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(nums);
        return nums[0] * 10 + nums[2] + nums[1] * 10 + nums[3];
    }

    public static void main(String[] args) {
        new MinimumSum().minimumSum(2932);
    }
}
