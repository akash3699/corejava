package Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {

	
	public static final String URL = "jdbc:mysql://localhost:3306/kdac_db";
	public static final String USER = "kdac";
	public static final String PASSWORD = "kdac";
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws Exception
	{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
