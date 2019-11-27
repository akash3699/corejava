package org.sunbeam.kdac;

public class Nonteaching extends Staff{
	public int NoOfLabSessionCount=0;
	
	public Nonteaching(int empid, String empName, int count) {
		super(empid, empName);
		this.NoOfLabSessionCount=count;
	}

	public Nonteaching(int noOfLabSessionCount) {
		super();
		NoOfLabSessionCount = noOfLabSessionCount;
	}

	public int getNoOfLabSessionCount() {
		return NoOfLabSessionCount;
	}

	public void setNoOfLabSessionCount(int noOfLabSessionCount) {
		NoOfLabSessionCount = noOfLabSessionCount;
	}

	public Nonteaching() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Nonteaching [NoOfLabSessionCount=" + NoOfLabSessionCount + "]";
	}
	
	public int calculateSalary()
	{
		return (500*this.NoOfLabSessionCount);
	}
	
}
