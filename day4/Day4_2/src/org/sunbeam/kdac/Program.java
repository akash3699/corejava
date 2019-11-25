package org.sunbeam.kdac;

enum Color 
{
	RED,GREEN,BLUE
}

public class Program {

	public static void main(String[] args) {
		
		Color c1= Color.GREEN;
		 System.out.println(c1.ordinal());
		 System.out.println(c1.name());
		
	}

}
