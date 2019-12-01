package org.sunbeam.kdac;

public class Date 
{
	public int Day;
	public int Month;
	public int year;
	public Date() {
	
	}
	
	public int getDay() {
		return Day;
	}
	public void setDay(int day) {
		Day = day;
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int month) {
		Month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date(int day, int month, int year) {
		super();
		Day = day;
		Month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [Day=" + Day + ", Month=" + Month + ", year=" + year + "]";
	}

	@Override
	public Date clone() throws CloneNotSupportedException {
		Date other =  new Date(this.Day,this.Month,this.year);
		return other;
	}
	
	
	

}
