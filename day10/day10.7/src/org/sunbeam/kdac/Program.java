package org.sunbeam.kdac;

import java.sql.Date;
import java.util.Scanner;

import dao.EmpDao;
import pojo.Emp;

public class Program
{
	static Scanner sc = new Scanner(System.in);
	public static int menuList()
	{
		System.out.println("0. Exit");
		System.out.println("1. Print Records");
		System.out.println("2. Insert Record");
		System.out.println("3. Update Record");
		System.out.println("4. Delete Record");
		System.out.print("Enter Choice : ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		int choice;
		try (EmpDao dao = new EmpDao();)
		{
			
			while((choice=Program.menuList()) != 0)
			{
				try {
					switch (choice) {
					case 1:
						dao.select().forEach(System.out::println);;
						break;
					case 2:
						Emp emp = new Emp( 6,"Amol", 30000, Date.valueOf("2010-03-28") );
						dao.insert(emp);
						break;						
					case 3:
						dao.update(6, 40000);
						break;
						
					case 4:
						dao.delete(6);
						break;

					default:
						System.out.println("Enter Correct Choice  ");
						break;
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
