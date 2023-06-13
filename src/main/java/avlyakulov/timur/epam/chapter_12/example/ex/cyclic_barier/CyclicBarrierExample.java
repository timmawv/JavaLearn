package avlyakulov.timur.epam.chapter_12.example.ex.cyclic_barier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Run());//пример гонки, мы ждем пока 3 человека начнут бежать после этого гонка считается что она началась
        //тоже самое с потоками. Как только, 3 спортсмена соберуться, то метод run() запуститься только после того как 3 потока соберуться
        new Runner(cyclicBarrier);
        new Runner(cyclicBarrier);
        new Runner(cyclicBarrier);
        //но если будет 2, то мы не сможем запустить гонку, та как без 3 никак
    }

    static class Run extends Thread {
        @Override
        public void run() {
            System.out.println("Run is begun");
        }
    }

    static class Runner extends Thread {
        CyclicBarrier barrier;

        public Runner(CyclicBarrier barrier) {
            this.barrier = barrier;
            start();
        }

        @Override
        public void run() {
            try {
                barrier.await();//как только все 3 спортсмена соберуться вызывается метод await и запускается гонка
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
