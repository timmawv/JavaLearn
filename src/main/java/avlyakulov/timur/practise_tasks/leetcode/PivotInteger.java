package avlyakulov.timur.practise_tasks.leetcode;

public class PivotInteger {
    public int pivotInteger(int n) {
        int result = 0;
        for (int i = 1; i <= n; ++i) {
            int start = 0;
            int end = i - 1;
            int sumStart = 0;
            int sumEnd = 0;
            while (start != i) {
                ++start;
                sumStart += start;
            }
            while (end != n) {
                ++end;
                sumEnd += end;
            }
            if (sumStart == sumEnd) {
                result = i;
                break;
            } else result = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        //Input: n = 8
        //Output: 6
        //Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
        //If it doesn't exist we need to return - 1;
        System.out.println(new PivotInteger().pivotInteger(8));
    }
}