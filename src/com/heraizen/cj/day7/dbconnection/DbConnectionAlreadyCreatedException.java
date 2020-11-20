package com.heraizen.cj.day7.dbconnection;

public class DbConnectionAlreadyCreatedException  extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String message;

	public DbConnectionAlreadyCreatedException() {
		this.message = "Db connection already created";
	}

	public DbConnectionAlreadyCreatedException(String message) {
		this.message = message;
	}

	public String toString() {
		return "DbConnectionAlreadyCreatedException [message=" + this.message + "]";
	}
}
