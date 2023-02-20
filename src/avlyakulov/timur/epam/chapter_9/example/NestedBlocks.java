package avlyakulov.timur.epam.chapter_9.example;

public class NestedBlocks {
    public void doActionWithException() {
        // вложенные блоки try-catch
        try { // outer block
            int a = (int) (Math.random() * 2) - 1;
            System.out.printf("our a = %d", a);
            try {//inner block
                int b = 1 / a;
                StringBuilder sb = new StringBuilder(b);
            } catch (NegativeArraySizeException e) {
                System.err.println("invalid buffer size: " + e);
            }
        } catch (ArithmeticException e) {
            System.err.println("divide by zero: " + e);
        }

    }
}
