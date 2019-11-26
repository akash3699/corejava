package org.sunbeam.kdac;

class Person
{
	String name;
	int age;
	public Person() {
		this.name="";
		this.age=0;
	}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void showRecord()
	{
		System.out.println("Name  :"+this.name);
		System.out.println("Age  :"+this.age);
	}
	
	
}

class Emp extends Person
{
	int empid;
	float salary;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Emp(int empid, float salary) {
		super();
		this.empid = empid;
		this.salary = salary;
	}
	public Emp(String name, int age,int empid, float salary) {
		super(name,age);
		this.empid = empid;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}
	
	public void showRecord()
	{
		super.showRecord();
		System.out.println("Empid  :"+this.empid);
		System.out.println("Salary  :"+this.salary);
	}
	public void displayRecord()
	{
		super.showRecord();
		System.out.println("Empid  :"+this.empid);
		System.out.println("Salary  :"+this.salary);
	}
	
	
}

public class Program {
	
	public static void main(String[] args) {
		Emp e1=new Emp("Akash",25,12,28493);
//		e1.showRecord();
		Person p1=e1;
		p1.showRecord();
	
		
	}
	

}
