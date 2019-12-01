package org.sunbeam.kdac;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class Program {
	
	

	public static void print(Integer i)
	{
		System.out.println(i);
	}

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		s1.add(90);
		s1.add(60);
		s1.add(30);
		s1.add(20);
		s1.add(50);
		s1.forEach(Program::print);
		
		
		
	}
	
}
