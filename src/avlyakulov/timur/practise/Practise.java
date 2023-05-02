package avlyakulov.timur.practise;


public class Practise {
    public int subsetXORSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            for (int x = i + 1; x < nums.length; ++x) {
                sum += nums[i] ^ nums[x];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,3};
        System.out.println(new Practise().subsetXORSum(arr));
    }
}