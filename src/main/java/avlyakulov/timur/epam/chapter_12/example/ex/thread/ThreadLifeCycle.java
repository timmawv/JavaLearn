package avlyakulov.timur.epam.chapter_12.example.ex.thread;

public class ThreadLifeCycle {
    //summary
    //LifeCycle of thread : new -> runnable -> running -> dead
    //также есть еще 1 ветка : runnable -> running -> waiting/blocking/sleep -> runnable
    //runnable по сути это просто пул потоков, которые ждут своего запуска, они прыгают туда сюда

    public static void main(String[] args) {
        CustomThread myThread = new CustomThread();
        myThread.start();
        try {
            myThread.join(); // гарантирует выполнение потока, пока он не завершится другой запускаться не будет
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Thread.sleep(1_000); example of sleeping thread
        //Thread.yield(); static method  //после того как поток выполнил свою работу с помощью этого метода можна отдать приоритет другому потоку. Запусти другой поток
        //yield() - нельзя вызвать на другом потоке, кроме текущего в данном примере текущий Main
        //sleep - нельзя вызвать на ссылке на поток, он вызывается только на текущем потоке Main
        System.out.println("Thread main");
    }
}

class CustomThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1_000; ++i) {
            System.out.printf("i = %d\n", i);
        }
    }
}