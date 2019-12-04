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
import pojo.issueRecord;



public class IssueDao implements Closeable
{
	private Connection connection;
	private CallableStatement stmtInsert;
	private CallableStatement stmtUpdate;
	private CallableStatement stmtDelete;
	private CallableStatement stmtSelect;
	
	public IssueDao() throws Exception 
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareCall("{call sp_insert_book(?,?,?,?)}");
		this.stmtUpdate = this.connection.prepareCall("{call sp_update_book(?,?)}");
		this.stmtDelete = this.connection.prepareCall("{call sp_delete_book(?)}");
		this.stmtSelect = this.connection.prepareCall("{call sp_select_book()}");
	}
	
	public int insertBook(issueRecord issuerecord) throws Exception
	{
		this.stmtInsert.setInt(1, issuerecord.getRecord_Id());
		this.stmtInsert.setInt(2, issuerecord.getCopy_Id());
		this.stmtInsert.setInt(3, issuerecord.getMember_Id());
		this.stmtInsert.setDate(4, issuerecord.getDt());
		
		this.stmtInsert.execute();
		return this.stmtInsert.getUpdateCount();
	}
	public int updateBook( int recordid, int copyid )throws Exception
	{
		this.stmtUpdate.setInt(1, recordid );
		this.stmtUpdate.setInt(2, copyid);
		this.stmtUpdate.execute();
		return this.stmtUpdate.getUpdateCount();
	}
	public int deleteBook( int recordId )throws Exception
	{
		this.stmtDelete.setInt(1, recordId );
		this.stmtDelete.execute();
		return this.stmtDelete.getUpdateCount();
	}
	public List<issueRecord> getBooks( )throws Exception
	{
		List<issueRecord> userList = new ArrayList<issueRecord>();
		if( this.stmtSelect.execute() )
		{
			try( ResultSet rs = this.stmtSelect.getResultSet())
			{
				while( rs.next())
				{
					issueRecord issuerecord = new issueRecord();
					
					issuerecord.setRecord_Id( rs.getInt("book_id"));
					issuerecord.setCopy_Id( rs.getInt("Copy_Id"));
					issuerecord.setMember_Id( rs.getInt("Member_Id") );
					issuerecord.setDt( rs.getDate("Date") );
					
					userList.add(issuerecord);
				}
			}
		}
		return userList;
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
	
	

