package com.biometric.controller;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/biometric";
		String username = "root";
		String password = "admin";

		System.out.println("Connecting database...");

		try{
			java.sql.Connection connection = DriverManager.getConnection(url, username, password);
			 System.out.println("Database connected!");
			String query = " insert into userdetails (User_Id, User_name, FingerPrint, phonenumber)"
				        + " values (?, ?, ?, ?)";

				      // create the mysql insert preparedstatement
				      PreparedStatement preparedStmt = connection.prepareStatement(query);
				      preparedStmt.setInt(1, 1234);
				      preparedStmt.setString(2, "sunil");
				      preparedStmt.setString(3, "dasdasdad");
				      preparedStmt.setInt(4, 12345);

				      // execute the preparedstatement
				      preparedStmt.execute();
				      
				      connection.close();
		   
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}

	}

}
