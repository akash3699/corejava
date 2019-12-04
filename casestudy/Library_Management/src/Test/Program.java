package Test;

import java.util.Scanner;
import Utils.*;

public class Program {
	static Scanner sc = new Scanner(System.in);
	static int userid;
	public static int mainMenuList()
	{
		System.out.println("0. Exit");
		System.out.println("1. Sign in");
		System.out.println("2. Sign up");
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
		String Roll;
		
		while((choice=Program.mainMenuList()) != 0)
		{
			switch (choice) {
			case 1:
				if((Roll =Program.login() )!= null)
				{
					
					switch (Roll) {
					case "owner":
						int owner;
						while((owner=Program.subOwnerMenuList()) != 0)
						{
							switch (owner) {
							case 1:
								Program.editProfile(userid);
								
								break;

							default:
								break;
							}
							
						}
						
						break;
					case "user":
						int user;
						while((user=Program.subMemberMenuList()) != 0)
						{
							switch (user) {
							case 1:
								Program.editProfile(userid);
								break;

							default:
								break;
							}
						}
						
						break;
					case "librarian":
						int librarian;
						while((librarian=Program.subLibrarianMenuList()) != 0)
						{
							switch (librarian) {
							case 1:
								Program.editProfile(userid);
								break;

							default:
								break;
							}
							
						}
						break;

					default:
						break;
					}
					
				}
				else
				{
					System.out.println("Email/password is incorrect");
				}
				
				break;
			case 2:
				break;
			default:
				System.out.println("Enter Correct choice");
				break;
			}
		}
		

	}
	private static void editProfile(int userid) {
		// TODO Auto-generated method stub
		
	}
	private static String login() {
		String email,password;
		System.out.print("Enter email id  : ");
		email = sc.next();
		System.out.print("Enter password  : ");
		password = sc.next();
		if(login.validate(email,password))
		{
			userid=login.getUserid(email);
			String role = login.getRole(email);
			return role;
		}
		else
		{
			return null;
		}
		
	}

}
