package avlyakulov.timur.epam.chapter_12.example.ex.thread_factory;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryExample {
    public static void main(String[] args) {
        //на входе получает Runnable и возвращает Thread. Нужен для работы с однородными потоками, чтоб настроить их однообразно.
        //данный threadFactory задает поведение потоку. Мы можем одинаково настравивать все потоки которые получаем на вход.
        //Мы можем им задавать все что нужно
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setName("Thread10");
                thread.setPriority(Thread.MAX_PRIORITY);
                return thread;
            }
        };
        threadFactory.newThread(new MyRun()).start();

    }

    static class MyRun implements Runnable {
        @Override
        public void run() {
            System.out.println(1);
        }
    }
}
