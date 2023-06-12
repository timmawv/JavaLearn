package avlyakulov.timur.epam.chapter_12.example.ex.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
    //для чего Executor нужны, когда много потоков, это очень накладно, их создание всегда сложно.
    //Executor - позволяет создавать пул потоков, и управлять ими, то есть переиспользовать уже созданные потоки.
    //Предыдущий закончился, мы добавляем новый и так по кругу
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*Executor executor;
        ExecutorService executorService = Executors.newSingleThreadExecutor();//1 поток
        ExecutorService executorServiceFixed = Executors.newFixedThreadPool(10);//10 потоков
        ExecutorService executorServiceCached = Executors.newCachedThreadPool();//не фиксированый, создает по необходимости, есть тайм ту лиф для потока 60 сек.*/
        ExecutorService executorService = Executors.newFixedThreadPool(2);//по сути это пул потоков+
        executorService.submit(new MyRunnable());
        System.out.println(executorService.submit(new MyCallable()).get());
        executorService.shutdown();//ждет завершение потоков
        //executorService.shutdownNow();// не ждет завершение потоков а сразу выполняется
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(1);
        }
    }
    static class MyCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "2";
        }
    }
}
