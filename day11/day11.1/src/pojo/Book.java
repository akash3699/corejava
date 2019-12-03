package pojo;

public class Book {
	
	private int book_id;
	private String subject_name,book_name,author_name;
	private float price;
	public Book() 
	{	}
	public Book(int book_id, String subject_name, String book_name, String author_name, float price) {
		super();
		this.book_id = book_id;
		this.subject_name = subject_name;
		this.book_name = book_name;
		this.author_name = author_name;
		this.price = price;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%-10d%-15s%-50s%-20s%-10.2f", this.book_id, this.subject_name, this.book_name,this.author_name,this.price);
	}
	
	
}
