package avlyakulov.timur.epam.chapter_12.example.payment;

import java.util.concurrent.TimeUnit;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = new Payment();

        for (int i = 0; i < 4; ++i) {
            new Thread(() -> payment.doPayment()).start();
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        payment.init();
    }
}
