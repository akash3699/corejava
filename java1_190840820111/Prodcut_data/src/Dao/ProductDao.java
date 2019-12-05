package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Utils.DBUtils;
import pojo.Product;

public class ProductDao {
	public PreparedStatement stmtInsert;
	public PreparedStatement stmtUpdate;
	public PreparedStatement stmtSelect;
	
	public ProductDao() throws Exception {
		try
		{
			 Connection connection = DBUtils.getConnection();
			this.stmtSelect = connection.prepareStatement("Select * from product");
			this.stmtInsert = connection.prepareStatement("INSERT INTO java1.product  VALUES (?,?,?,?,?)");
			this.stmtUpdate = connection.prepareStatement("UPDATE product set price=? where productid=?");
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public boolean addProduct(Product p1) throws Exception
	{
		this.stmtInsert.setInt(1, p1.getProductid());
		this.stmtInsert.setString(2, p1.getName());
		this.stmtInsert.setString(3, p1.getCompanyname());
		this.stmtInsert.setFloat(4, p1.getPrice());
		this.stmtInsert.setDate(5, p1.getExpirydate());
		if(this.stmtInsert.execute())
			return true;
		
		return false;
	}
	
	public List<Product> getProducts() throws Exception
	{
		List<Product> l1 = new ArrayList<>();
		  
		try( ResultSet rs = this.stmtSelect.executeQuery())
		{
			
			
			 
			
			while(rs.next())
			{
				Product p1 = new Product();
				p1.setProductid(rs.getInt("productid"));
				p1.setName(rs.getString("name"));
				p1.setCompanyname(rs.getString("companyname"));
				p1.setPrice(rs.getFloat("price"));
				p1.setExpirydate(rs.getDate("expirydate"));
				l1.add(p1);
			}
		
		return l1;
		}
		
		
	}

	public void stmtUpdate(int productid, float price) throws Exception {
		this.stmtUpdate.setInt(2, productid);
		this.stmtUpdate.setFloat(1, price);
		if(this.stmtUpdate.executeUpdate() > 0)
		{
			System.out.println("Updated succesfully");
		}
		else
		{
			System.out.println("Something Went Wrong");
		}
		
	}
	

}
