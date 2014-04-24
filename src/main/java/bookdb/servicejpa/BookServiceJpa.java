package bookdb.servicejpa;

import org.springframework.beans.factory.annotation.Autowired;

import bookdb.domain.Author;
import bookdb.domain.Book;
import bookdb.domain.Category;
import bookdb.repositoryjpa.BookJpaRepository;

public class BookServiceJpa implements ServiceJpa {
	@Autowired
    private BookJpaRepository bookJpaRepository;

    public void createNewBook(String name, String isbn, Author author, Category category) {
    	Book book = new Book(name, isbn, author, category);
    	bookJpaRepository.persist(book);
    }

    public void setBookJpaRepository(BookJpaRepository bookJpaRepository) {
        this.bookJpaRepository = bookJpaRepository;
    }
}
