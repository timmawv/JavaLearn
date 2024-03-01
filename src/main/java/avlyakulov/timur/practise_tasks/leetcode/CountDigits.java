package avlyakulov.timur.practise_tasks.leetcode;

public class CountDigits {

    //Input: num = 1248
    //Output: 4
    //Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
    // 1248 / 1; 1248 / 2; 1248 / 4; 1248 / 8;
    public int countDigits(int num) {
        int len = String.valueOf(num).length();
        int val = 0;
        int numAdditional = num;
        int counter = 0;
        for (int i = 0; i < len; ++i) {
            val = numAdditional % 10;
            numAdditional /= 10;
            if (num % val == 0)
                ++counter;
        }
        return counter;
    }

    public static void main(String[] args) {
        CountDigits countDigits = new CountDigits();
        countDigits.countDigits(12);
    }
}
