package exception;

public class AccountNotFoundException extends Exception
{
    private static final long serialVersionUID = -7622915144401720246L;
    public AccountNotFoundException()
    {
	super();
    }
    public AccountNotFoundException(String message )
    {
	super(message);
    }
    public AccountNotFoundException(String message, Throwable ex )
    {
	super(message, ex);
    }    
}