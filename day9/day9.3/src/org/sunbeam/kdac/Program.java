package org.sunbeam.kdac;

import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Set<Integer> s1 = new TreeSet<>();
		s1.add(300);
		s1.add(200);
		s1.add(100);
		s1.add(400);
		
		s1.add(50);
		s1.add(10);
		s1.add(20);
		s1.add(40);
		s1.add(30);
		
		s1.forEach(System.out::println);
		
//		System.out.println(s1.);
//		for (Integer integer : s1) {
//			System.out.println(integer);
//		}
//		while(!s1.isEmpty())
//		{
//			s1.
//		}
		
		
	}
	public static void main1(String[] args) {
		Set<Integer> s1 = new TreeSet<>();
		s1.add(300);
		s1.add(200);
		s1.add(100);
		s1.add(400);
//		System.out.println(s1.);
		for (Integer integer : s1) {
			System.out.println(integer);
		}
//		while(!s1.isEmpty())
//		{
//			s1.
//		}
		
		
	}
	
}
