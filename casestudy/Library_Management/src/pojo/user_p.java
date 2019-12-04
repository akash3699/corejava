package pojo;

public class user_p 
{
private int User_Id;
private String User_Name;
private String Email;
private int Phone;
private String password;
private String Role;

public user_p()
{ }

public user_p(int user_Id, String user_Name, String email, int phone, String password, String role) 
{
	super();
	User_Id = user_Id;
	User_Name = user_Name;
	Email = email;
	Phone = phone;
	this.password = password;
	Role = role;
}

public int getUser_Id() 
{
	return User_Id;
}

public void setUser_Id(int user_Id) 
{
	User_Id = user_Id;
}

public String getUser_Name() 
{
	return User_Name;
}

public void setUser_Name(String user_Name) 
{
	User_Name = user_Name;
}

public String getEmail() 
{
	return Email;
}

public void setEmail(String email) 
{
	Email = email;
}

public long getPhone() 
{
	return Phone;
}

public void setPhone(int phone) 
{
	Phone = phone;
}

public String getPassword() 
{
	return password;
}

public void setPassword(String password) 
{
	this.password = password;
}

public String getRole() 
{
	return Role;
}

public void setRole(String role) 
{
	Role = role;
}

@Override
public String toString() 
{
	return "user_p [User_Id=" + User_Id + ", User_Name=" + User_Name + ", Email=" + Email + ", Phone=" + Phone
			+ ", password=" + password + ", Role=" + Role + "]";
}



}
