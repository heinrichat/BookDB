package bookdb.repository;

import org.springframework.data.repository.CrudRepository;

import bookdb.domain.Author;
import bookdb.domain.Book;

public interface AuthorRepository extends CrudRepository<Author, Long> {
	Book findByName(String name);
}
