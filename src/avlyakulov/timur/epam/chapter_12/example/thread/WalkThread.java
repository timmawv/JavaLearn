package avlyakulov.timur.epam.chapter_12.example.thread;

public class WalkThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 777; ++i) {
                System.out.println("Walk " + i);
            }
        } finally {
            Thread.currentThread().setName("WalkThread");
            System.out.println(Thread.currentThread().getName());
        }
    }
}