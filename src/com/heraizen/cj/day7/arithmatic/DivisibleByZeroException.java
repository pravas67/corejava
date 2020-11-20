package com.heraizen.cj.day7.arithmatic;

public class DivisibleByZeroException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;

	public DivisibleByZeroException() {
		this.message = "A number cann't be divisible by zero .";
	}

	public DivisibleByZeroException(String message) {
		this.message = message;
	}

	public String toString() {
		return "DivisibleByZeroException [message=" + this.message + "]";
	}
}
