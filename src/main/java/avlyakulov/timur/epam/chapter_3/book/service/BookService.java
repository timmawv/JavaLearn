package avlyakulov.timur.epam.chapter_3.book.service;

import avlyakulov.timur.epam.chapter_3.book.dao.BookDao;
import avlyakulov.timur.epam.chapter_3.book.entity.Book;

public class BookService {
    private final BookDao bookDao = new BookDao();

    public void create (Book book) {
        bookDao.create(book);
    }
    public Book[] getBooksCurrentAuthor(String author) {
        return bookDao.getBooksCurrentAuthor(author);
    }

    public Book[] getBooksPublishingHouse (String publishingHouse){
        return bookDao.getBooksPublishingHouse(publishingHouse);
    }
    public String [] getBooksAfterCurrentYear (int year) {
        return bookDao.getBooksAfterCurrentYear(year);
    }
    public Book[] findAll () {
        return bookDao.findAll();
    }
}
