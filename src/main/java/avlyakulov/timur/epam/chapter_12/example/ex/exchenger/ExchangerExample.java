package avlyakulov.timur.epam.chapter_12.example.ex.exchenger;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>(); //используется для того чтобы передавать данные между потоками

        Mike mike = new Mike(exchanger);
        new Form(exchanger);
        //когда запускается Exchanger в 1 потоке, он ждет пока во 2 потоке запустится exchanger и после этого происходит обмен информацией
    }

    static class Mike extends Thread {
        Exchanger<String> exchanger;

        public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                exchanger.exchange("Hi my name is Mike");
                sleep(1_000);
                exchanger.exchange("I am twenty one years old");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class Form extends Thread {
        Exchanger<String> exchanger;

        public Form(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                System.out.println(exchanger.exchange(null));
                System.out.println(exchanger.exchange(null));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
