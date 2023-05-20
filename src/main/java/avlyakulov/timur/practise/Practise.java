package avlyakulov.timur.practise;


import java.util.Arrays;

public class Practise {
    public int[] separateDigits(int[] nums) {
        int length = 0;
        for (int i : nums) {
            length += String.valueOf(i).length();
        }
        int[] result = new int[length];
        int counter = 0;
        for (int i : nums) {
            String temp = String.valueOf(i);
            for (int x = 0; x < temp.length(); ++x) {
                result[counter] = Integer.parseInt(temp.substring(x, x + 1));
                ++counter;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77};
        System.out.println(Arrays.toString(new Practise().separateDigits(nums)));
    }
}