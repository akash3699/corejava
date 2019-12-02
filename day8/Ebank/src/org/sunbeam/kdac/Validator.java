package org.sunbeam.kdac;

public class Validator
{
	public static final String  EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	public static boolean validateName(String name )
	{
		return name.matches(NAME_PATTEREN);
	}
	public static final String  NAME_PATTEREN = "[a-zA-Z][a-zA-Z ]{5,15}$";
	public static boolean validateEmail(String email )
	{
		return email.matches(EMAIL_PATTERN);
	}
	public static final String PHONE_PATTERN = "\\d{10}";
	public static boolean validatePhone(String phone )
	{
		return phone.matches(PHONE_PATTERN);
	}
}