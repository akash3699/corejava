package org.sunbeam.kdac;

import java.util.ArrayList;

public class Program {
	
	
	
	public static void main(String[] args) {
	
		ArrayList<Integer> intList = Program.getIntList();
		for (Integer integer : intList) {
			System.out.println(integer);
		}
		ArrayList<Double> doubleList = Program.getDoubleList();
		for (Double element : doubleList) {
			System.out.println(element);
		}
		ArrayList<String> stringList = Program.getStringList();
		for (String element : stringList) {
			System.out.println(element);
		}
	}

	private static ArrayList<Integer> getIntList() {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		return list;
	}
	private static ArrayList<Double> getDoubleList() {
		
		ArrayList<Double> list = new ArrayList<>();
		list.add(10.1);
		list.add(20.2);
		list.add(30.3);
		list.add(40.4);
		
		return list;
	}
	private static ArrayList<String> getStringList() {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Precat");
		list.add("DAC");
		list.add("DMC");
		list.add("DBDA");
		
		return list;
	}
	
}