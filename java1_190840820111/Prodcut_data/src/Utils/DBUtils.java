package Utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {

	static Properties p;
	static {
		
			try {
				p=new Properties();
				p.load(new FileInputStream("Config.properties"));
				Class.forName(p.getProperty("DRIVER"));
				System.out.println("dbutils ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				
			}
			
		
	}
	
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(p.getProperty("URL"), p.getProperty("USER"), p.getProperty("PASSWORD"));
	}
}
