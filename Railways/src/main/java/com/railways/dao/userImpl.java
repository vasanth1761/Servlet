package com.railways.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.railway.model.userP;
import com.railways.util.JDBCConnection;


public  class userImpl implements userDAO{
	
	

	public static void insert(userP obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = JDBCConnection.getConnection();
		String query="insert into user2 (user_name, user_email, user_phonenumber)values(?,?,?)";
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, obj.getName());
		p.setString(2, obj.getEmail());
		p.setString(3, obj.getPhonenumber());
		
		p.executeUpdate();
	
				
	}


	public ArrayList<userP> insertTable() throws ClassNotFoundException, SQLException {
		ArrayList<userP>user=new ArrayList<userP>();
		Connection con = JDBCConnection.getConnection();
		String query="select *from user2";
		PreparedStatement p = con.prepareStatement(query);
		ResultSet re=p.executeQuery();
		while(re.next())
		{
			userP userdetails=new userP();
			userdetails.setId(re.getInt("user_id"));
			userdetails.setName(re.getString("user_name"));
			userdetails.setEmail(re.getString("user_email"));
			userdetails.setPhonenumber(re.getString("user_phonenumber"));
			user.add(userdetails);
		}   
		
		
		
		return user;
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection con = JDBCConnection.getConnection();
		String query = "DELETE FROM user2 WHERE user_id=?";
		PreparedStatement p = con.prepareStatement(query);
		
		ResultSet re=p.executeQuery();
		
	}


	@Override
	public void insert() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}


	

}
