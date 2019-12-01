package org.sunbeam.kdac;

import java.util.Comparator;

public class SortByName implements Comparator<Account>
{
	@Override
	public int compare(Account emp1, Account emp2) 
	{
		return emp1.getName().compareTo(emp2.getName());
	}
}