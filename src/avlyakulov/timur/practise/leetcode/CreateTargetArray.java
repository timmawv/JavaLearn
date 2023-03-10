package avlyakulov.timur.practise.leetcode;

import java.util.Arrays;

/*
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
 */
public class CreateTargetArray {
    /*public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0; i < len; ++i) {
            if (result[index[i]] != 0)
                for (int j = len - 1; j > index[i]; --j) {
                    int c = result[j];
                    result[j] = result[j - 1];
                    result[j - 1] = c;
                }
            result[index[i]] = nums[i];
        }
        return result;
    }*/
    /*public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        int[] result = new int[len];
        int counter = 0;
        for (int i = 0; i < len; ++i) {
            for (int j = len - 1; j >= 0; --j) {
                if (index[j] == i) {
                    result[counter] = nums[j];
                    ++counter;
                }
            }
        }
        return result;
    }*/
    //todo доделать добавление элементов по правилу
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {4, 2, 4, 3, 2};
        int[] index = {0, 0, 1, 3, 1};
        System.out.println(Arrays.toString(new CreateTargetArray().createTargetArray(nums, index)));
        // result : 2,2,4,4,3
    }
}