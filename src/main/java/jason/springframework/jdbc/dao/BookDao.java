package jason.springframework.jdbc.dao;

import jason.springframework.jdbc.domain.Book;

import java.util.List;

public interface BookDao {

    List<Book> findAll();

    Book findByIsbn(String isbn);

    Book getById(Long id);

    Book findBookByTitle(String title);

    Book findBookByTitleCriteria(String title);

    Book findBookByTitleNative(String title);

    Book saveNewBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(Long id);
}
