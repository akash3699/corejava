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
import pojo.user_p;


public class UserDao implements Closeable
{
	private Connection connection;
	private CallableStatement stmtInsert;
	private CallableStatement stmtUpdate;
	private CallableStatement stmtDelete;
	private CallableStatement stmtSelect;
	
	public UserDao() throws Exception 
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareCall("{call sp_insert_users(?,?,?,?,?,?)}");
		this.stmtUpdate = this.connection.prepareCall("{call sp_update_users(?,?)}");
		this.stmtDelete = this.connection.prepareCall("{call sp_delete_users(?)}");
		this.stmtSelect = this.connection.prepareCall("{call sp_select_users()}");
	}
	
	public int insertUser(user_p up) throws Exception
	{
		this.stmtInsert.setInt(1, up.getUser_Id());
		this.stmtInsert.setString(2, up.getUser_Name());
		this.stmtInsert.setString(3, up.getEmail());
		this.stmtInsert.setLong(4, up.getPhone());
		this.stmtInsert.setString(5, up.getPassword());
		this.stmtInsert.setString(6, up.getRole());
		
		this.stmtInsert.execute();
		return this.stmtInsert.getUpdateCount();
	}
	public int updateUser( int userid, String user_Name )throws Exception
	{
		this.stmtUpdate.setInt(1, userid );
		this.stmtUpdate.setString(2, user_Name);
		this.stmtUpdate.execute();
		return this.stmtUpdate.getUpdateCount();
	}
	public int deleteUser( int userId )throws Exception
	{
		this.stmtDelete.setInt(1, userId );
		this.stmtDelete.execute();
		return this.stmtDelete.getUpdateCount();
	}
	public List<user_p> getUsers( )throws Exception
	{
		List<user_p>  userList = new ArrayList<>();
		if( this.stmtSelect.execute() )
		{
			try( ResultSet rs = this.stmtSelect.getResultSet())
			{
				while( rs.next())
				{
					user_p up = new user_p();
					up.setUser_Id( rs.getInt("id"));
					up.setUser_Name( rs.getString("name"));
					up.setEmail( rs.getString("email") );
					up.setPhone( rs.getInt("phone") );
					up.setPassword( rs.getString("passwd") );
					up.setRole( rs.getString("role"));
					userList.add(up);
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
	
	

