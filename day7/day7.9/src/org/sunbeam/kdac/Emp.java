package org.sunbeam.kdac;

public class Emp implements Cloneable{
	int empid;
	String name;
	float salary;
	Date joinDate;
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Emp() {
	
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Emp(int empid, String name, float salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	
	public Emp(int empid, String name, float salary, Date joinDate) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.joinDate = joinDate;
	}
	public Emp(int empid, String name, float salary, int day, int month, int year) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.joinDate = new Date(day,month,year);
	}
	
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", salary=" + salary + ", joinDate=" + joinDate + "]";
	}
	@Override
	public Emp clone() throws CloneNotSupportedException {
		Emp other = (Emp) super.clone();
		other.name=new String(this.name);
		other.joinDate= this.joinDate.clone();
//		System.out.println(other);
		return other;
	}
	

}
