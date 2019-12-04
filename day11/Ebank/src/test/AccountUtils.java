package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import exception.AccountNotFoundException;
import exception.InsufficientBalanceException;
import exception.InvalidAccountException;
import pojo.Account;

public class AccountUtils implements BankOperation
{
    List<Account> accountList = null;
    private AccountUtils( )
    {
	this.accountList = new ArrayList<Account>();
    }
    static AccountUtils accountUtils;
    public static AccountUtils getInstance()
    {
	if(accountUtils == null )
	    accountUtils = new AccountUtils();
	return accountUtils;
    }
    @Override
    public void add(Account account) throws InvalidAccountException
    {	
	if( account != null )
	    this.accountList.add(account);
	else
	    throw new InvalidAccountException("Invalid account");
    }
    private boolean exist( Account account )
    {
	for( Account element : this.accountList )
	{
	    if( element.equals(account))
		return true;
	}
	return false;
    }
    @Override
    public double withdraw(Account account, double amount) throws AccountNotFoundException, InsufficientBalanceException, InvalidAccountException
    {	
	double balance = 0;
	if( account == null )
	    throw new InvalidAccountException("Invalid Account");	
	else if( !this.exist(account) )
	    throw new AccountNotFoundException("Account not found");
	else
	{
	    for( Account acc : this.accountList )
	    {
		if( acc.equals(account))
		{
		    if( acc.getBalance() < amount )
			throw new InsufficientBalanceException("Insufficient Balance");
		    else
			acc.setBalance(acc.getBalance() - amount );
		    balance = acc.getBalance();
		}
	    }
	}
	return balance;
    }
    @Override
    public double deposit(Account account, double amount) throws AccountNotFoundException, InvalidAccountException
    {	
	double balance = 0;
	if( account == null )
	    throw new InvalidAccountException("Invalid Account");	
	else if( !this.exist(account) )
	    throw new AccountNotFoundException("Account not found");
	else
	{
	    for( Account acc : this.accountList )
	    {
		if( acc.equals(account))
		{		    
		    acc.setBalance(acc.getBalance() + amount );
		    balance = acc.getBalance();
		}
	    }
	}
	return balance;
    }
    @Override
    public void transfer(Account src, Account dest, double amount)throws AccountNotFoundException, InsufficientBalanceException, InvalidAccountException
    {		
	if( src == null || dest == null)
	    throw new InvalidAccountException("Invalid Account");
	else if( ( !this.exist( src ) ) && ( !this.exist( dest ) ) )
	    throw new AccountNotFoundException("Account not found");
	else if( src.equals(dest))
	    throw new InvalidAccountException("Invalid Account");
	else
	{
	    for( Account element : this.accountList )
	    {
		if( element.equals(src))
		    src = element;
		if( element.equals(dest))
		    dest = element;
	    }
	    if( src.getBalance() < amount )
		throw new InsufficientBalanceException("Insufficient Balance");
	    dest.setBalance(dest.getBalance() + amount );
	    src.setBalance(src.getBalance() -  amount);
	}	
    }
    @Override
    public Account remove(Account account) throws AccountNotFoundException, InvalidAccountException
    {	
	if( account == null )
	    throw new InvalidAccountException("Invalid Account");
	else if( !this.exist(account) )
	    throw new AccountNotFoundException("Account not found");
	else	
	{
	    int  index = this.accountList.indexOf(account);
	    account = this.accountList.get(index);
	    this.accountList.remove(index);
	    return account;
	}
    }
    @Override
    public void displayAccount(Account account)throws AccountNotFoundException, InvalidAccountException
    {
	if( account == null )
	    throw new InvalidAccountException("Invalid Account");
	else if( !this.exist(account) )
	    throw new AccountNotFoundException("Account not found");
	else	
	    System.out.println(account.toString());
    }
    @Override
    public void displayAllAccount()
    {
	this.accountList.forEach(System.out::println);
    }
    @Override
    public Account find(Predicate<Account> p)throws AccountNotFoundException
    {
        for (Account account : accountList)
	{
	    if( p.test(account))
		return account;
	}
        throw new AccountNotFoundException("Account not found");
    }
}