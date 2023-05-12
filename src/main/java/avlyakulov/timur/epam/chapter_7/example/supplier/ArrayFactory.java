package avlyakulov.timur.epam.chapter_7.example.supplier;

import java.util.function.Supplier;

public class ArrayFactory {
    //фабрика массивов на основе Supplier
    public static Supplier<int[]> buildArray(int size) {
        final int length = size > 0 ? size : 1;
        return () -> new int[length];
    }

    public static void main(String[] args) {
        //использование такой фабрики имеет вид
        int[] array = ArrayFactory.buildArray(10).get();
        for (int i : array)
            System.out.println(i);
    }
}
