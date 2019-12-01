package org.sunbeam.kdac;

import java.util.Iterator;
import java.util.LinkedList;

public class Program {
	
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		Iterator<Integer> i1=list1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			
		}
	}

	public static void main1(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		for(Integer data : list1)
			System.out.println(data.intValue());
		
	}
}
