package avlyakulov.timur.epam.chapter_3.book.db;

import avlyakulov.timur.epam.chapter_3.book.entity.Book;

import java.util.UUID;

public class BookDB {
    private int current;
    private Book[] books;
    private static BookDB instance;

    private BookDB() {
        books = new Book[10];
    }

    public static BookDB getInstance() {
        if (instance == null) {
            instance = new BookDB();
        }
        return instance;
    }

    public void create(Book book) {
        book.setId(generateId());
        if (current == books.length) {
            Book[] books1 = new Book[books.length + 1];
            System.arraycopy(books, 0, books1, 0, books1.length);
            books = books1;
        }
        books[current] = book;
        current++;
    }

    public Book[] getBooksCurrentAuthor(String author) {
        int i = 0;
        Book[] books1 = new Book[books.length];
        for (Book book : books)
            if (book != null)
                if (book.getAuthor().equals(author)) {
                    books1[i] = book;
                    ++i;
                }
        return books1;
    }
    public Book[] getBooksPublishingHouse(String publishingHouse) {
        int i = 0;
        Book[] books1 = new Book[books.length];
        for (Book book : books)
            if (book != null)
                if (book.getAuthor().equals(publishingHouse)) {
                    books1[i] = book;
                    ++i;
                }
        return books1;
    }
    public String [] getBooksAfterCurrentYear (int year) {
        int i = 0;
        String [] booksNames = new String[books.length];
        for (Book book : books)
            if (book != null)
                if (book.getYear() > year) {
                    booksNames[i] = book.getName();
                    ++i;
                }
        return booksNames;
    }
    public Book [] findAll() {
        return books;
    }



    public String generateId() {
        return UUID.randomUUID().toString();
    }
}
