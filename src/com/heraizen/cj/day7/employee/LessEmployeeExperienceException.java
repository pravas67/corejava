package com.heraizen.cj.day7.employee;

public class LessEmployeeExperienceException  extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;

	public LessEmployeeExperienceException() {
		this.message = "Employee Experience is less";
	}

	public LessEmployeeExperienceException(String message) {
		this.message = message;
	}

	public String toString() {
		return "LessEmployeeExperienceException [message=" + this.message + "]";
	}
}
