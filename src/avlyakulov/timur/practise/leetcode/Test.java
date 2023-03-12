package avlyakulov.timur.practise.leetcode;


public class Test {

    public int differenceOfSum(int[] nums) {
        int sum = 0, sumOfNumbers = 0;
        int num;
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            if (nums[i] >= 10) {
                num = nums[i];

                for (int j = 0; j < String.valueOf(nums[i]).length(); ++j) {

                    sumOfNumbers += num % 10;
                    num /= 10;
                }
            } else sumOfNumbers += nums[i];
        }
        return sum - sumOfNumbers;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 8, 10, 8, 10, 1, 10, 5, 9}; //27
        System.out.println(new Test().differenceOfSum(nums));
        /*System.out.println((int)Math.ceil(Math.log10(120)));*/
    }
}
