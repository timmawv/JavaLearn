package avlyakulov.timur.epam.chapter_7.example.supplier;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<StringBuilder> supplier = () -> new StringBuilder("java");
        StringBuilder builder = supplier.get();
        Supplier<int[]> supplier2 = () -> new int[10];
        int[] arr = supplier2.get();
    }
}