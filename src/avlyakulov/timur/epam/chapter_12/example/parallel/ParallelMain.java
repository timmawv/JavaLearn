package avlyakulov.timur.epam.chapter_12.example.parallel;

import java.util.stream.LongStream;

//явный параллелизм
public class ParallelMain {
    public static void main(String[] args) {
        long result;
        result = LongStream.range(0, 1_000)
                .boxed()
                .parallel()
                .map(x -> x / 7)
                .peek(v -> System.out.println(Thread.currentThread().getName()))
                .reduce(0L, (x, y) -> x + (int) (3 * Math.sin(y)));
        System.out.println(result);
    }
}