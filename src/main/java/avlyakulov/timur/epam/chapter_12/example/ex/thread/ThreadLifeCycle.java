package avlyakulov.timur.epam.chapter_12.example.ex.thread;

public class ThreadLifeCycle {
    public static void main(String[] args) {
        CustomThread myThread = new CustomThread();
        myThread.start();
        myThread.setPriority(Thread.MAX_PRIORITY); //установка приоритетов
        //Thread.sleep(1_000); example of sleeping thread
        Thread.yield();//
        System.out.println("Thread main");
    }
}

class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread 0");
    }
}