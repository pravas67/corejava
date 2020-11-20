package com.heraizen.cj.day7.emp;

public class LowSalaryException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;

	public LowSalaryException() {
		this.message = "Employee Basic is too less.";
	}

	public LowSalaryException(String message) {
		this.message = message;
	}

	public String toString() {
		return "LowSalaryException [message=" + this.message + "]";
	}
}
