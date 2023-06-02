package avlyakulov.timur.epam.chapter_12.example.ex.wait_notify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WaitNotifyEx {
    static List<String> strings = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        new Operator().start();
        new Machine().start();
    }

    static class Operator extends Thread {
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                synchronized (strings) {
                    strings.add(scanner.nextLine());
                    strings.notify();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class Machine extends Thread {
        @Override
        public void run() {
            while (strings.isEmpty()) {
                synchronized (strings) {
                    try {
                        strings.wait();//машина не работает 24 на 7 здесь она просто ждет notify чтоб включится и выполнить действие
                        //wait освобождает lock
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(strings.remove(0));
                }
            }

        }
    }
}