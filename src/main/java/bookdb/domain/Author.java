package bookdb.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Author extends Person {
	@OneToOne(targetEntity=Publisher.class)
	private Publisher publisher;
	
	protected Author() {
		
	}

	public Author(String name, Date birthday, String address, char gender,
			Publisher publisher) {
		super(name, birthday, address, gender);
		this.publisher = publisher;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
}
