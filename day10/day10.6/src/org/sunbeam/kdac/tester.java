package org.sunbeam.kdac;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import Utils.DBUtils;

public class tester {
	Connection connection = null;
	Statement statement = null;
	Scanner sc = new Scanner(System.in);
	public void printEmployees()
	{
		
		try {
			connection = DBUtils.getConnection();
			statement = connection.createStatement();
			
			String query = "SELECT * FROM employees";
			ResultSet rs = statement.executeQuery(query);
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

	public void insertEmployee(){
		try {
			connection = DBUtils.getConnection();
			statement = connection.createStatement();
			System.out.print("Enter EmpId : ");
			int empid = sc.nextInt();
			System.out.print("Enter EmpName : ");
			String empName = sc.next();
			System.out.print("Enter EmpSalary : ");
			Float empSal = sc.nextFloat();
			System.out.print("Enter Emp JoinDate yyyy-mm-dd : ");
			String empJoinDate = sc.next();
			
			
			
			String query = "Insert into employees values ("+empid+",'"+empName+"',"+empSal+",'"+empJoinDate+"')";
			int rs = statement.executeUpdate(query);
			if(rs>0)
			{
				System.out.println("Record Inserted");
			}
			else
			{
				System.out.println("Something Went Wrong");
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void updateEmployee() {
		try {
			connection = DBUtils.getConnection();
			statement = connection.createStatement();
			System.out.print("Enter EmpId : ");
			int empid = sc.nextInt();
			System.out.print("Enter EmpName : ");
			String empName = sc.next();
			System.out.print("Enter EmpSalary : ");
			Float empSal = sc.nextFloat();
			System.out.print("Enter Emp JoinDate yyyy-mm-dd : ");
			String empJoinDate = sc.next();
			
			
			
			String query = "Update  employees set emp_name ='"+empName+"', salary = "+empSal+", join_date = '"+empJoinDate+"' where emp_id ="+empid+";";
			System.out.println(query);
			int rs = statement.executeUpdate(query);
			if(rs>0)
			{
				System.out.println("Record Updated");
			}
			else
			{
				System.out.println("Something Went Wrong");
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void deleteEmployee() {
		try {
			connection = DBUtils.getConnection();
			statement = connection.createStatement();
			System.out.print("Enter EmpId want to delete: ");
			int empid = sc.nextInt();
			
			String query = "DELETE FROM  employees where emp_id ="+empid+";";
			int rs = statement.executeUpdate(query);
			if(rs>0)
			{
				System.out.println("Record Deleted");
			}
			else
			{
				System.out.println("Something Went Wrong");
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
