package org.sunbeam.kdac;

import java.util.Arrays;

class Employee implements Comparable<Employee>
{
	private String name;
	private int empid;
	private float salary;
	public Employee() 
	{	}
	public Employee(String name, int empid, float salary)
	{
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	public String getName() 
	{
		return this.name;
	}
	public int getEmpid() 
	{
		return this.empid;
	}
	public float getSalary() 
	{
		return this.salary;
	}
	@Override
	public int compareTo(Employee other)
	{
		if( this.empid < other.empid )
			return -1;
		else if( this.empid > other.empid )
			return 1;
		return 0;
	}
	/*@Override
	public int compareTo(Employee other)
	{
		return this.empid - other.empid;
	}*/
	/*@Override
	public int compareTo(Employee other)
	{
		return (int) (this.salary - other.salary);
	}*/
	/*@Override
	public int compareTo(Employee other) 
	{
		return this.name.compareTo( other.name );
	}*/
	@Override
	public String toString() 
	{
		return String.format("%-15s%-5d%-10.2f", this.name, this.empid, this.salary);
	}
}
public class Program 
{
	public static Employee[] getEmployees( )
	{
		Employee[] arr = new Employee[ 5 ];
		arr[ 0 ] = new Employee("Vikas",50,85000.50f);
		arr[ 1 ] = new Employee("Amol",20,80000.50f);
		arr[ 2 ] = new Employee("Prashant",10,75000.50f);
		arr[ 3 ] = new Employee("Rahul",40,70000.50f);
		arr[ 4 ] = new Employee("Sarang",30,65000.50f);
		return arr;
	}
	private static void print(Employee[] arr) 
	{
		if( arr != null )
		{
			for (Employee emp : arr) 
				System.out.println(emp.toString());
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		 Employee[] arr = Program.getEmployees();
		 Program.print( arr );
		 Arrays.sort( arr );
		 Program.print( arr );
	}
}