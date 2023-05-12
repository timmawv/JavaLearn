package avlyakulov.timur.epam.chapter_12.example.wait_notify;

import java.util.Scanner;

public class Payment {
    private int amount;

    public synchronized void doPayment() {
        try {
            System.out.println("Start payment");
            while (amount <= 0) {
                this.wait();
            }
            //payment code;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Payment is closed");
    }

    public synchronized void init() {
        System.out.println("Init amount: ");
        amount = new Scanner(System.in).nextInt();
        this.notifyAll();
    }
}