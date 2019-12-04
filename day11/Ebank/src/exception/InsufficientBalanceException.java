package exception;

public class InsufficientBalanceException extends Exception
{
    private static final long serialVersionUID = 7830185761225281419L;
    public InsufficientBalanceException()
    {
	super();
    }
    public InsufficientBalanceException(String message)
    {
	super(message);	
    }
    public InsufficientBalanceException(String message, Throwable ex)
    {
	super(message, ex);	
    }
}