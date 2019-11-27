package org.sunbeam.kdac;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int menuList()
	{
		System.out.println("0)Exit");
		System.out.println("1)Push");
		System.out.println("2)Peek");
		System.out.println("3)Pop");
		System.out.print("Enter Choice : ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		stack st = new stack();
		int choice;
		while((choice=Program.menuList()) != 0)
		{
			try {
				switch (choice) {
				case 1:
					
					st.push();
					break;
					
				case 2:
					st.peek();
					break;
					
				case 3:
					st.pop();
					break;

				default:
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	}

}
