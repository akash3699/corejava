package org.sunbeam.kdac;

import java.util.Scanner;

public class Program {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		Linkedlist l1=new Linkedlist();

		int choice;
		while((choice=Program.menuList())!=0)
		{
			int tempnode;
			switch(choice)
			{
			case 1:
				System.out.print("Enter element   :");
				tempnode=sc.nextInt();
				l1.addFirst(tempnode);
				break;
				
			case 2:
				System.out.print("Enter element   :");
				tempnode=sc.nextInt();
				l1.addLast(tempnode);
				break;
				
			case 3:
				l1.deleteFirst();
				break;
				
			case 4:
				l1.deleteLast();
				break;
				
			case 5:
				l1.print();
				break;
				
			default:
				System.out.println("Enter correct choice");
				break;
					
			}
	
		}

	}

	private static int menuList() {
		// TODO Auto-generated method stub
		int choice;
		System.out.println("0) Exit");
		System.out.println("1) Add First");
		System.out.println("2) Add Last");
		System.out.println("3) Delete First");
		System.out.println("4) Delete Last");
		System.out.println("5) Print");
		System.out.print("Enter Choice : ");
		choice=sc.nextInt();
		return choice;
	}

}
