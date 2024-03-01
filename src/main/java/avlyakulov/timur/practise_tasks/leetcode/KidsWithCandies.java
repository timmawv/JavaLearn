package avlyakulov.timur.practise_tasks.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; ++i) {
            if (max < candies[i])
                max = candies[i];
        }
        System.out.println("Max element of array " + max);
        for (int i = 0; i < candies.length; ++i) {
            System.out.println(candies[i] + extraCandies);
            if (candies[i] + extraCandies >= max)
                list.add(true);
            else list.add(false);
        }

        return list;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        List<Boolean> list = new KidsWithCandies().kidsWithCandies(arr,3);
        System.out.println(list);
    }
}