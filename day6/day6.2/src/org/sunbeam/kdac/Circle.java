package org.sunbeam.kdac;

public class Circle {
	public double area=0;
	public int radius;
	
	public Circle() {
		
		this.radius=0;
		
	}
	
	public Circle( int radius) {
		super();
		this.radius = radius;
		
	}

	public double getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [area=" + area + ", radius=" + radius + "]";
	}
	
	public void calculateArea()
	{
		this.area=Math.PI*Math.pow(radius, 2);
	}

	

}
