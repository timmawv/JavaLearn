package avlyakulov.timur.epam.chapter_12.example.ex.phaser;

import java.util.concurrent.Phaser;

public class PhaserExample {
    public static void main(String[] args) {
        //есть 3 машины которые должны помыть 2 человека
        Phaser phaser = new Phaser(2);//нужен для того чтобы, разбить какую то работу на фазы, и следующая фаза не начнется пока следующие фазы не завершаться
        new Washer(phaser);
        new Washer(phaser);
    }

    static class Washer extends Thread {
        Phaser phaser;//контролирует чтоб все потоки завершили нужную фазу

        public Washer(Phaser phaser) {
            //phaser.register();
            this.phaser = phaser;
            start();
        }
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(this.getName() + " washing the car"); // по идее мы не можем загнать машину пока все потоки не завершат мойку предыдщей машины
                phaser.arriveAndAwaitAdvance();//я хочу подождать пока все не закончат
                //по идее сейчас 2 потока работают одновременно над 1 задачей. 2 потока загоняются и работают над 1 задачей
                //пока оба потока не вызовут этот метод, мы не можем идти дальше. Та как в фазере в который мы передали, есть инфа что работают 2 потока
            }
            //phaser.arriveAndDeregister();
        }
    }
}
