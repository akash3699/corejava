package org.sunbeam.kdac;


public class Program {
	
	public static void main1(String[] args) {
		Circle ctl = new Circle(10);
		ctl.calculateArea();
		System.out.println(ctl.getArea());
	}
	
	public static void main(String[] args) {
		Rectangle rct = new Rectangle(10,2);
		rct.calculateArea();
		System.out.println(rct.getArea());
	}
	
	

}
