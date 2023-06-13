package avlyakulov.timur.epam.chapter_12.example.ex.thread_local_random;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ThreadLocalRandomExample {
    public static void main(String[] args) throws InterruptedException {
        //с многопоточными приложениями так делать нельзя, просто использовать Math.random();
        System.out.println(Math.random());
        //для работы с рандом надо это использовать
        System.out.println(ThreadLocalRandom.current().nextInt());


        //Example with TimeUnit
        //пример использования sleep
        //Thread.sleep(1_000);
        System.out.println(TimeUnit.DAYS.toSeconds(14)); //будет выведено колово миллисекунд в 14 днях

    }
}
