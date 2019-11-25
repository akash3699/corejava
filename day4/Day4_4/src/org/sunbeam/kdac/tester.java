package org.sunbeam.kdac;

import java.util.Scanner;

public class tester {
	static  Scanner sc = new Scanner(System.in);
	static emp e1[]=new emp[10] ;
	static int count=0;
	public static int menuList() {
		int choice;
		System.out.println("0)Exit");
		System.out.println("1) Accept Record");
		System.out.println("2) Print Record");
		System.out.println("Enter choice");
		choice=sc.nextInt();
		return choice;
	}
	public static void acceptRecord()
	{
		e1[count]=new emp();
		System.out.printf("Enter Empid : ");
		e1[count].setEmpid(sc.nextInt()) ;
		System.out.printf("Enter Emp Name : ");
		e1[count].setEmpName(sc.next());
		System.out.printf("Enter Emp Designation : ");
		e1[count].setEmpDesig(sc.next());
		System.out.printf("Enter Emp Department : ");
		e1[count].setEmpDept(sc.next()); ;
		System.out.printf("Enter Emp Salary : ");
		e1[count].setEmpSal(sc.nextFloat());;
		System.out.println(e1[count]);
		count++;
	}
	public static void printRecord()
	{
		for(int index=0;index<count;index++)
		{
			System.out.println("===================EMP NO = "+index+"======================");
			System.out.println("Empid :"+e1[index].empid);
			System.out.println("Emp Name :"+e1[index].empName);
			System.out.println("Emp Designation :"+e1[index].empDesig);
			System.out.println("Emp Department :"+e1[index].empDept);
			System.out.println("Emp Salary :"+e1[index].empSal);
			System.out.println("=========================================");
		}
	}
	

}
