package org.sunbeam.kdac;

import java.util.Comparator;

public class SortByAccountno implements Comparator<Account>
{
	@Override
	public int compare(Account emp1, Account emp2) 
	{
		return emp1.getAccno() - emp2.getAccno();
	}
}
