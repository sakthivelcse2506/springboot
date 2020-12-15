package com.sakthi.test;

import java.sql.DriverManager;

public class DBTest {

	public static void main(String[] args) {
		try { 
			System.err.println("Establishing the DB connection...");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TENJIN", "TENJIN123");
			System.err.println("Conneted successfully...");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
