package avlyakulov.timur.epam.chapter_3.book.controller;

import avlyakulov.timur.epam.chapter_3.book.service.BookService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookController {

    private final BookService bookService = new BookService();

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

}
