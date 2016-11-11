package com.tutorialspoint.springexception;

public class SpringCustomException extends RuntimeException {
	public SpringCustomException() {
		System.out
				.println(" SpringCustomException Class default constructor is invoked ");
	}

	private String exceptionMsg;

	public SpringCustomException(String exceptionMsg) {
		System.out
				.println(" SpringCustomException class parameterised constructor is invoked ");
		this.exceptionMsg = exceptionMsg;
	}

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

}
