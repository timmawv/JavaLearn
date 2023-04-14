package avlyakulov.timur.epam.chapter_12.example.callable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class ActionMain {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0, 1_000)
                .boxed()
                .toList();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new ActionCallable(list));
        executorService.shutdown();//stops service but not thread
        // executor.submit(new Thread()); // will throw an Exception
        // executor.shutdownNow(); // stops service and all running threads
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}