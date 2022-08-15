package avlyakulov.timur.book.chapter_3.customer.controller;

import avlyakulov.timur.book.chapter_3.customer.entity.Customer;
import avlyakulov.timur.book.chapter_3.customer.service.CustomerService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerController {
    private final CustomerService customerService = new CustomerService();

    public  void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select your option ");
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                crud(position, reader);
                position = reader.readLine();
                if (position.equals("0"))
                    System.exit(0);
                crud(position, reader);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("if you want create customer, please enter 1");
        System.out.println("if you get Alphabet order of customers, please enter 2");
        System.out.println("if you want get range of customers with the credit number, please enter 3");
        System.out.println("if you want findAll user, please enter 4");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> create(reader);
            case "2" -> getAlphabetOrder();
            case "3" -> getCustomersWithRangeCreditNumber(reader);
            case "5" -> findAll();
        }
        runNavigation();
    }

    public void create(BufferedReader reader) {
        System.out.println("Customer.create");
        try {
            System.out.println("Enter customer name");
            String name = reader.readLine();
            System.out.println("Enter customer surname");
            String surName = reader.readLine();
            System.out.println("Enter customer address");
            String address = reader.readLine();
            System.out.println("Enter customer credit card number");
            String creditNumberString = reader.readLine();
            int creditNumber = Integer.parseInt(creditNumberString);
            System.out.println("Enter customer bank number");
            String bankNumberString = reader.readLine();
            int bankNumber = Integer.parseInt(bankNumberString);
            Customer customer = new Customer();
            customer.setName(name);
            customer.setSurName(surName);
            customer.setAddress(address);
            customer.setCreditCardNumber(creditNumber);
            customer.setBankAccountNumber(bankNumber);
            customerService.create(customer);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    public void getAlphabetOrder() {
        System.out.println("CustomerController.getAlphabetOrder");
        Customer[] customers = customerService.getAlphabetOrder();
        for (Customer customer : customers)
            if (customer != null)
                System.out.println("customer " + customer);
    }

    public void getCustomersWithRangeCreditNumber(BufferedReader reader) {
        System.out.println("CustomerController.getCustomersWithRangeCreditNumber");
        try {
            System.out.println("Enter range of credit number");
            System.out.println("Enter begin of range");
            String startString = reader.readLine();
            int start = Integer.parseInt(startString);
            System.out.println("Enter end of end");
            String endString = reader.readLine();
            int end = Integer.parseInt(endString);
            Customer[] customers = customerService.getCustomersWithRangeCreditNumber(start, end);
            for (Customer customer : customers)
                if (customer != null)
                    System.out.println("customer " + customer);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    public void findAll() {
        System.out.println("CustomerController.findAll");
        Customer[] customers = customerService.findAll();
        for (Customer customer : customers)
            if (customer != null)
                System.out.println("customer " + customer);
    }
}
