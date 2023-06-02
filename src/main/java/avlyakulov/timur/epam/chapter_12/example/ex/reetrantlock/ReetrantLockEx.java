package avlyakulov.timur.epam.chapter_12.example.ex.reetrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReetrantLockEx {
    public static void main(String[] args) {
        Resource resource = new Resource();
        resource.setI(5);
        resource.j = 5;
        MyThread thread1 = new MyThread();
        thread1.setName("one");
        MyThread thread2 = new MyThread();
        thread1.resource = resource;
        thread2.resource = resource;
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(resource.getI());
        System.out.println(resource.j);
    }
}

class MyThread extends Thread {
    Resource resource;

    @Override
    public void run() {
        resource.changeI();
    }

}

class Resource {
    int i;
    int j;
    Lock lock = new ReentrantLock();//просто аналог synchronized
    //зачем нужны если есть синхронизация
    //они дают гибкость лочить несколько методов, можно в 1 вызвать а в 2 освободить, более гибкая синхронизация

    void changeI() {
        lock.lock();
        int k = i;
        if (Thread.currentThread().getName().equals("one"))
            Thread.yield();
        k = k + 1;
        i = k;
        changeJ();
    }
    void changeJ() {
        int k = j;
        if (Thread.currentThread().getName().equals("one"))
            Thread.yield();
        k = k + 1;
        j = k;
        lock.unlock();
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}