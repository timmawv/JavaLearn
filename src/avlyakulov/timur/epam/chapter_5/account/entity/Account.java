package avlyakulov.timur.epam.chapter_5.account.entity;

import java.util.Date;

/*
Создать класс Account с внутренним классом, с помощью объектов которо-
го можно хранить информацию обо всех операциях со счетом (снятие, пла-
тежи, поступления).
 */
public class Account {
    private String id;
    private int balance;
    private Payment [] payments;
    private int current;

    public Account(String id, int balance) {
        this.id = id;
        this.balance = balance;
        payments = new Payment[4];
    }

    public void makePayment (Payment payment) {
        System.out.println("making payment...");
        if (balance < payment.amountOfMoney)
            System.out.println("You don't have enough money to make a payment");
        else {
            System.out.println("Yes you have enough money");
            balance = balance - payment.amountOfMoney;
        }
        System.out.println("Your balance is " + balance);
        if (current == payments.length) {
            Payment[] payments1 = new Payment[payments.length + 1];
            System.arraycopy(payments,0,payments1,0,payments.length);
            payments = payments1;
        }
        payments[current] = payment;
        ++current;
    }
    public Payment[] getPayments () {
        return payments;
    }

    @Override
    public String toString () {
        return "Your account id is " + id + "\n"
                + "your balance is " + balance + "\n"
                + "number of transactions " + current;
    }
    public class Payment {
        private Date date;
        private int amountOfMoney;

        public Payment (int amountOfMoney) {
            date = new Date();
            this.amountOfMoney = amountOfMoney;
        }

        @Override
        public String toString() {
            return "Your payment of " + date + "\n"
                    + "and amount of money is " + amountOfMoney+ "\n";
        }
    }
}