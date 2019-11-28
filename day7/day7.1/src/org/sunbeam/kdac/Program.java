package org.sunbeam.kdac;

import java.util.Date;

class Box
{
	Object object;

	public Object getObject()
	{
		return this.object;
	}
	public void setObject(Object object)
	{
		this.object=object;
	}
}
public class Program {
	
	
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setObject(new Date());
		Object obj=b1.getObject();
		Date in=(Date)obj;
		System.out.println(in);
		
	}
	
	@SuppressWarnings("deprecation")
	public static void main1(String[] args) {
		Box b1 = new Box();
		b1.setObject(new Integer(10));
		Object obj=b1.getObject();
		int in=(int)obj;
		System.out.println(in);
		
	}

}