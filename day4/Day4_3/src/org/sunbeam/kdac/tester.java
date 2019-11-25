package org.sunbeam.kdac;

import java.util.Scanner;

public class tester {
	static  Scanner sc = new Scanner(System.in);
	
	public static emp acceptRecord(emp e1)
	{
		System.out.printf("Enter Empid : ");
		e1.empid= Integer.parseInt(sc.nextLine());
		System.out.printf("Enter Emp Name : ");
		e1.empName= sc.nextLine();
		System.out.printf("Enter Emp Designation : ");
		e1.empDesig= sc.nextLine();
		System.out.printf("Enter Emp Department : ");
		e1.empDept= sc.nextLine();
		System.out.printf("Enter Emp Salary : ");
		e1.empSal= sc.nextFloat();
		return e1;
	}
	public static void printRecord(emp e1)
	{
		System.out.println("Empid :"+e1.empid);
		System.out.println("Emp Name :"+e1.empName);
		System.out.println("Emp Designation :"+e1.empDesig);
		System.out.println("Emp Department :"+e1.empDept);
		System.out.println("Emp Salary :"+e1.empSal);
	}

}
