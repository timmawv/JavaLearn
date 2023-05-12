package avlyakulov.timur.epam.chapter_3.book.dao;

import avlyakulov.timur.epam.chapter_3.book.entity.Book;
import avlyakulov.timur.epam.chapter_3.book.db.BookDB;

public class BookDao {
    public void create(Book book) {
        BookDB.getInstance().create(book);
    }

    public Book[] getBooksCurrentAuthor(String author) {
        return BookDB.getInstance().getBooksCurrentAuthor(author);
    }

    public Book[] getBooksPublishingHouse (String publishingHouse){
        return BookDB.getInstance().getBooksPublishingHouse(publishingHouse);
    }
    public String [] getBooksAfterCurrentYear (int year) {
        return BookDB.getInstance().getBooksAfterCurrentYear(year);
    }
    public Book[] findAll () {
        return BookDB.getInstance().findAll();
    }

}
