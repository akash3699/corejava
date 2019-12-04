package Test;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int mainMenuList()
	{
		System.out.println("0. Exit");
		System.out.println("1. Sign in");
		System.out.println("3. Sign up");
		System.out.print("Enter Choice  : ");
		return sc.nextInt();
	}
	public static int subMemberMenuList()
	{
		System.out.println("0. Sign Out");
		System.out.println("1. Edit Profile");
		System.out.println("2. Change Password");
		System.out.println("3. Find Book By Name");
		System.out.println("4. Check Book Availability");
		System.out.println("5. List Issued Books");
		System.out.println("6. Payment History ");
		System.out.print("Enter Choice  : ");
		return sc.nextInt();
	}
	public static int subOwnerMenuList()
	{
		System.out.println("0. Sign Out");
		System.out.println("1. Edit Profile");
		System.out.println("2. Change Password");
		System.out.println("3. Subjectwise Copy Report");
		System.out.println("4. Bookwise Copy Report");
		System.out.println("5. Fees/Fine Report");
		System.out.print("Enter Choice  : ");
		return sc.nextInt();
	}
	public static int subLibrarianMenuList()
	{
		System.out.println("0. Sign Out");
		System.out.println("1. Edit Profile");
		System.out.println("2. Change Password");
		System.out.println("3. Find Book By Name");
		System.out.println("4. Check Book Availability");
		System.out.println("5. Add New Book");
		System.out.println("6. Add New Copy");
		System.out.println("7. Issue Book Copy");
		System.out.println("8. Return Book Copy");
		System.out.println("9. List Issued Books");
		System.out.println("10. Edit Book");
		System.out.println("11. Chnage Rack");
		System.out.println("12. Add Member");
		System.out.println("13. Take Payment");
		System.out.println("14. Payment History ");
		System.out.print("Enter Choice  : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		int choice;
		while((choice=Program.mainMenuList()) != 0)
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
