package avlyakulov.timur.epam.chapter_12.example.callable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ActionMain {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1, 1_001)
                .boxed()
                .collect(Collectors.toList());
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new ActionCallable(list));// запускает поток на выполнение
        executor.submit(new Thread()); // не запустится та как использовали метод shutdown
        executor.shutdown();// stops service but not thread. Без него программа будет работать
        executor.shutdownNow(); // stops service and all running threads
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}