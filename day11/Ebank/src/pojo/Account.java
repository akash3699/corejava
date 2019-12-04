package pojo;

public class Account
{
    private int number;
    private String name;
    private String email;
    private String phoneNumber;
    private double balance;
    public Account()
    {	}
    public Account( int number )
    {	
	this.number = number;
    }
    public Account(int number, String name, String email, String phoneNumber, double balance)
    {
	this.number = number;
	this.name = name;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.balance = balance;
    }
    public int getNumber()
    {
        return number;
    }
    public void setNumber(int number)
    {
        this.number = number;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    @Override
    public boolean equals(Object obj)
    {
       if( obj != null )
       {
	   Account other = ( Account ) obj;
	   if( this.number == other.number )
	       return true;
       }
       return false;
    }
    @Override
    public String toString()
    {
	return String.format("%-30s%-7d%-10.2f",this.name, this.number, this.balance);
    }
}