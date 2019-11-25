package org.sunbeam.kdac;

class Complex
{
	public int real ;
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
	public int imag;
	
	public Complex()
	{
		this.imag=0;
		this.real=0;
	}
	public Complex(int real, int imag)
	{
		this.imag=imag;
		this.real=real;
	}
	@Override
	public String toString() {
		return "Complex [real=" + real + ", imag=" + imag + "]";
	}
	
	
}

public class Program {

	public static void main(String[] args) {

		Complex c1=new Complex(10,20);
		System.out.println(c1);
		
	}

}
