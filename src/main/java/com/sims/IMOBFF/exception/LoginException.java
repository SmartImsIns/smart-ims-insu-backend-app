package com.sims.IMOBFF.exception;

public class LoginException extends Exception{
	
	private static final long serialVersionUID = 1L;
	String message;
	Object object;

	public LoginException(String message) {
		super(message);
		this.message=message;
	}
	
	public LoginException( Object object, String message) {
		super(message);
		this.object= object;
		this.message=message;
	}
	
	public String getMessage() {
        return message;
    }
	

}
