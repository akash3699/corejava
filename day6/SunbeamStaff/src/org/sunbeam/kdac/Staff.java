package org.sunbeam.kdac;

public abstract class Staff {
	
	public int empid;
	public String empName;
	public Staff() {
		this.empid=0;
		this.empName="";

	}
	public Staff(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Staff [empid=" + empid + ", empName=" + empName + "]";
	}
	public abstract int calculateSalary();

}
