package bookdb.repository;

import org.springframework.data.repository.CrudRepository;

import bookdb.domain.Book;
import bookdb.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
	Book findByName(String name);
}
