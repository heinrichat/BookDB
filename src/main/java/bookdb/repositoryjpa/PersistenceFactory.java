package bookdb.repositoryjpa;

public interface PersistenceFactory {

    BookJpaRepository bookJpaRepository();

    PersonJpaRepository personJpaRepository();
}