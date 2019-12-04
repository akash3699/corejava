package dao;
import java.io.Closeable;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utils.DBUtils;
import pojo.Book;


public class BookDao implements Closeable
{
	private Connection connection;
	private CallableStatement stmtInsert;
	private CallableStatement stmtUpdate;
	private CallableStatement stmtDelete;
	private CallableStatement stmtSelect;
	
	public BookDao() throws Exception 
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareCall("{call sp_insert_book(?,?,?,?,?.?)}");
		this.stmtUpdate = this.connection.prepareCall("{call sp_update_book(?,?)}");
		this.stmtDelete = this.connection.prepareCall("{call sp_delete_book(?)}");
		this.stmtSelect = this.connection.prepareCall("{call sp_select_book()}");
	}
	
	public int insertBook(Book book) throws Exception
	{
		this.stmtInsert.setInt(1, book.getBook_Id());
		this.stmtInsert.setString(2, book.getName());
		this.stmtInsert.setString(3, book.getAuthor());
		this.stmtInsert.setString(4, book.getSubject());
		this.stmtInsert.setFloat(5, book.getPrice());
		this.stmtInsert.setInt(6, book.getIsbn());
		this.stmtInsert.execute();
		return this.stmtInsert.getUpdateCount();
	}
	public int updateBook( int bookId, float price )throws Exception
	{
		this.stmtUpdate.setInt(1, bookId );
		this.stmtUpdate.setFloat(2, price);
		this.stmtUpdate.execute();
		return this.stmtUpdate.getUpdateCount();
	}
	public int deleteBook( int bookId )throws Exception
	{
		this.stmtDelete.setInt(1, bookId );
		this.stmtDelete.execute();
		return this.stmtDelete.getUpdateCount();
	}
	public List<Book> getBooks( )throws Exception
	{
		List<Book> bookList = new ArrayList<Book>();
		if( this.stmtSelect.execute() )
		{
			try( ResultSet rs = this.stmtSelect.getResultSet())
			{
				while( rs.next())
				{
					Book book = new Book();
					book.setBook_Id( rs.getInt("book_id"));
					book.setSubject( rs.getString("subject_name"));
					book.setName( rs.getString("book_name") );
					book.setAuthor( rs.getString("author_name") );
					book.setPrice( rs.getFloat("price"));
					bookList.add(book);
				}
			}
		}
		return bookList;
	}
	@Override
	public void close() throws IOException 
	{
		try
		{
			this.connection.close();
		} 
		catch (SQLException cause) 
		{
			throw new IOException(cause);
		}
	}
}
	
	

