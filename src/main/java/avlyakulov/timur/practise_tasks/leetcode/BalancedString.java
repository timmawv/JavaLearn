package avlyakulov.timur.practise_tasks.leetcode;

//Input: s = "RLRRRLLRLL"
//Output: 2
//Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
//Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
public class BalancedString {
    public int balancedStringSplit(String s) {
        int num = 0;
        int positionsOfNums = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'R')
                ++positionsOfNums;
            else --positionsOfNums;
            if (positionsOfNums == 0)
                ++num;
        }
        return num;
    }

    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        new BalancedString().balancedStringSplit(s);
    }
}
