package avlyakulov.timur.epam.chapter_12.example.ex.volat;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomVariables {
    static AtomicInteger atomicInteger = new AtomicInteger(0);//volatile не помогает
    //причина по которой volatile не помогает, он позволяет работать на прямую со значением
    //но сама перемення остается, когда выполняем run() то может быть ситуация, как показано
    //снизу в примере (++i = {int k = i + 1; i = k}),поэтому возможны ситуации когда 1 поток
    //зашел в ран получил k = i + 1 (10), потом он останавливается и потом начинает свою работу
    //2 поток который уже получает k = i + 1 (10), в итоге 2 потока дали 1 и тоже значение и
    // i была увеличина только на 1 вместо 2
    volatile static int i;

    public static void main(String[] args) {
        for (int i = 0; i < 10_000; ++i)
            new MyThread().start();
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(atomicInteger.get());
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            atomicInteger.incrementAndGet();
            //пример работы не атамарных переменных
            //i = 4;
            //int k = i + 1; 1 поток
            //int k = i + 1; тут же врывается 2 поток
            // i = k; 5
            // i = k; 5
            // 2 паралельных действия

        }
    }
}