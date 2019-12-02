package org.sunbeam.kdac;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Program {
	
	

	
	public static void main(String[] args) {
		Dictionary<Integer, String> d1 = new Hashtable<>();
		d1=Program.getHashtable(d1);
//		Program.printValues(d1);
//		Program.printDictionary(d1);
//		Program.printElement(d1);
//		Program.searchEntry( d1, 4 );
		Program.removeEntry(d1, 2);
		Program.printDictionary(d1);
		
	}
	private static void removeEntry(Dictionary<Integer, String> d1, int key ) 
	{
		if( d1 != null )
		{
			String value = d1.remove(key);
			System.out.println(key+" "+value);
		}
	}
	
	private static void searchEntry(Dictionary<Integer, String> d1, int i) {
		if(d1 != null)
		{
			String value = d1.get(i);
			System.out.println(value);
		}
		
	}

	private static void printDictionary(Dictionary<Integer, String> d1) {
//		System.out.println(d1.elements());
		if(d1 != null)
		{
			Enumeration<Integer> e1 = d1.keys();
			Enumeration<String> e2 = d1.elements();
			while(e1.hasMoreElements() && e2.hasMoreElements())
			{
				
				System.out.println(e1.nextElement()+"  "+e2.nextElement());
			}
		}
		
	}
	private static void printElement(Dictionary<Integer, String> d1) {
//		System.out.println(d1.elements());
		if(d1 != null)
		{

			Enumeration<String> e1 = d1.elements();
			while(e1.hasMoreElements() )
			{
				
				System.out.println(e1.nextElement());
			}
		}
		
	}


	private static void printValues(Dictionary<Integer, String> d1) {
//		System.out.println(d1.elements());
		if(d1 != null)
		{
			Enumeration<String> e1 = d1.elements();
			while(e1.hasMoreElements())
			{
				
				System.out.println(e1.nextElement());
			}
		}
		
	}

	private static Dictionary<Integer, String> getHashtable(Dictionary<Integer, String> d1) {
		d1.put(1, "DBDA");
		d1.put(2, "DMC");
		d1.put(3, "DAC");
		d1.put(4, "DESD");
		
		return d1;
	}
	
	
	
}
