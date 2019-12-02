package org.sunbeam.kdac;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception
{
	String message;

	public InsufficientBalanceException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "InsufficientBalanceException [message=" + message + "]";
	}
	

}
