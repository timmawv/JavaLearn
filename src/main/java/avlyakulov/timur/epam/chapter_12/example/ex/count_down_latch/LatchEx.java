package avlyakulov.timur.epam.chapter_12.example.ex.count_down_latch;

import java.util.concurrent.CountDownLatch;

public class LatchEx {
    //CountDawnLatch - используется чтоб потоки выполнили какую то нужную работу, чтоб потом мы использовали эти даные
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);//в конструкторе указывается сколько потоков должно завершится, выполняем работу и уменьшаем на 1
        /*countDownLatch.countDown();//уменьшает наше число на 1
        countDownLatch.await(); //ждет пока счетчик не достигент 0, после мы запускаем его когда будет 0*/
        new Work(countDownLatch);
        new Work(countDownLatch);
        //new Work(countDownLatch);

        countDownLatch.await(); // ждет 0 и после выполняются действия, если countdownLatch не равен 0, то будет бесконечно ждать этого 0
        System.out.println("all jod done");
    }
}

class Work extends Thread {
    CountDownLatch countDownLatch;

    public Work (CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        start();
    }
    @Override
    public void run() {
        try {
            sleep(3_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("done work");
        countDownLatch.countDown();
    }
}