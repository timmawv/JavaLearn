package avlyakulov.timur.practise.leetcode;

import java.util.Arrays;

public class PractiseTask {

    //todo доделать эту задачу с литкода
    public int[] shuffle(int[] nums, int n) {

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        System.out.println("Base : " + Arrays.toString(nums));
        nums = new PractiseTask().shuffle(nums, 3);
        System.out.println("Result : " + Arrays.toString(nums));
        System.out.println("Need : [2, 3, 5, 4, 1, 7]");
    }
}