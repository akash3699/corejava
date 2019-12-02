package org.sunbeam.kdac;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class Program
{
	
	public static void main(String[] args) {
		
		
		
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.print("Fully Qualified Class Name : ");
			String className = sc.next();
			Class<?> c = Class.forName(className);
//			System.out.println(c.getPackageName());
			
			System.out.print("Method Name : ");
			String methodName = sc.next();
			Method [] methods = c.getMethods();
			for (Method method : methods) {
				
				if(method.getName().equalsIgnoreCase(methodName))
				{
//					System.out.println(method);
					Parameter[] parameters = method.getParameters();
					
					Object[] arr = new Object[method.getParameterCount()];
					for(int index = 0; index<method.getParameterCount(); ++index)
					{
						String params = parameters[index].getType().getName();
						System.out.print(params+" value : ");
						String strNumber = sc.next();
						arr[index]=Convert.changeType(strNumber,params);
					}
					Object obj = c.newInstance();
					Object result = method.invoke(obj, arr);
					System.out.println("Result	:	"+result);
				}
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			
	}
}
