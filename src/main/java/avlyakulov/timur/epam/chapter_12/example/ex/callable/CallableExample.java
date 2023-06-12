package avlyakulov.timur.epam.chapter_12.example.ex.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableExample {
    public static void main(String[] args) throws Exception{
        //все работает очень просто мы ложим в future task наш callable, где потом вызывается метод call и выполняется
        //а у future task есть переопределенный метод run
        Callable<Integer> callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());

    }

    static class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            int j = 0;
            for (int i = 0; i < 10; ++i, ++j) {
                Thread.sleep(300);
            }
            return j;
        }
    }
}