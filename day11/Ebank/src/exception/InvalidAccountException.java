package exception;

public class InvalidAccountException extends Exception
{
    private static final long serialVersionUID = -5889783350681307984L;
    public InvalidAccountException()
    {
	super();
    }
    public InvalidAccountException(String message)
    {
	super(message);
    }
    public InvalidAccountException(String message, Throwable ex)
    {
	super(message, ex);
    }
}