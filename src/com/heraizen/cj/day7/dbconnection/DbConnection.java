package com.heraizen.cj.day7.dbconnection;

public class DbConnection {
	private DbConnection() {

	}

	private static int count = 0;

	public static DbConnection getDbConnection() {
		if (count == 0) {
			count++;
			return new DbConnection();
		}
		throw new DbConnectionAlreadyCreatedException();
	}
	public void destroyDbConnection() {
		count=0;
	}
}
