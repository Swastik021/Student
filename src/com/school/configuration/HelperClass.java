package com.school.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {
	String url = "jdbc:mysql://localhost:3306/school_jdbc";
	String username = "root";
	String paasword = "root";
	
	Connection connection = null;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, paasword);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
