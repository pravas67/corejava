package com.heraizen.cj.day7.bankaccount;

public class InsufficientFundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;

	public InsufficientFundException() {
		this.message = "Account do not have sufficient balance to withdraw";
	}

	public InsufficientFundException(String message) {
		this.message = message;
	}

	public String toString() {
		return "InsufficientFundException [message=" + this.message + "]";
	}
}
