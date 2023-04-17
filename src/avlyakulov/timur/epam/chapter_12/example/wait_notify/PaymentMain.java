package avlyakulov.timur.epam.chapter_12.example.wait_notify;

import java.util.concurrent.TimeUnit;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = new Payment();
        for (int i = 0; i < 5; ++i)
            new Thread(() -> payment.doPayment()).start();
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        payment.init();
    }
}
