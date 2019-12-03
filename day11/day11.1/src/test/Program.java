package test;

import java.util.Scanner;

import dao.BookDao;
import pojo.Book;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int menuList()
	{
		System.out.println("0) Exit ");
		System.out.println("1) Insert Book ");
		System.out.println("2) Update Book ");
		System.out.println("3) Delete Book ");
		System.out.println("4) Display Books ");
		System.out.print("Enter Choice ");
		return sc.nextInt();
	}
	private static Book acceptRecord() {
		Book book = new Book();
		System.out.print("Enter Book id : ");
		book.setBook_id(sc.nextInt());
		System.out.print("Enter Subject Name : ");
		book.setSubject_name(sc.next());
		System.out.print("Enter Book Name : ");
		book.setBook_name(sc.next());
		sc.nextLine();
		System.out.print("Enter Author Name : ");
		book.setAuthor_name(sc.next());
		System.out.print("Enter Price : ");
		book.setPrice(sc.nextFloat());
		
		return book;
	}
	
	public static int acceptBookId()
	{
		System.out.print("Enter Book Id  : ");
		return sc.nextInt();
	}
	
	public static Float acceptBookPrice()
	{
		System.out.print("Enter Book Price  : ");
		return sc.nextFloat();
	}
	
	public static void printCount(int count)
	{
		System.out.println(count+" Records Updated");
	}
	
	public static void main(String[] args) {
		int choice;
		BookDao bookDao = new BookDao();
		while((choice = Program.menuList()) != 0)
		{
			try {
				switch (choice) {
				case 1:
					Program.printCount(bookDao.insertBook(Program.acceptRecord()));
					break;
				case 2:
					Program.printCount(bookDao.updateBook(Program.acceptBookId(), Program.acceptBookPrice()));
					break;
				case 3:
					Program.printCount(bookDao.deleteBook(Program.acceptBookId()));
					break;
				case 4:
					bookDao.getBooks().forEach(System.out::println);
					break;

				default:
					System.out.println("Enter Correct Choice");
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	

}
