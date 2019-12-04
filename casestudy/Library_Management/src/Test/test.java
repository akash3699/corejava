package Test;

import java.util.List;

import dao.UserDao;
import pojo.user_p;

public class test {
	public static void main(String[] args) {
		try(UserDao u1=new UserDao();)
		{
			
			u1.getUsers().forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
