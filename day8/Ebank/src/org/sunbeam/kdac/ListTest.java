package org.sunbeam.kdac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest 
{
	Scanner sc = new Scanner(System.in);
	private ArrayList<Account> accList;
	public void setaccList(ArrayList<Account> accList) 
	{
		this.accList = accList;
	}
	public void addRecord(Account temp) 
	{
		if( this.accList != null && temp != null )
		{
				this.accList.add(temp);
		}
	}
	
	public Account findRecord(int accno ) throws AccountNotFoundException
	{
		if( this.accList != null )
		{
			Account key = new Account();
			key.setAccno(accno);
			if( this.accList.contains(key))
			{
				int index = this.accList.indexOf(key);
				return this.accList.get(index);
			}
			else
			{
				throw new AccountNotFoundException("Account Not Found");
			}
		}
		return null;
	}
	
	public boolean removeRecord(int accno )
	{
		if( this.accList != null )
		{
			Account key = new Account();
			key.setAccno(accno);
			if( this.accList.contains(key))
			{
				this.accList.remove(key);
				return true;
			}
		}
		return false;
	}
	public void printRecord(Account[] accounts) 
	{
		if( this.accList != null )
		{
			//Collections.sort(this.accList, comparator);
//			this.accList.sort(comparator);
			this.accList.forEach(System.out::println);
			
		}
	}
	public void withdrawAcc(int[] accno,int i) throws InsufficientBalanceException{
		Account withDrawAcc = this.accList.get();
//		this.accList.
		System.out.println("Current balance is  "+withDrawAcc.getBalance());
		float withDrawAmount = sc.nextFloat();
		if(withDrawAmount > withDrawAcc.getBalance())
		{
			throw new InsufficientBalanceException("Insufficient Balance in Accout");
		}
		
	}
}
