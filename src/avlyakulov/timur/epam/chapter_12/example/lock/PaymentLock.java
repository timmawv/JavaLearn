package avlyakulov.timur.epam.chapter_12.example.lock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PaymentLock {
    //Lock - аналог synchronized, только лучше та как там есть дополнительные методы для работы
    private int amount;
    private ReentrantLock lock = new ReentrantLock(true);
    private Condition condition = lock.newCondition();

    public void doPayment() {
        try {
            System.out.println("Start payemnt(lock)");
            lock.lock();
            while (amount <= 0) {
                condition.await();
            }
            //payment code
            System.out.println("Payment(lock) is closed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
    public void init() {
        try {
            lock.lock();
            System.out.println("Init amount: ");
            amount = new Scanner(System.in).nextInt();
        } finally {
            condition.signal();
            lock.unlock();
        }
    }

}
