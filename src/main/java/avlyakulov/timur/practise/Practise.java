package avlyakulov.timur.practise;


public class Practise {

    public int minOperations(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] > nums[i + 1]) {
                int diff = nums[i] - nums[i + 1];
                ++diff;
                counter += diff;
                nums[i + 1] += diff;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 1};
        System.out.println(new Practise().minOperations(nums));
    }
}