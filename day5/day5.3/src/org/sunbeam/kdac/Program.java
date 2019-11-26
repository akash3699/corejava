package org.sunbeam.kdac;

class Person
{
	public void showRecord()
	{
		System.out.println("Person: showRecord()");
	}
	
	public void printRecord()
	{
		System.out.println("Person: printRecord()");
	}
	
}

class Emp extends Person
{
	public void showRecord()
	{
		System.out.println("Emp: showRecord()");
	}
	
	public void printRecord()
	{
		System.out.println("Emp: printRecord()");
	}
	
	
}

public class Program {
	
	public static void main(String[] args) {
		
		Person p1 = new Emp();
		p1.showRecord();
		Emp e2=(Emp)p1;
		e2.showRecord();
		
	}
	

}
