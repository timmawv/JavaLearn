package avlyakulov.timur.practise.leetcode;

public class SumOddLengthSubArrays {
    public int sumOddLengthSubArrays(int[] arr) {
        int sum = 0;
        int counterPairs = 3;
        int numberOfOddNums = arr.length - 2;
        int counter = 0;
        //здесь мы считаем просто сумму элементов когда пара это 1 элемент
        for (int i = 0; i < arr.length; ++i)
            sum += arr[i];
        //проверка на четность дабы соратить время
        if (arr.length % 2 != 0) {
            //1 пара всех элементов
            sum *= 2;
            //цикл проверки для того чтобы обойти все нечетные пары
            while (counterPairs != arr.length) {
                //цикл для подсчета элементов в текущей паре
                for (int i = 0; i < numberOfOddNums; ++i) {

                }

                counterPairs += 2;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(new SumOddLengthSubArrays().sumOddLengthSubArrays(arr));
        //  12 13 14 15 16 17 18
        // 3 пары по 5 элементов
        // 5 пар по 3 элемента
    }
}
