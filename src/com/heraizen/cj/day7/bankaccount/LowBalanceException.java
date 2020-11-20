package com.heraizen.cj.day7.bankaccount;

public class LowBalanceException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;

	public LowBalanceException() {
		this.message = "Account have low balance please deposite some amount to maintain the account";
	}

	public LowBalanceException(String message) {
		this.message = message;
	}

	public String toString() {
		return "LowBalanceException [message=" + this.message + "]";
	}
}
