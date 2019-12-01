package org.sunbeam.kdac;

//import java.util.Comparator;
import java.util.List;

public class ListTest 
{
	private List<Account> accList;
	public void setaccList(List<Account> accList) 
	{
		this.accList = accList;
	}
	public void addRecord(Account temp) 
	{
		if( this.accList != null && temp != null )
		{
//			for (Account emp : Accounts) 
				this.accList.add(temp);
		}
	}
	/*public Account findRecord(int empid )
	{
		if( this.accList != null )
		{
			for (Account emp : accList) 
			{
				if( emp.getEmpid() == empid )
					return emp;
			}
		}
		return null;
	}*/
	public Account findRecord(int accno )
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
		}
		return null;
	}
	/*public boolean removeRecord(int empid )
	{
		if( this.accList != null )
		{
			Account key = new Account();
			key.setEmpid( empid );
			if( this.accList.contains(key))
			{
				int index = this.accList.indexOf(key);
				this.accList.remove(index);
				return true;
			}
		}
		return false;
	}*/
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
}
