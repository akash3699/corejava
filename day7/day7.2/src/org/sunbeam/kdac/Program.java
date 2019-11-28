package org.sunbeam.kdac;

import java.util.Date;

class Box<T>
{
	T object;

	public T getObject()
	{
		return this.object;
	}
	public void setObject(T object)
	{
		this.object=object;
	}
}
public class Program {
	
	public static void main(String[] args) {
		Box<Date> b1 = new Box<>();
		b1.setObject(new Date());
		String strDate = b1.getObject().toString();
		System.out.println(strDate);
	}
	
	public static void main1(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.setObject(10);
		int in1 = b1.getObject();
		System.out.println(in1);
	}
	
}