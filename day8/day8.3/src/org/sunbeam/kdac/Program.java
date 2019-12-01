package org.sunbeam.kdac;

import java.util.Arrays;

public class Program 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[ ] { 40,80,10,20,30,50};
		System.out.println(Arrays.toString( arr ) );
		Arrays.sort(arr);
		System.out.println(Arrays.toString( arr ) );
	}
}