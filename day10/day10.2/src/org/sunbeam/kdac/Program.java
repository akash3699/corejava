package org.sunbeam.kdac;

import java.lang.reflect.Field;

class Complex
{
	private int Real;
	private int Imag;
	public Complex() {
		// TODO Auto-generated constructor stub
	}
	public Complex(int real, int imag) {
		super();
		Real = real;
		Imag = imag;
	}
	public int getReal() {
		return Real;
	}
	public void setReal(int real) {
		Real = real;
	}
	public int getImag() {
		return Imag;
	}
	public void setImag(int imag) {
		Imag = imag;
	}
	
}

public class Program
{
	public static void main(String[] args) {
		
		try {
			Complex c1=  new Complex();
			
			System.out.println("Real  : "+c1.getReal());
			System.out.println("Imag  : "+c1.getImag());
			
			Class<?> c = c1.getClass();
			Field field = null;
			
			field = c.getDeclaredField("Real");
			field.setAccessible(true);
			field.setInt(c1, 50);
			
			field = c.getDeclaredField("Imag");
			field.setAccessible(true);
			field.setInt(c1, 100);
			
			
			System.out.println("Real  : "+c1.getReal());
			System.out.println("Imag  : "+c1.getImag());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
