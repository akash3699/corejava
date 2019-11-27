package org.sunbeam.kdac;

public class Teaching extends Staff{

	public int NoOfTheorySessionCount=0;
	
	public Teaching(int empid, String empName, int count) {
		super(empid, empName);
		this.NoOfTheorySessionCount=count;
	}
	
	public Teaching() {
		super();
	
	}
	
	

	public Teaching(int noOfTheorySessionCount) {
		super();
		NoOfTheorySessionCount = noOfTheorySessionCount;
	}

	public int getNoOfTheorySessionCount() {
		return NoOfTheorySessionCount;
	}

	public void setNoOfTheorySessionCount(int noOfTheorySessionCount) {
		NoOfTheorySessionCount = noOfTheorySessionCount;
	}

	@Override
	public String toString() {
		return "Teaching [NoOfTheorySessionCount=" + NoOfTheorySessionCount + "]";
	}
	
	public int calculateSalary()
	{
		return (750*this.NoOfTheorySessionCount);
	}
	
}
