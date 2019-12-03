package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Utils.DBUtils;
import pojo.Book;

public class BookDao 
{
	private Connection connection;
	private CallableStatement stmtInsert ;
	private CallableStatement stmtUpdate ;
	private CallableStatement stmtDelete ;
	private CallableStatement stmtSelect ;
	public BookDao()
	{
		try {
			this.connection = DBUtils.getConnection();
			this.stmtInsert = this.connection.prepareCall("{call sp_insert_book(?,?,?,?,?)}");
			this.stmtUpdate = this.connection.prepareCall("{call sp_update_book(?,?)}");
			this.stmtDelete = this.connection.prepareCall("{call sp_delete_book(?)}");
			this.stmtSelect = this.connection.prepareCall("{call sp_select_book()}");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insertBook(Book book) throws Exception
	{
		this.stmtInsert.setInt(1, book.getBook_id());
		this.stmtInsert.setString(2, book.getSubject_name());
		this.stmtInsert.setString(3, book.getBook_name());
		this.stmtInsert.setString(4, book.getAuthor_name());
		this.stmtInsert.setFloat(5, book.getPrice());
		this.stmtInsert.execute();
		
		return this.stmtInsert.getUpdateCount();
	}
	public int updateBook(int bookid, float price) throws Exception
	{
		this.stmtUpdate.setInt(1, bookid);
		this.stmtUpdate.setFloat(2,price );
		this.stmtUpdate.execute();
		
		return this.stmtUpdate.getUpdateCount();
	}
	public int deleteBook(int bookid) throws Exception
	{
		this.stmtDelete.setInt(1, bookid);
		this.stmtDelete.execute();
		
		return this.stmtDelete.getUpdateCount();
	}
	
	public List<Book> getBooks() throws Exception
	{
		List<Book> bookList = new ArrayList<>();
		if(this.stmtSelect.execute())
		{
			try(ResultSet rs = this.stmtSelect.getResultSet())
			{
				while(rs.next())
				{
					Book b1 = new Book();
					b1.setBook_id(rs.getInt("book_id"));
					b1.setSubject_name(rs.getString("subject_name"));
					b1.setBook_name(rs.getString("book_name"));
					b1.setAuthor_name(rs.getString("author_name"));
					b1.setPrice(rs.getFloat("price"));
					bookList.add(b1);
				}
			}
			
		}
		return bookList;
	}
	
	
	
	
	

}
