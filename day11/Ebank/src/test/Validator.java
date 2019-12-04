package test;

public class Validator
{
    private static final String EMAIL_PATTERN =
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static boolean validateEmail( String email)
    {
	return email.matches(EMAIL_PATTERN);
    }
    
    public static final String PHONE_PATTERN = "\\d{10}";
    public static boolean validatePhoneNumber( String phoneNumber )
    {
	return phoneNumber.matches(PHONE_PATTERN);
    }
    
    public static final String NAME_PATTEREN = "[a-zA-Z][a-zA-Z ]*";
    public static boolean validateName(  String name )
    {
	return name.matches(NAME_PATTEREN);
    }
}