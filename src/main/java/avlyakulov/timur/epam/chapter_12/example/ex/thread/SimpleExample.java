package avlyakulov.timur.epam.chapter_12.example.ex.thread;

public class SimpleExample {
    public static void main(String[] args) {
        System.out.println("Example of main thread " + Thread.currentThread().getName());
        CustomThread myThread = new CustomThread();
        myThread.start();
        MyRunnable myRunnable = new MyRunnable();
        //myRunnable.run();// выводится main потом не создался
        Thread thread = new Thread(myRunnable);// теперь поток создается и будет корректно работать
        thread.start();
    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("It is extend " + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("It is runnable " + Thread.currentThread().getName());
    }
}