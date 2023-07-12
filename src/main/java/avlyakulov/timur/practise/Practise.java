package avlyakulov.timur.practise;

public class Practise {

    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (digits(num) % 2 == 0)
                ++counter;
        }
        return counter;
    }


    public static int digits(int n) {
        if (n < 10) return 1;
        return 1 + digits(n / 10);
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(new Practise().findNumbers(nums));
    }
}