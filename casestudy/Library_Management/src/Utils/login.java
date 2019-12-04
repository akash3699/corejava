package Utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class login {
	
	public static boolean validate(String email,String password)
	{
		try (Connection conn = DBUtils.getConnection();
				Statement stmt = conn.createStatement(); )
		{
			
			ResultSet rs = stmt.executeQuery("select passwd from users where email ="+email); 
			String dbPWD = rs.getString("passwd");
			
			if(dbPWD==password)
			{
				return true;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	public static String getRole(String email)
	{
		try (Connection conn = DBUtils.getConnection();
				Statement stmt = conn.createStatement(); )
		{
			
			ResultSet rs = stmt.executeQuery("select role from users where email ="+email); 
			return rs.getString("role");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
