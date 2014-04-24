package bookdb.repositoryjpa;

import java.util.List;

import bookdb.domain.Author;
import bookdb.domain.Book;
import bookdb.domain.Person;

public class PersonJpaRepository extends AbstractJpaRepository<Person> {

	@Override
	public List<Person> findAll() {
		return entityManager().createQuery("SELECT p FROM persons p", Person.class).getResultList();
	}

	@Override
	public Person findById(Long id) {
		return entityManager().find(Person.class, id);
	}
	
	public List<Person> findByName(String name) {
		return entityManager().createQuery("SELECT b FROM persons b WHERE b.name=" + name, Person.class).getResultList();
	}
}
