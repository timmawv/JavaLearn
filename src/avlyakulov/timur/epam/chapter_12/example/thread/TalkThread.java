package avlyakulov.timur.epam.chapter_12.example.thread;

public class TalkThread implements Runnable {
    //реализация интерфейса Runnable
    @Override
    public void run() {
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println("Talk -->" + i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            Thread.currentThread().setName("ImplementThread");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
