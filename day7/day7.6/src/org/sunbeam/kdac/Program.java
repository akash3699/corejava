package org.sunbeam.kdac;

interface Printable
{
	void Print();
}

class Test implements Printable
{
	public void Print()
	{
		System.out.println("Inside Test class");
	}
	
}

public class Program {
	

	public static void main(String[] args) {
		
		Printable p1= ()-> {
			System.out.println("Hello There2");
		};
		p1.Print();
		
	}
	public static void main4(String[] args) {
		
		Printable p1= ()-> System.out.println("Hello There1");
		p1.Print();
		
	}
	public static void main3(String[] args) {
		
		Printable p1= new Printable() {
			public void Print() {
				System.out.println("Hello There");
				
			}
		};
		p1.Print();
		
	}
	public static void main2(String[] args) {
		
		Printable p1= new Test();
		p1.Print();
		
	}
	
	public static void main1(String[] args) {
	
		Test t1 = new Test();
		t1.Print();
		
	}
	
}