package org.sunbeam.kdac;

import java.util.Scanner;

public class Program {
	static Scanner sc=new Scanner(System.in);
	
	private static int menuList() {

		System.out.println("0)Exit");
		System.out.println("1)Push");
		System.out.println("2)Peek");
		System.out.println("3)Pop");
		System.out.printf("Enter Choice 	:");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		Stack stk=new Stack();
		int choice;
		while((choice=Program.menuList())!=0)
		{
			try {
				switch (choice) {
				case 1:
					System.out.printf("Enter ELement : ");
					stk.push(sc.nextInt());
					break;
				case 2:
					System.out.println(stk.peek());
					break;
				case 3:
					stk.pop();
					break;

				default:
					break;
				}
			} catch (StackOverFlowException | StackUnderFlowException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	

}
