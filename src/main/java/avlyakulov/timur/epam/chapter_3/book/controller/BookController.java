package avlyakulov.timur.epam.chapter_3.book.controller;

import avlyakulov.timur.epam.chapter_3.book.entity.Book;
import avlyakulov.timur.epam.chapter_3.book.service.BookService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookController {

    private final BookService bookService = new BookService();

    public void run() {
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
        System.out.println("if you want create book, please enter 1");
        System.out.println("if you get all books of given author, please enter 2");
        System.out.println("if you want get list of books of given publishing house, please enter 3");
        System.out.println("if you want get list of books of given year, please enter 4");
        System.out.println("if you want findAll user, please enter 5");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> create(reader);
            case "2" -> getBooksCurrentAuthor(reader);
            case "3" -> getBooksPublishingHouse(reader);
            case "4" -> getBooksAfterCurrentYear(reader);
            case "5" -> findAll();
        }
        runNavigation();
    }

    public void create(BufferedReader reader) {
        System.out.println("BookController.create");
        try {
            System.out.println("Enter book name");
            String name = reader.readLine();
            System.out.println("Enter book publishing house");
            String publishingHouse = reader.readLine();
            System.out.println("Enter book year create");
            String yearStr = reader.readLine();
            int year = Integer.parseInt(yearStr);
            System.out.println("Enter number pages");
            String numberPagesStr = reader.readLine();
            int numberPages = Integer.parseInt(numberPagesStr);
            System.out.println("Enter price of book");
            String priceStr = reader.readLine();
            int price = Integer.parseInt(priceStr);
            System.out.println("Enter book author");
            String author = reader.readLine();
            Book book = new Book();
            book.setName(name);
            book.setPublishingHouse(publishingHouse);
            book.setYear(year);
            book.setNumberPages(numberPages);
            book.setPrice(price);
            book.setAuthor(author);
            bookService.create(book);
        } catch (IOException e) {
            System.out.println("problem = " + e.getMessage());
        }
    }

    public void getBooksCurrentAuthor(BufferedReader reader) {
        System.out.println("BookController.getBooksCurrentAuthor");
        try {
            System.out.println("Enter Author name");
            String author = reader.readLine();
            Book[] books = bookService.getBooksCurrentAuthor(author);
            System.out.println("All books of " + author);
            for (Book book : books)
                if (book != null)
                    System.out.println(book);
        } catch (IOException e) {
            System.out.println("problem = " + e.getMessage());
        }
    }

    public void getBooksPublishingHouse(BufferedReader reader) {
        try {
            System.out.println("Enter name publishing house ");
            String publishingHouse = reader.readLine();
            Book[] books = bookService.getBooksPublishingHouse(publishingHouse);
            System.out.println("All books of " + publishingHouse);
            for (Book book : books)
                if (book != null)
                    System.out.println(book);
        } catch (IOException e) {
            System.out.println("problem = " + e.getMessage());
        }
    }

    public void getBooksAfterCurrentYear(BufferedReader reader) {
        try {
            System.out.println("Enter year to find all books after this year ");
            String yearStr = reader.readLine();
            int year = Integer.parseInt(yearStr);
            String[] books = bookService.getBooksAfterCurrentYear(year);
            System.out.println("All books after " + year);
            for (String book : books)
                if (book != null)
                    System.out.print(book + ", ");
        } catch (IOException e) {
            System.out.println("problem = " + e.getMessage());
        }
    }

    public void findAll() {
        Book[] books = bookService.findAll();
        for (Book book : books)
            if (book != null)
                System.out.println(book);
    }
}
