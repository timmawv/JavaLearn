package avlyakulov.timur.epam.chapter_12.example.thread;

public class TalkThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 777; ++i) {
                System.out.println("Talk --> " + i);
            }
        } finally {
            Thread.currentThread().setName("TalkThread");
            System.out.println(Thread.currentThread().getName());
        }
    }
}