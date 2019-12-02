package org.sunbeam.kdac;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Program
{
	public static final String URL = "jdbc:mysql://localhost:3306/kdac_db";
	public static final String USER = "kdac";
	public static final String PASSWORD = "kdac";
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			
			
//			Driver driver = new com.mysql.cj.jdbc.Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			
			statement = connection.createStatement();
			
			String query = "SELECT * FROM employees";
			ResultSet rs = statement.executeQuery(query);
//			System.out.println("Emp id Emp Name  Emp Salary Emp JoinDate");
			while(rs.next())
			{
				
				System.out.printf("%-5d%-15s%-10.2f%s \n",rs.getInt("emp_id")
									,rs.getString("emp_name")
									,rs.getFloat("salary")
									,rs.getDate("join_date"));
				
			}
			rs.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
