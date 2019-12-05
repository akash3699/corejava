package test;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import Dao.ProductDao;
import pojo.Product;

public class Program {
	static Scanner sc =new Scanner(System.in);
	public static int menuList()
	{
		System.out.println("0)Exit ");
		System.out.println("1)Display All Product ");
		System.out.println("2)Insert Product ");
		System.out.println("3)Update Product Price");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		int choice;
		while((choice = Program.menuList()) !=0 )
		{
			try {
				switch (choice) {
				case 1:
					Program.DisplayProducts();
					break;
				case 2:
					Program.insertProduct();
					break;
				case 3:
					Program.updateProduct();
					break;
					

				default:
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void updateProduct() throws Exception {
		int productid;
		float price;
		System.out.print("ENter Product id  : ");
		productid = sc.nextInt();
		System.out.print("ENter Product Price  : ");
		price = sc.nextFloat();
		ProductDao pd1 = new ProductDao();
		pd1.stmtUpdate(productid,price);
		
	}

	@SuppressWarnings("deprecation")
	private static void insertProduct() throws Exception {
		Product p = new Product();
		int day,month,year;
		System.out.println("Enter Product Id : ");
		p.setProductid(sc.nextInt());
		System.out.println("Enter Product Name  : ");
		p.setName(sc.next());
		System.out.println("Enter Product Company Name  : ");
		p.setCompanyname(sc.next());
		System.out.println("Enter Product Price  : ");
		p.setPrice(sc.nextFloat());
		System.out.println("Enter Product Expiry Date  : ");
		day=sc.nextInt();
		System.out.println("Enter Product Expiry Month  : ");
		month=sc.nextInt();
		month= month -1;
		System.out.println("Enter Product Expiry Year: ");
		year=sc.nextInt();
		year = year-1900;
		Date d1 = new Date(year, month, day);
		p.setExpirydate(d1);
		ProductDao pd1 = new ProductDao();
		if(pd1.addProduct(p));
			System.out.println("Record Inserted ");
		
		
	}

	private static void DisplayProducts() throws Exception {
		ProductDao p1 =new ProductDao();
		System.out.printf("%-15s%-15s%-15s%-10s%s","ProductID","ProductName", "CompanyName","Price","ExpiryDate");
		System.out.println();
		System.out.println("========================================================================================");
		List<Product> lp1 = p1.getProducts();
		lp1.forEach(System.out::println);
		
	}

}


