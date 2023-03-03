package avlyakulov.timur.practise.leetcode;

import java.util.Arrays;

public class PractiseTask {

    //todo доделать эту задачу с литкода
    public int[] shuffle(int[] nums, int n) {
        int beginCounter = 1;
        for (int i = n; i < nums.length; ++i) {
            int c = nums[beginCounter];
            nums[beginCounter] = nums[i];
            nums[i] = c;
            ++beginCounter;
            System.out.println(Arrays.toString(nums));
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        System.out.println("Base : [2, 5, 1, 3, 4, 7]");
        nums = new PractiseTask().shuffle(nums, 3);
        System.out.println("Result : " + Arrays.toString(nums));
        System.out.println("Need : [2, 3, 5, 4, 1, 7]");
        // x1 x2 x3 y1 y2 y3 - начало
        // x1 y1 x3 x2 y2 y3


        // x1 x2 x3 x4 x5 y1 y2 y3 y4 y5 - начало
        // x1 x2 x3 x4 y1 x5 y2 y3 y4 y5 - 1 перестановка
        // x1 x2 x3 y1 x4 x5 y2 y3 y4 y5 - 2 перестановка
        // x1 x2 y1 x3 x4 x5 y2 y3 y4 y5 - 3 перестановка
        // x1 y1 x2 x3 x4 x5 y2 y3 y4 y5 - 4 (y1 - 4 шага)
        // x1 y1 x2 x3 x4 y2 x5 y3 y4 y5 - 5 перестановка
        // x1 y1 x2 x3 y2 x4 x5 y3 y4 y5 - 6 перестановка
        // x1 y1 x2 y2 x3 x4 x5 y3 y4 y5 - 7 (y2 - 3 шага)
        // x1 y1 x2 y2 x3 x4 y3 x5 y4 y5 - 8 перестановка
        // x1 y1 x2 y2 x3 y3 x4 x5 y4 y5 - 9 (y3 - 2 шага)
        // x1 y1 x2 y2 x3 y3 x4 y4 x5 y5 - 10 (y4 - 1 шаг)
        // итого мы делаем n - 1 перестановок
    }
}