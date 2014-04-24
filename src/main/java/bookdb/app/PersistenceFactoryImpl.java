package bookdb.app;

import java.util.HashMap;

import javax.persistence.EntityManager;

import bookdb.repositoryjpa.BookJpaRepository;
import bookdb.repositoryjpa.JpaRepository;
import bookdb.repositoryjpa.PersistenceFactory;
import bookdb.repositoryjpa.PersonJpaRepository;

/**
 * The factory for all repositories...
 */
public class PersistenceFactoryImpl implements PersistenceFactory {

    private final HashMap<Class<?>, JpaRepository> repositories = new HashMap<>();

    public PersistenceFactoryImpl(EntityManager entityManager) {
        BookJpaRepository bookJpaRepository = new BookJpaRepository();
        bookJpaRepository.setEntityManager(entityManager);
        repositories.put(BookJpaRepository.class, bookJpaRepository);

        PersonJpaRepository personJpaRepository = new PersonJpaRepository();
        personJpaRepository.setEntityManager(entityManager);
        repositories.put(PersonJpaRepository.class, personJpaRepository);
    }

	@Override
	public BookJpaRepository bookJpaRepository() {
		return (BookJpaRepository)repositories.get(BookJpaRepository.class);
	}

	@Override
	public PersonJpaRepository personJpaRepository() {
		return (PersonJpaRepository)repositories.get(PersonJpaRepository.class);
	}
}
