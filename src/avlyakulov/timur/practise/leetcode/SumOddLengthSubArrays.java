package avlyakulov.timur.practise.leetcode;

public class SumOddLengthSubArrays {
    public int sumOddLengthSubArrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; ++i) {
            int left = i + 1;
            int right = n - i;
            int k = left * right;
            int odd = (k + 1) / 2;
            sum = sum + odd * arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(new SumOddLengthSubArrays().sumOddLengthSubArrays(arr));
        //  12 13 14 15 16 17 18
        // 1 пара по 7 элементов
        // 3 пары по 5 элементов
        // 5 пар по 3 элемента
        // 7 пар по 1 элементу
    }
}