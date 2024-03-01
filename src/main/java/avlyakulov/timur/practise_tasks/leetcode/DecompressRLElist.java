package avlyakulov.timur.practise_tasks.leetcode;

/*
Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
 */
public class DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            len += nums[i];
        }
        int counter = 0;
        int[] result = new int[len];
        for (int i = 1; i < nums.length; i += 2) {
            for (int j = 1; j <= nums[i - 1]; ++j) {
                result[counter] = nums[i];
                ++counter;
            }
        }
        return result;
    }
}