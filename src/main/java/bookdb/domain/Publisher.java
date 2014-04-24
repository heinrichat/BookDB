package bookdb.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "publishers")
public class Publisher extends BasePersistable {
	private String name;
	
	protected Publisher() {
		
	}
	
	public Publisher(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
