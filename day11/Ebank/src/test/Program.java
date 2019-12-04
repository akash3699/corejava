package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.Predicate;

import pojo.Account;

public class Program
{   
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static void acceptRecord( Account account )throws Exception
    {
	/*************************Name***************************/
	System.out.print("Name	:	");	
	String name = reader.readLine();
	while( ! Validator.validateName(name) || name.length() <= 5 )
	{
	    System.out.print("Reenter Name	:	");
	    name = reader.readLine();
	}
	account.setName(name);
	/*************************Account Number*****************/
	System.out.print("Acc No. :	");
	account.setNumber(Integer.parseInt(reader.readLine()));
	/*************************E-Mail*************************/
	System.out.print("E-mail	:	");
	String email = reader.readLine();
	while( ! Validator.validateEmail( email ))
	{
	    System.out.print("Reenter E-mail	:	");
	    email = reader.readLine();
	}
	account.setEmail( email );
	/************************Phone Number********************/
	System.out.print("Phone	:	");	
	String phoneNumber = reader.readLine();
	while( ! Validator.validatePhoneNumber(phoneNumber) )
	{
	    System.out.print("Reenter Valid phone number	:	");
	    phoneNumber = reader.readLine();
	}
	account.setPhoneNumber(phoneNumber);
	/*************************Balance*************************/
	System.out.print("Balance	:	");
	double balance =  Double.parseDouble(reader.readLine());
	while( balance < 100 )
	{
	    System.out.print("Reenter Balance	:	");
	    balance =  Double.parseDouble(reader.readLine());
	}
	account.setBalance( balance);
    }
    public static void addAccount( AccountUtils accountUtils )throws Exception
    {
	Account account = new Account();
	Program.acceptRecord(account);
	accountUtils.add(account);
    }
    public static void withdraw( AccountUtils accountUtils )throws Exception
    {
	System.out.print("Account number	:	");
	int accountNumber = Integer.parseInt(reader.readLine());
	System.out.print("Amount	:	");
	double amount = Double.parseDouble(reader.readLine());
	double currentBalance = accountUtils.withdraw(new Account(accountNumber), amount);
	System.out.println("Current Balance is	:	"+currentBalance);
    }
    public static void deposit( AccountUtils accountUtils )throws Exception
    {
	System.out.print("Account number	:	");
	int accountNumber = Integer.parseInt(reader.readLine());
	System.out.print("Amount	:	");
	double amount = Double.parseDouble(reader.readLine());
	double currentBalance = accountUtils.deposit(new Account(accountNumber), amount);
	System.out.println("Current Balance is	:	"+currentBalance);
    }
    public static void transferFund( AccountUtils accountUtils )throws Exception
    {
	System.out.print("Source Account number	:	");
	Account src = new  Account(Integer.parseInt(reader.readLine()));
	
	System.out.print("Destination Account number	:	");
	Account dest = new  Account(Integer.parseInt(reader.readLine()));
	
	System.out.print("Amount	:	");
	accountUtils.transfer(src, dest, Double.parseDouble(reader.readLine()));
	
	System.out.println("-----------------------------------");
	System.out.println("Source Account Details :");
	accountUtils.displayAccount(src);
	System.out.println("-----------------------------------");
	System.out.println("Destination Account Details :");
	accountUtils.displayAccount(dest);
	System.out.println("-----------------------------------");
    }    
    public static void removeAccount( AccountUtils accountUtils )throws Exception
    {
	System.out.print("Account number	:	");
	Account account = accountUtils.remove(new Account(Integer.parseInt(reader.readLine())));
	System.out.println("Removed account details : "+ account.toString());
    }
    public static void findAccountByName( AccountUtils accountUtils )throws Exception
    {
	System.out.print("Enter account holder's name	:	");
	String name = reader.readLine();	
	Predicate<Account> p = (Account account )-> account.getName().equalsIgnoreCase(name);
 	Account account = accountUtils.find(p);
 	System.out.println(account.toString());
    }
    public static void findAccountByEmail( AccountUtils accountUtils )throws Exception
    {
	System.out.print("Enter account holder's email	:	");
	String email = reader.readLine();	
	Predicate<Account> p = (Account account )-> account.getEmail().equalsIgnoreCase(email);
 	Account account = accountUtils.find(p);
 	System.out.println(account.toString());
    }
    public static void findAccountByPhone( AccountUtils accountUtils )throws Exception
    {
	System.out.print("Enter account holder's phone number	:	");
	String phoneNumber = reader.readLine();
	Predicate<Account> p = (Account account )-> account.getPhoneNumber().equalsIgnoreCase(phoneNumber);
 	Account account = accountUtils.find(p);
 	System.out.println(account.toString());
    }
    public static void displayAllAccount( AccountUtils accountUtils )throws Exception
    {
	accountUtils.displayAllAccount();
    }
    public static int menuList()throws Exception
    {
	System.out.println("0.Exit");
	System.out.println("1.Add Account.");
	System.out.println("2.Withdraw.");
	System.out.println("3.Deposit.");
	System.out.println("4.Transfer funds.");
	System.out.println("5.Remove Account.");
	System.out.println("6.Find Account By Name");
	System.out.println("7.Find Account By Email");
	System.out.println("8.Find Account By Phone");
	System.out.println("9.Display All Account");
	System.out.print("Enter choice	:	");
	return Integer.parseInt(reader.readLine());
    }
    
    public static void main(String[] args)
    {
	try
	{
	    int choice;
	    AccountUtils accountUtils =  AccountUtils.getInstance();
	    while( ( choice = Program.menuList( ) ) != 0 )
	    {
	        try
	        {
        	    switch( choice )
        	    {
        	    	case 1:
        	    	    Program.addAccount(accountUtils);
        	    	    break;
        	    	case 2:
        	    	    Program.withdraw(accountUtils);
        	    	    break;
        	    	case 3:
        	    	    Program.deposit(accountUtils);
        	    	    break;
        	    	case 4:
        	    	    Program.transferFund(accountUtils);
        	    	    break;
        	    	case 5:
        	    	    Program.removeAccount(accountUtils);
        	    	    break;
        	    	case 6:
        	    	    Program.findAccountByName(accountUtils);
        	    	    break;
        	    	case 7:
        	    	    Program.findAccountByEmail(accountUtils);
        	    	    break;
        	    	case 8:
        	    	    Program.findAccountByPhone(accountUtils);
        	    	    break;
        	    	case 9:
        	    	    Program.displayAllAccount(accountUtils);
        	    	    break;
        	    	}
	        }
	        catch (Exception e)
	        {		
	            System.out.println(e.getMessage());
	        }
	    }
	} 
	catch (Exception e)
	{	
	    System.out.println(e.getMessage());
	}
    }
}