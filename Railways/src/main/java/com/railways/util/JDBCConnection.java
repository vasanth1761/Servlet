package com.railways.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	public static Connection getConnection() throws ClassNotFoundException,SQLException
	 {
		Class.forName("com.mysql.cj.jdbc.Driver");

		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookduplicate", "root", "Vasanth@1761");
       return con ;
	 }
}
