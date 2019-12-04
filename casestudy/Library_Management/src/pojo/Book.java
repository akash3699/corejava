package pojo;

public class Book 
{
	private int book_Id;
	private String Name;
	private String Author;
	private String Subject;
	private float price;
	private int isbn;
	public Book()
	{ } 
	public Book(int book_Id, String name, String author, String subject, float price, int isbn) 
	{
		super();
		this.book_Id = book_Id;
		Name = name;
		Author = author;
		Subject = subject;
		this.price = price;
		this.isbn = isbn;
	}

	public int getBook_Id() 
	{
		return book_Id;
	}

	public void setBook_Id(int book_Id) 
	{
		this.book_Id = book_Id;
	}

	public String getName() 
	{
		return Name;
	}

	public void setName(String name) 
	{
		Name = name;
	}

	public String getAuthor() 
	{
		return Author;
	}

	public void setAuthor(String author) 
	{
		Author = author;
	}

	public String getSubject() 
	{
		return Subject;
	}

	public void setSubject(String subject) 
	{
		Subject = subject;
	}

	public float getPrice() 
	{
		return price;
	}

	public void setPrice(float price) 
	{
		this.price = price;
	}

	public int getIsbn() 
	{
		return isbn;
	}

	public void setIsbn(int isbn) 
	{
		this.isbn = isbn;
	}

	@Override
	public String toString() 
	{
		return "books [book_Id=" + book_Id + ", Name=" + Name + ", Author=" + Author + ", Subject=" + Subject
				+ ", price=" + price + ", isbn=" + isbn + "]";
	}
	
	
}
