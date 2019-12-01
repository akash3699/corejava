package org.sunbeam.kdac;

public class Account implements Comparable<Account>
{
	private String name;
	private int accno;
	private float balance;
	private String email;
	private String phone;
	public Account(String name, int accno, float balance, String email, String phone) {
		super();
		this.name = name;
		this.accno = accno;
		this.balance = balance;
		this.email = email;
		this.phone = phone;
	}
	public Account() 
	{	}
	public Account(String name, int empid, float salary)
	{
		this.name = name;
		this.accno = empid;
		this.balance = salary;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public float getSalary() 
	{
		return this.balance;
	}
	@Override
	public boolean equals(Object obj)
	{
		if( obj != null )
		{
			Account other = (Account) obj;
			if( this.accno == other.accno )
				return true;
		}
		return false;
	}
	@Override
	public int compareTo(Account other)
	{
		return this.accno - other.accno;
	}
	@Override
	public String toString() 
	{
		return String.format("%-15s%-5d%-10.2f", this.name, this.accno, this.balance);
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}