package org.sunbeam.kdac;

interface Math
{
	int sum (int a, int b);
}

public class Program
{
	static int add (int a, int b)
	{
		return a+b;
	}
	int ADD (int a, int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Program program=new Program();
		Math m = program::ADD;
		int result = m.sum(10, 20);
		System.out.println(result);
	}
	
	public static void main1(String[] args) {
		
		Math m = Program::add;
		int result = m.sum(10, 20);
		System.out.println(result);
	}
	
}