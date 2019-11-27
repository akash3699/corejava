package org.sunbeam.kdac;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while((choice=Program.menuList())!=0)
		{
			Shape shape=null;
			switch (choice) {
			case 1:
				shape=new Rectangle();
				break;
			case 2:
				shape=new Circle();
				break;

			default:
				break;
			}
			if(shape!=null)
			{
				Program.acceptRecord( shape );
				shape.calculateArea( );
				Program.printRecord( shape );
				
			}
			
		}
	}
	private static void printRecord(Shape shape) {
		String className = shape.getClass().getSimpleName();
		System.out.println("Area of "+className+" is	:	"+shape.getArea());
		
	}
	private static void acceptRecord(Shape shape) {
		if(shape instanceof Rectangle)
		{
			Rectangle rect = (Rectangle) shape;
			System.out.print("Length	:	");
			rect.setLength(sc.nextInt());
			System.out.print("Breadth	:	");
			rect.setBredth(sc.nextInt());
			
		}
		else
		{
			Circle c = (Circle) shape;	
			System.out.print("Radius	:	");
			c.setRadius(sc.nextInt());
		}
	}

	
	
	
//	public static void main1(String[] args) {
//		Circle ctl = new Circle(10);
//		ctl.calculateArea();
//		System.out.println(ctl.getArea());
//	}
//	
//	public static void main(String[] args) {
//		Rectangle rct = new Rectangle(10,2);
//		rct.calculateArea();
//		System.out.println(rct.getArea());
//	}
	
	

}
