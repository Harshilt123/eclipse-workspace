package com.google.util;

import java.sql.*;

public class DbConnection {

	public static void main(String[] arys) throws ClassNotFoundException {

		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sonoo ";
		String userName = "root";
		String password = "root";

		try {
		
			Class.forName(driverName);
			

			Connection con = DriverManager.getConnection(url,userName,password);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
