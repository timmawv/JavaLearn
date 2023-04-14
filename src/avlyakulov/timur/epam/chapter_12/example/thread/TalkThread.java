package avlyakulov.timur.epam.chapter_12.example.thread;

public class TalkThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 7; ++i) {
                System.out.println("Talk --> " + i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } finally {
            Thread.currentThread().setName("TalkThread");
            System.out.println(Thread.currentThread().getName());
        }
    }
}