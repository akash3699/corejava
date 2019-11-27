package org.sunbeam.kdac;

import java.util.Scanner;

public class stack {
	
	public Linklist ll = new Linklist();
	static Scanner sc = new Scanner(System.in);
	public void push() {
		System.out.printf("Enter the element : ");	
		ll.addFirst(sc.nextInt());
	}

	public void peek() {
		System.out.println(ll.head.data);
	}

	public void pop() {
		ll.deleteFirst();
		
	}
	
	
	

}
