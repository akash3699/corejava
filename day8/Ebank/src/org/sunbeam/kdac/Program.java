package org.sunbeam.kdac;

import java.util.LinkedList;
import java.util.Scanner;

public class Program 
{
	static Scanner sc = new Scanner(System.in); 
	public static Account getAccounts( )
	{
		Account arr = new Account();
		try 
		{
			System.out.printf("Enter Account No : ");
			int accno= sc.nextInt();
			
			System.out.printf("Enter Account Name : ");
			String name= sc.next();
			 while( ! Validator.validateName(name)  )
			 {
				 System.out.print("Re Enter Account name	:	");
				 name = sc.next();
			 }
			System.out.printf("Enter Account Email : ");
			String email= sc.next();
			while( ! Validator.validateEmail(email)  )
			 {
				 System.out.print("Re Enter Email	:	");
				 email = sc.next();
			 }
			System.out.printf("Enter Account Phone : ");
			String phone= sc.next();
			while( ! Validator.validatePhone(phone)  )
			 {
				 System.out.print("Re Enter Phone 	:	");
				 phone = sc.next();
			 }
			System.out.printf("Enter Account Balance : ");
			float balance= sc.nextFloat();
			arr = new Account(name,accno,balance,email,phone);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		arr[ 1 ] = new Account("Amol",20,80000.50f);
//		arr[ 2 ] = new Account("Prashant",10,75000.50f);
//		arr[ 3 ] = new Account("Rahul",40,70000.50f);
//		arr[ 4 ] = new Account("Sarang",30,65000.50f);
		return arr;
	}
	private static void acceptRecord(int[] accno) 
	{
		if( accno != null )
		{
			System.out.print("Enter accno	:	");
			accno[ 0 ] = sc.nextInt();
		}
	}
	private static void printRecord(Account value)
	{
		if( value != null )
			System.out.println(value.toString());
		else
			System.out.println("Account not found");
	}
	private static void printRecord(boolean removedStatus) 
	{
		if( removedStatus )
			System.out.println("Record is removed");
		else
			System.out.println("Record not found");
	}
//	private static void printRecord(Account[] arr) 
//	{
//		if( arr != null )
//		{
//			try {
//				for (Account acc : arr) 
//					System.out.println(acc.toString());
//				System.out.println();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
	private static int menuList( )
	{
		System.out.println("0. Exit");
		System.out.println("1. Add Record");
		System.out.println("2. Find Record");
		System.out.println("3. Remove Record");
		System.out.println("4. Print Record(s)[ Sorted ]");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
//	private static int subMenuList( )
//	{
//		System.out.println("0. Exit");
//		System.out.println("1. Sort By Name");
//		System.out.println("2. Sort By Accono");
//		
//		System.out.print("Enter choice	:	");
//		return sc.nextInt();
//	}
	public static void main(String[] args) 
	{
		int choice;
		int[] accno = new int[ 1 ];
		ListTest test = new ListTest();
		Account[] Accounts=null;
		Account temp=null;
		//test.setEmpList(new ArrayList<Account>());
		//test.setEmpList(new Vector<Account>());
		test.setaccList(new LinkedList<Account>());
		while( ( choice = Program.menuList( ) ) != 0 )
		{
			switch( choice )
			{
			case 1:
				temp = Program.getAccounts();
				test.addRecord( temp );
				break;
			case 2:
				Program.acceptRecord( accno );
				Account value = test.findRecord( accno[ 0 ] );
				Program.printRecord(value);
				break;
			case 3:
				Program.acceptRecord( accno );
				boolean removedStatus = test.removeRecord( accno[ 0 ] );
				Program.printRecord(removedStatus);
				break;
			case 4:
				test.printRecord(Accounts);
//				while( ( choice = Program.subMenuList( ) ) != 0 )
//				{
//					Comparator<Account> comparator = null;
//					switch( choice )
//					{
//					case 1:
//						comparator = new SortByName();
//						break;
//					case 2:
//						comparator = new SortByAccountno();
//						break;
//					
//					}
//					test.printRecord( comparator );
//				}
				break;
			}
		}
	}
}
