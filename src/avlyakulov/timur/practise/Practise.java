package avlyakulov.timur.practise;


import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 19, 15, 13};
        for (int i = 0; i < array.length; ++i) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int c = array[i];
            array[i] = array[min];
            array[min] = c;
        }
        System.out.println(Arrays.toString(array));
    }
}