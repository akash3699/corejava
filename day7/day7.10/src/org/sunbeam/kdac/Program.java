package org.sunbeam.kdac;


public class Program
{
	
	public static void main(String[] args)
	{
		Emp emp1 = new Emp(13, "Abc", 25000, 12, 8, 2001 );
		Emp emp2=null;
		try {
			emp2 = emp1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(emp1);
		System.out.println(emp2);
		if(emp1==emp2)
		{
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
	}
	
}