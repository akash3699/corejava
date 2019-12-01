package org.sunbeam.kdac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
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
		return this.empid - other.empid;
	}
	@Override
	public String toString() 
	{
		return String.format("%-15s%-5d%-10.2f", this.name, this.empid, this.salary);
	}
}
class SortByName implements Comparator<Employee>
{
	@Override
	public int compare(Employee emp1, Employee emp2) 
	{
		return emp1.getName().compareTo(emp2.getName());
	}
}
class SortByEmpid implements Comparator<Employee>
{
	@Override
	public int compare(Employee emp1, Employee emp2) 
	{
		return emp1.getEmpid() - emp2.getEmpid();
	}
}
class SortBySalary implements Comparator<Employee>
{
	@Override
	public int compare(Employee emp1, Employee emp2) 
	{
		return (int) (emp1.getSalary() - emp2.getSalary());
	}
}
public class Program 
{
	static Scanner sc = new Scanner(System.in); 
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
	static int menuList( )
	{
		System.out.println("1. Name");
		System.out.println("2. Empid");
		System.out.println("3. Salary");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		int choice;
		Employee[] arr = Program.getEmployees();
		while( ( choice = Program.menuList( ) ) != 0 )
		{
			Comparator<Employee> comparator = null;
			switch( choice )
			{
			case 1:
				comparator = new SortByName();
				break;
			case 2:
				comparator = new SortByEmpid();
				break;
			case 3:
				comparator = new SortBySalary();
				break;
			}
			Arrays.sort(arr, comparator);
			Program.print(arr);
		}		 
	}
}