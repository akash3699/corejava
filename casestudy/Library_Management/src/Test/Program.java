package Test;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int mainmenuList()
	{
		System.out.println("0. Exit");
		System.out.println("1. Sign in");
		System.out.println("3. Sign up");
		System.out.print("Enter Choice  : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		int choice;
		while((choice=Program.mainmenuList()) != 0)
		{
			switch (choice) {
			case 1:
				break;
			case 2:
				break;
			default:
				System.out.println("Enter Correct choice");
				break;
			}
		}
		

	}

}
