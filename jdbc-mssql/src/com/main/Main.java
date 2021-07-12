package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		 String connectionUrl =
	                "jdbc:sqlserver://LIN16009731\\SQLEXPRESS:1433;databaseName=Test;user=rohansoudey;password=Realme@123";

	        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
	           System.out.println("Connected");
	        }
	        // Handle any errors that may have occurred.
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
}
