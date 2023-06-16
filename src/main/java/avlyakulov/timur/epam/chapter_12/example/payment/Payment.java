package avlyakulov.timur.epam.chapter_12.example.payment;

import java.util.Scanner;

public class Payment {
    private int amount;
    public synchronized void doPayment() {
        try {
            System.out.println("Start payment");
            while(amount <= 0) {
                System.out.println("Amount is less than null so we are waiting");
                this.wait(120);
            }
            //payment code
            amount -= 10;
            System.out.println("You donated 10 money thanks");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Your balance is " + amount);
        System.out.println("Payment is closed");
    }

    public synchronized void init() {
        System.out.println("Init amount: ");
        amount = new Scanner(System.in).nextInt();
        this.notifyAll();
    }
}
