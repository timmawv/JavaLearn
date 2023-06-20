package avlyakulov.timur.epam.chapter_12.example.ex.blockingdeque;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQueueExample {
    //BlockingQueue - решает проблему, когда есть очередь и может быть такое что поток берет эелемент которого еще нет.
    public static void main(String[] args) {
        BlockingQueue<String> queue = new PriorityBlockingQueue<>();

        new Thread(() -> {
            try {
                System.out.println(queue.take());//то же самое что и remove, только он блокируется в моменте, не будет выполняться, пока туда не положим элемент, чтоб его достать
                //скорей всего работает s notify wait.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> queue.add("this is String")).start();
    }
}
