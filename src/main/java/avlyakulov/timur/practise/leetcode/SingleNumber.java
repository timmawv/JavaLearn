package avlyakulov.timur.practise.leetcode;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int res = nums[0];
        int counter = 0;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < nums.length; ++j) {
                if (nums[i] != nums[j]) {
                    ++counter;
                    if (counter == nums.length - 1) {
                        res = nums[i];
                        break;
                    }
                }
                else continue;
            }
            counter = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1};
        int res = singleNumber(arr);
        System.out.println(res);
    }
}