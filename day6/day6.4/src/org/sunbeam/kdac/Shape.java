package org.sunbeam.kdac;

abstract class Shape {
	public double area=0;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public abstract void calculateArea() ;
	
	

}
