package Test;

import java.util.List;
import java.util.Scanner;
import Utils.*;
import dao.BookDao;
import dao.UserDao;
import dao.copiesdao;
import pojo.Book;
import pojo.copies;

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
		
		try {
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
								case 2:
									Program.changePwd(userid);
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
								case 2:
									Program.changePwd(userid);
									break;
								case 3:
									Program.findBookByName();
									break;
								case 4:
									Program.listIssuedBooks(userid);

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
								case 2:
									Program.changePwd(userid);
									break;
								case 3:
									
									break;
								case 4:
									break;
								case 5:
									Program.addBook();
									break;
								case 6:
									Program.addnewCopy();
									break;
								case 7:
									break;
								case 8:
									break;
								case 9:
									break;
								case 10:
									break;
								case 11:
									break;
								case 12:
									break;
								case 13:
									break;
								case 14:
									
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	private static void listIssuedBooks(int userid2) throws Exception {
		BookDao b1 = new BookDao();
		b1.getIssuedBooks();
		
	}
	private static void findBookByName() throws Exception {
		System.out.print(" Enter Book Name  : ");
		BookDao b1 = new BookDao();
		List<Book> b = b1.getBooksByName(sc.next());
		b.forEach( System.out::println);
		
	}
	private static void addnewCopy() throws Exception {
		copies c1 = new copies();
		System.out.println("Enter Bookid");
		c1.setBookid(sc.nextInt());
		System.out.println("Enter Id");
		c1.setCopiesid(sc.nextInt());
		System.out.println("Enter Rack");
		c1.setRack(sc.nextInt());
		System.out.println("Enter Status");
		c1.setStatus(sc.next());
		copiesdao cd1 = new copiesdao();
		cd1.insertcopies(c1);
		
	}
	private static void addBook() throws Exception {
		Book b1 = new Book();
		System.out.println("Enter book id  : ");
		b1.setBook_Id(sc.nextInt());
		System.out.println("Enter book Name  : ");
		b1.setName(sc.next());
		System.out.println("Enter book Subject  : ");
		b1.setSubject(sc.next());
		System.out.println("Enter book Author Name  : ");
		b1.setAuthor(sc.next());
		System.out.println("Enter book Price  : ");
		b1.setPrice(sc.nextFloat());
		System.out.println("Enter book ISBN No  : ");
		b1.setIsbn(sc.nextInt());
		BookDao bd1 = new BookDao();
		bd1.insertBook(b1);
		
	}
	private static void changePwd(int userid) throws Exception {
		UserDao u1=new UserDao();
		System.out.print("ENter new password  : ");
		u1.updateUserPwd(userid, sc.next());
		
	}
	private static void editProfile(int userid) throws Exception {
		String phone;
		String email;
		UserDao u1=new UserDao();
		System.out.print("Enter new Email  : ");
		email = sc.next();
		u1.updateUserEmail(userid, email);
		
		System.out.print("Enter new Phone : ");
		phone = sc.next();
		u1.updateUserPhone(userid, phone);
		System.out.println("Updated Successfully");
		
		
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
