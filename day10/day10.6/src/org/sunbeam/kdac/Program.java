package org.sunbeam.kdac;

import java.util.Scanner;

public class Program
{
	static Scanner sc = new Scanner(System.in);
	public static int menuList()
	{
		System.out.println("0. Exit");
		System.out.println("1. Print Records");
		System.out.println("2. Insert Record");
		System.out.println("3. Update Record");
		System.out.println("4. Delete Record");
		System.out.print("Enter Choice : ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		int choice;
		tester t1 = new tester();
		while((choice=Program.menuList()) != 0)
		{
			switch (choice) {
			case 1:
				t1.printEmployees();
				break;
			case 2:
				t1.insertEmployee();
				break;
				
			case 3:
				t1.updateEmployee();
				break;
				
			case 4:
				t1.deleteEmployee();
				break;

			default:
				System.out.println("Enter Correct Choice  ");
				break;
			}
		}
	}
}
