package org.sunbeam.kdac;

import java.util.Scanner;

public class Program {
	static Scanner sc =new Scanner(System.in);
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Teaching");
		System.out.println("2.NonTeaching");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	
	
	public static void main(String[] args) {
		int choice;
		while((choice=Program.menuList()) != 0)
		{
			Staff st=null;
			switch (choice) {
			case 1:
				
				st=new Teaching();
				
				break;
			case 2:
				st=new Nonteaching();
				break;

			default:
				System.out.println("Enter correct choice");
				break;
			}
			if(st != null)
			{
				Program.acceptEmpinfo(st);
				Program.acceptRecord(st);
				st.calculateSalary();
				Program.printRecord(st);
//				System.out.println("Press Enter Key to Continue ");
//				sc.nextLine();
				System.out.printf("\n\n\n");
			}
		}
		
		
		
	}


	private static void acceptEmpinfo(Staff st) {
		System.out.printf("Enter Empid :");
		st.setEmpid(sc.nextInt());
		System.out.printf("Enter Emp Name :");
		st.setEmpName(sc.next());
		
	}


	private static void printRecord(Staff st) {
		System.out.println("Empid : "+st.empid);
		System.out.println("Emp Name : "+st.empName);
		System.out.println("Salary : "+st.calculateSalary());

	}
	private static void acceptRecord(Staff st) {
		if(st instanceof Teaching)
		{
			Teaching tech = (Teaching) st;
			System.out.printf("Enter Number of Theroy Sessions : ");
			tech.setNoOfTheorySessionCount(sc.nextInt());
			
		}
		else
		{
			Nonteaching nonteaching = (Nonteaching) st;
			System.out.printf("Enter Number of Lab Sessions : ");
			nonteaching.setNoOfLabSessionCount(sc.nextInt());
		}
		
		
	}
}
