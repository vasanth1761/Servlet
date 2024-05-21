package com.railways.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.railway.model.userP;
import com.railways.util.JDBCConnection;


public  class userImpl implements userDAO{
	
	

	public static void insert(userP obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = JDBCConnection.getConnection();
		String query="insert into user1 (user_name, user_email, user_phonenumber)values(?,?,?)";
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, obj.getName());
		p.setString(2, obj.getEmail());
		p.setString(3, obj.getPhonenumber());
		
		p.executeUpdate();
		System.out.println("Inserted");
				
	}

	@Override
	public void insert() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

}
