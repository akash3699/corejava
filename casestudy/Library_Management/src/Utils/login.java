package Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class login {
	
	public static boolean validate(String email,String password)
	{
		try (Connection conn = DBUtils.getConnection();
				PreparedStatement stmt = conn.prepareStatement("select * from users where email=?"); )
		{
			stmt.setString(1, email);
			
				ResultSet rs = stmt.executeQuery();
				rs.next();
				String dbPWD = rs.getString("passwd");
//				System.out.println(rs.getString("passwd"));
				if(dbPWD.equals(password))
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
				PreparedStatement stmt = conn.prepareStatement("select * from users where email=?"); )
		{
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			System.out.println(rs.getString("role"));
			return rs.getString("role");
			
	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static int getUserid(String email)
	{
		try (Connection conn = DBUtils.getConnection();
				PreparedStatement stmt = conn.prepareStatement("select * from users where email=?"); )
		{
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			System.out.println(rs.getString("id"));
			return rs.getInt("id");
			
	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

}
