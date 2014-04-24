package bookdb.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book extends BasePersistable {
	private String title;
	private String isbn;
	
	// Unter Umständen auch OneToMany, aber das sollte so passen
	@ManyToOne
	private Author author;
	@ManyToOne
	private Category category;
	
	private Book() {
		
	}
	
	public Book(String title, String isbn, Author author, Category category) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
