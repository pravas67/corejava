package com.heraizen.cj.day7.bankaccount;

public class NegativeAmountException  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String message;

	public NegativeAmountException() {
		this.message = "Amount cann't be negative";
	}

	public NegativeAmountException(String message) {
		this.message = message;
	}

	public String toString() {
		return "NegativeAmountException [message=" + this.message + "]";
	}
}
