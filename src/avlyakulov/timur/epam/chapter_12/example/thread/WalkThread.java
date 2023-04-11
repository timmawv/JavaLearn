package avlyakulov.timur.epam.chapter_12.example.thread;

public class WalkThread extends Thread {
    //расширение класса Thread
    public void run() {
        try {
            for (int i = 0; i < 7; ++i) {
                System.out.println("Walk " + i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } finally {
            Thread.currentThread().setName("ExtendThread");
            System.out.println(Thread.currentThread().getName());
        }
    }
}