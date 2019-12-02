package org.sunbeam.kdac;

@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception {

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AccountNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "AccountNotFoundException [message=" + message + "]";
	}
	
}
