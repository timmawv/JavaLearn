package avlyakulov.timur.epam.chapter_12.example.lock;

import java.util.concurrent.TimeUnit;

public class PaymentLockMain {
    public static void main(String[] args) {
        final PaymentLock payment = new PaymentLock();
        new Thread(() -> payment.doPayment()).start();
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        payment.init();
        System.out.println("End");
    }
}