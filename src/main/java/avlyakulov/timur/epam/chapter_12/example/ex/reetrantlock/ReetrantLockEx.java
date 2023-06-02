package avlyakulov.timur.epam.chapter_12.example.ex.reetrantlock;

public class ReetrantLockEx {
    public static void main(String[] args) {
        Resource resource = new Resource();
        resource.setI(5);
        MyThread thread1 = new MyThread();
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

    public void changeI() {
        ++i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}