package com.heraizen.cj.day7.dbconnection;

public class DbConnection {
	private DbConnection() {

	}

	static int count = 0;

	public static DbConnection getObject() {
		if (count == 0) {
			count++;
			return new DbConnection();
		}
		throw new DbConnectionAlreadyCreatedException();
	}
}
