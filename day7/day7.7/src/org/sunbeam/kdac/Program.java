package org.sunbeam.kdac;

interface Math
{
	int sum (int a, int b);
}

public class Program
{
	public static void main(String[] args) {
		
		Math m = new Math() { 
			public int sum(int a, int b){
				return a+b;
				}
			};
		int result = m.sum(10, 20);
		System.out.println(result);
	}
	public static void main2(String[] args) {
		
		Math m = (a, b)->(a+b);
		int result = m.sum(10, 20);
		System.out.println(result);
	}
	public static void main1(String[] args) {
	
		Math m = (int a, int b)->(a+b);
		int result = m.sum(10, 20);
		System.out.println(result);
	}
}