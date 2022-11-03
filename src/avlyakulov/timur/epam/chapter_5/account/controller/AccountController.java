package avlyakulov.timur.epam.chapter_5.account.controller;

import avlyakulov.timur.epam.chapter_5.account.entity.Account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AccountController {
    Account account;

    public boolean checkAccountCreate() {
        if (account == null) {
            System.out.println("You don't create an account");
            return false;
        } else return true;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String answer;
            runNavigation();
            while ((answer = reader.readLine()) != null) {
                if (answer.equals("0"))
                    System.exit(0);
                crud(answer, reader);
            }
        } catch (IOException e) {
            System.out.println("Your problem is " + e.getMessage());
        }
    }

    public void crud(String answer, BufferedReader reader) {
        switch (answer) {
            case "1" -> {
                if (account != null)
                    System.out.println("You have create an account");
                else createAccount(reader);
            }
            case "2" -> {
                if (checkAccountCreate())
                    makePayment(reader);
            }
            case "3" -> {
                if (checkAccountCreate())
                    System.out.println(account);
            }
            case "4" -> {
                if (checkAccountCreate())
                    System.out.println(Arrays.toString(account.getPayments()));
            }
        }
        runNavigation();
    }


    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create Account press 1");
        System.out.println("If you want to make a payment press 2");
        System.out.println("If you want to get information about account 3");
        System.out.println("If you want to get information about payments press 4");
        System.out.println();
    }

    public void createAccount(BufferedReader reader) {
        try {
            System.out.println("Enter your id to create account");
            String id = reader.readLine();
            System.out.println("Enter balance of your account");
            int balance = Integer.parseInt(reader.readLine());
            account = new Account(id, balance);
        } catch (IOException e) {
            System.out.println("your problem is " + e.getMessage());
        }
    }

    public void makePayment(BufferedReader reader) {
        try {
            System.out.println("Enter amount of money that you need to pay ");
            int amountOfMoney = Integer.parseInt(reader.readLine());
            Account.Payment payment = account.new Payment(amountOfMoney);
            account.makePayment(payment);
        } catch (IOException e) {
            System.out.println("Your enter the wrong number " + e.getMessage());
        }
    }
}
