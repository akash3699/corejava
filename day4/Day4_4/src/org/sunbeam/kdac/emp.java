package org.sunbeam.kdac;

public class emp {
	public int empid;
	public String empName;
	public String empDesig;
	public String empDept;
	public float empSal;
	public emp(int empid, String empName, String empDesig, String empDept, float empSal) {
		this.empid = empid;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empDept = empDept;
		this.empSal = empSal;
	}
	public emp() {
		this.empid = 0;
		this.empName = null;
		this.empDesig = null;
		this.empDept = null;
		this.empSal = 0;
		
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
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	
	
	public String toString() {
		return "emp [empid=" + empid + ", empName=" + empName + ", empDesig=" + empDesig + ", empDept=" + empDept
				+ ", empSal=" + empSal + "]";
	}

}
