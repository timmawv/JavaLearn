package avlyakulov.timur.practise_tasks.leetcode;

public class SmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] values = new int[nums.length];
        int counter;
        for (int i = 0; i < nums.length; ++i) {
            counter = 0;
            for (int j = 0; j < nums.length; ++j) {
                if (i != j && nums[i] != nums[j] && nums[i] >= nums[j])
                    ++counter;
            }
            values[i] = counter;
        }
        return values;
    }
}
