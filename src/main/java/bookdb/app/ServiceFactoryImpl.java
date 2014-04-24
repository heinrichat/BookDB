package bookdb.app;

import java.util.HashMap;

import bookdb.repositoryjpa.PersistenceFactory;
import bookdb.servicejpa.BookServiceJpa;
import bookdb.servicejpa.ServiceJpa;
import bookdb.servicejpa.ServiceJpaFactory;

public class ServiceFactoryImpl implements ServiceJpaFactory {

    private final HashMap<Class<?>, ServiceJpa> services = new HashMap<>();

    private PersistenceFactory persistenceFactory;

    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
        this.persistenceFactory = persistenceFactory;
    }

	@Override
	public BookServiceJpa bookService() {
		BookServiceJpa bookService = new BookServiceJpa();
		bookService.setBookJpaRepository(persistenceFactory.bookJpaRepository());
		return bookService;
	}

}
