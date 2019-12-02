package dao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Utils.DBUtils;
import pojo.Emp;

public class EmpDao implements Closeable
{
	Connection connection=null;
	Statement statement=null;
	public EmpDao() throws Exception
	{
		connection = DBUtils.getConnection();
		statement = connection.createStatement();
	}
	
	public int insert(Emp emp)throws Exception
	{
		String sql = "INSERT INTO employees VALUES("+emp.getEmp_id()+",'"+emp.getEmp_name()+"',"+emp.getSalary()+",'"+emp.getJoin_date()+"')";
		return this.statement.executeUpdate(sql);
	}
	public int update(int empid, float salary) throws Exception
	{
		String sql = "UPDATE employees SET salary="+salary+" WHERE emp_id="+empid+"";
		return this.statement.executeUpdate(sql);
	}
	public int delete(int empid) throws Exception
	{
		String sql ="DELETE FROM employees WHERE emp_id ="+empid+"";
		return this.statement.executeUpdate(sql);
	}
	
	public List<Emp> select() throws Exception
	{
		String sql = "SELECT * FROM employees";
		List<Emp> empList = new ArrayList<>();
		try(ResultSet rs = this.statement.executeQuery(sql))
		{
			while(rs.next())
			{
				Emp emp = new Emp(rs.getInt("emp_id"), rs.getString("emp_name"), rs.getFloat("salary"), rs.getDate("join_date"));
				empList.add(emp);
			}
		}
		
		return empList;
	}
	
	
	
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		try {
			connection.close();
			statement.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new IOException(e);
		}
		
	}
	
}
