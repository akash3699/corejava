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
import pojo.copies;
public class copiesdao implements Closeable
	{
		private Connection connection;
		private CallableStatement stmtInsert;
		private CallableStatement stmtUpdate;
		private CallableStatement stmtUpdateRack;
		private CallableStatement stmtUpdateStatus;
		private CallableStatement stmtDelete;
		private CallableStatement stmtSelect;
		private CallableStatement stmtSelectByStatus;
		public copiesdao() throws Exception 
		{
			this.connection = DBUtils.getConnection();
			this.stmtInsert = this.connection.prepareCall("{call sp_insert_copies(?,?,?,?)}");
			this.stmtUpdate = this.connection.prepareCall("{call sp_update_copies(?,?)}");
			this.stmtDelete = this.connection.prepareCall("{call sp_delete_copies(?)}");
			this.stmtSelect = this.connection.prepareCall("{call sp_select_copies()}");
			this.stmtSelectByStatus = this.connection.prepareCall("{call sp_select_copies_status(?)}");
		}
		public int insertcopies(copies copies) throws Exception
		{
			this.stmtInsert.setInt(3, copies.getCopiesid());
			this.stmtInsert.setInt(1, copies.getRack());
			this.stmtInsert.setString(2, copies.getStatus());
			this.stmtInsert.setInt(4, copies.getBookid());



			this.stmtInsert.execute();
			return this.stmtInsert.getUpdateCount();
		}
		public int updatecopies( int bookId, String status )throws Exception
		{
			this.stmtUpdate.setInt(1, bookId );
			this.stmtUpdate.setString(2, status);
			this.stmtUpdate.execute();
			return this.stmtUpdate.getUpdateCount();
		}
		public int deletecopies( int copiesid )throws Exception
		{
			this.stmtDelete.setInt(1, copiesid );
			this.stmtDelete.execute();
			return this.stmtDelete.getUpdateCount();
		}
		public List<copies> getcopies( )throws Exception
		{
			List<copies> copiesList = new ArrayList<copies>();
			if( this.stmtSelect.execute() )
			{
				try( ResultSet rs = this.stmtSelect.getResultSet())
				{
					while( rs.next())
					{
						copies copies = new copies();
						copies.setCopiesid(rs.getInt("copiesid"));
						copies.setBookid(rs.getInt("bookid"));
						copies.setRack(rs.getInt("rack"));
						copies.setStatus( rs.getString("status") );
						
						copiesList.add(copies);
	
				}
			}
			
		}
			return copiesList;
		}
		public List<copies> getAvailableBooks( )throws Exception
		{
			List<copies> copiesList = new ArrayList<copies>();
			this.stmtSelectByStatus.setString(1, "available");
			if( this.stmtSelectByStatus.execute() )
			{
				try( ResultSet rs = this.stmtSelectByStatus.getResultSet())
				{
					while( rs.next())
					{
						copies copies = new copies();
						copies.setCopiesid(rs.getInt("id"));
						copies.setBookid(rs.getInt("book_id"));
						copies.setRack(rs.getInt("rack"));
						copies.setStatus( rs.getString("status") );
						
						copiesList.add(copies);
	
				}
			}
			
		}
			return copiesList;
		}
		@Override
		public void close() throws IOException {
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
