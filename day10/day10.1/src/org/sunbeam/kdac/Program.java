package org.sunbeam.kdac;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;



public class Program {
	static Scanner sc = new Scanner(System.in);
	
	public static int menuList()
	{
		System.out.println("0 Exit");
		System.out.println("1 Type Information");
		System.out.println("2 Field Information");
		System.out.println("3 Constructor Information");
		System.out.println("4 Method Information");
		System.out.print("Enter Choice   :  ");
		return sc.nextInt();
	}
	
	
	public static void main(String[] args) {
		Integer n1 = new  Integer(10);
		int choice;
		Class<?> c1 = n1.getClass();
		while((choice=Program.menuList()) != 0 )
		{
			switch (choice) {
			case 1:
				Program.getTypeInfo(c1);
				break;
			case 2:
				Program.getFieldInfo(c1);
				break;
				
			case 3:
				Program.getContructors(c1);
				break;
				
			case 4:
				Program.getMethods(c1);
				break;

			default:
				break;
			}
		}
		
	}
	

	private static void getMethods(Class<?> c1) {
		Method [] m1= c1.getMethods();
		for (Method method : m1) {
			System.out.println(method);
		}
	}


	private static void getContructors(Class<?> c1) {
		Constructor<?> [] constructors =  c1.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}
	}


	private static void getFieldInfo(Class<?> c1) {
		Field[] f1= c1.getFields();
		for (Field field : f1) {
			System.out.println(field);
		}
		
		
		
	}


	private static void getTypeInfo(Class<?> c1) {
		
		System.out.println("Type Information  : "+c1.getTypeName());
		
	}


	public static void main1(String[] args) 
	{
		Integer n1 = new Integer(0);
		Class<?> c1= n1.getClass();
		
		Object classes = c1.getSimpleName();
		System.out.println(classes);
	}

}
