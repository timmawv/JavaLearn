package avlyakulov.timur.practise_tasks;

import java.util.Arrays;
import java.util.Scanner;

// простой алгоритм сортировки пузырьком и алгоритм сортировки объектов когда мы все null's убираем в конец массива.
public class Index {
    public void sortArray(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int c = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = c;
                    isSorted = false;
                }
            }
        }
    }

    public static void executeDefragmentation(String[] array) {
        for (int x = 0; x < array.length - 1; x++)
            for (int i = 0; i < array.length - 1 - x; i++) {
                if (array[i] == null) {
                    String s = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = s;
                }
            }
    }

    public static void main(String[] args) {
        String[] arr = {"object15", null, null, "object2", null};
        executeDefragmentation(arr);
        System.out.println(Arrays.toString(arr));
    }
}