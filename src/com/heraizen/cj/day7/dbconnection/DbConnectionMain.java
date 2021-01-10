package com.heraizen.cj.day7.dbconnection;

public class DbConnectionMain {

	public static void main(String[] args) {
		DbConnection connection1 = DbConnection.getDbConnection();
		DbConnection connection2 = null;
		try {
			connection2 = DbConnection.getDbConnection();
		} catch (Exception e) {
			connection1.destroyDbConnection();
			connection2 = DbConnection.getDbConnection();
			System.out.println("connected" + connection2);
		}

	}

}
