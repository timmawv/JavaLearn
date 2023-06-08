package avlyakulov.timur.epam.chapter_12.example.ex.conditions;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionsExample {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int account = 0;

    public static void main(String[] args) {
        new AccountMinus().start();
        new AccountPlus().start();
    }

    // допустим есть такие 2 класса, которые выполняют какие либо действия с нашими данными, и в какой-то момент можно уйти в минус если
    // не контролировать эти процессы. Condition контролирует этот процесс, очень похож на wait notify
    static class AccountPlus extends Thread {
        @Override
        public void run() {
            lock.lock();
            account += 10;
            condition.signal();
            lock.unlock();
        }
    }

    static class AccountMinus extends Thread {
        @Override
        public void run() {
            if (account < 10)
                try {
                    lock.lock();
                    System.out.println("account = " + account);
                    condition.await();
                    System.out.println("account = " + account);
                    lock.unlock();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            account -= 10;
            System.out.println("account at the end = " + account);
        }
    }
}