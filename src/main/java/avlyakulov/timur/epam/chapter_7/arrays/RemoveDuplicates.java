package avlyakulov.timur.epam.chapter_7.arrays;

import java.util.Arrays;
import java.util.function.Consumer;

/*
С помощью лямбда-выражений разработать метод, который на вход
получает массив объектов, а возвращает его уже без дубликатов.
 */
public class RemoveDuplicates {
    static int counter = 0;
    public static void main(String[] args) {

        Consumer<Object[]> removeDuplicate = arr -> {
            for (int i = 0; i < arr.length - 1; ++i) {
                for (int j = i + 1; j < arr.length - 1; ++j) {
                    if (arr[i] == arr[j]) {
                        ++counter;
                        arr[j] = null;
                    }
                    if (arr[j] == null) {
                        Object c = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = c;
                    }
                }
            }
            Object[] arr1 = new Object[arr.length - counter];
            System.arraycopy(arr,0,arr1,0,arr.length - counter);
            arr = arr1;
            System.out.println(Arrays.toString(arr));
        };
        Object[] objects = {1, 3, 5, 6, 5, 10, 3, 12, 15, 12};
        removeDuplicate.accept(objects);

    }
}