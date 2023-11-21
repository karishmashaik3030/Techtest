package com.bank.bank.exception;

public class InvalidIdException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String message;
public InvalidIdException(String message) {
	super(message);
}
}
