package com.deloitte.library.exceptions;

public class BookNameException extends Exception{
	public String detailMessage;
	public BookNameException(String message) {
		this.detailMessage=message;
	}
	public String getMessage() {
		return detailMessage;
	}

}
