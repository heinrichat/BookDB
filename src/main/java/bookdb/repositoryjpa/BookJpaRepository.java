package bookdb.repositoryjpa;

import java.util.List;

import bookdb.domain.Book;

public class BookJpaRepository extends AbstractJpaRepository<Book> {

	@Override
	public List<Book> findAll() {
		return entityManager().createQuery("SELECT b FROM books b", Book.class).getResultList();
	}

	@Override
	public Book findById(Long id) {
		return entityManager().find(Book.class, id);
	}
	
	public List<Book> findByName(String name) {
		return entityManager().createQuery("SELECT b FROM books b WHERE b.name=" + name, Book.class).getResultList();
	}
	
	public Book findByIsbn(String isbn) {
		return entityManager().createQuery("SELECT b FROM books b WHERE b.isbn=" + isbn, Book.class).getResultList().get(0);
	}

}
