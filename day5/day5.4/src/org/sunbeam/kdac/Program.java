package org.sunbeam.kdac;


class Emp
{
	int empid;
	String name;
	float salary;
	public Emp() {
		this.empid=0;
		this.name="";
		this.salary=0;
	}
	public Emp(int empid, String name, float salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Emp other =(Emp)obj;
		
		if(obj != null)
		{
			if(this.empid==other.empid)
				return true;
			
		}
		return false;
	}
	
}

public class Program {
	
//	public static void main(String[] args) 
//	{
//		int num1 = 10;
//		int num2 = 10;
//		if( num1.equals( num2 ) )
//			System.out.println("Equal");
//		else
//			System.out.println("Not Equal");
//	}
	
	public static void main(String[] args) {
		Emp e1=new Emp(11,"akash",12345);
		Emp e2=new Emp(11,"akash",12345);
		if(e1.equals(null))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");	
	}
	
	public static void main2(String[] args) {
		Emp e1=new Emp(11,"akash",12345);
		Emp e2=new Emp(11,"akash",12345);
		if(e1.equals(e2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");	
	}
	
	
	public static void main1(String[] args) {
		Emp e1=new Emp(11,"akash",12345);
		Emp e2=new Emp(11,"akash",12345);
		if(e1 == e2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	
		
	}
	

}
