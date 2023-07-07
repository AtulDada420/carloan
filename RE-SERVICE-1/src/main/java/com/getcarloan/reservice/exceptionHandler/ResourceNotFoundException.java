package com.getcarloan.reservice.exceptionHandler;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
		super("Resource not Found!!");
	}

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
