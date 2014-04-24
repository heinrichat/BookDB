package bookdb.repository;

import org.springframework.data.repository.CrudRepository;

import bookdb.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	Book findByTitle(String title);
	Book findByIsbn(String isbn);
}
