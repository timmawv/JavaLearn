package avlyakulov.timur.epam.chapter_12.example.fork_join;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class ForkJoinTaskMain {
    public static void main(String[] args) {
        int end = 1_000_000;
        List<Long> list = LongStream.range(0, end)
                .boxed()
                .toList();
        ForkJoinTask<Long> task = new SumRecursiveTaskWithStream(list);
        long result = new ForkJoinPool().invoke(task);
        System.out.println(result);
    }
}