package pojo;

import java.util.Date;

public class Emp {

	private int emp_id;
	private String emp_name;
	private float salary;
	private Date join_date;
	public Emp() 
	{   }
	public Emp(int emp_id, String emp_name, float salary, Date join_date) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.join_date = join_date;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	@Override
	public String toString() {
		return String.format("%-5d%-15s%-10.2f%s", this.emp_id,this.emp_name,this.salary,this.join_date) ;
	}
	
}
