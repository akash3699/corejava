package pojo;

import java.sql.Date;

public class Product {
	private int productid;
	private String name;
	private String companyname;
	private float price;
	private Date expirydate;
	public Product() 
	{   }
	public Product(int productid, String name, String companyname, float price, Date expirydate) {
		super();
		this.productid = productid;
		this.name = name;
		this.companyname = companyname;
		this.price = price;
		this.expirydate = expirydate;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
	@Override
	public String toString() {
		return String.format("%-15d%-15s%-15s%-10.2f%s", this.productid,this.name,this.companyname,this.price,this.expirydate);
	}
	
	
	

}
