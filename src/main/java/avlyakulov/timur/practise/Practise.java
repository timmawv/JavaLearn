package avlyakulov.timur.practise;


import java.util.Arrays;

public class Practise {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i] < nums[i + 1] ? nums[i] : nums[i + 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(new Practise().arrayPairSum(nums));
    }
}