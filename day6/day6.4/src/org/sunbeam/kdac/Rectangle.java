package org.sunbeam.kdac;

public class Rectangle extends Shape {
	
	public int length;
	public int bredth;
	
	public Rectangle() {
		this.bredth=0;
		this.length=0;
	}
	
	public Rectangle( int length, int bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}
	
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBredth() {
		return bredth;
	}
	public void setBredth(int bredth) {
		this.bredth = bredth;
	}

	@Override
	public String toString() {
		return "Rectangle [area=" + area + ", length=" + length + ", bredth=" + bredth + "]";
	}
	
	public void calculateArea()
	{
		this.area=2*this.bredth*this.length;
	}
	

}
