package bookdb.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bookdb.domain.Author;
import bookdb.domain.Book;
import bookdb.domain.Category;
import bookdb.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public void createNewBook(String name, String isbn, Author author, Category category) {
        Book book = new Book(name, isbn, author, category);
        bookRepository.save(book);
    }
}
