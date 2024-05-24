package com.railways.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.railway.model.userP;
import com.railways.util.JDBCConnection;

public class userImpl implements userDAO {

	public static void insert(userP obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = JDBCConnection.getConnection();
		String query = "insert into user3 (user_name, user_email, user_phonenumber)values(?,?,?)";
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, obj.getName());
		p.setString(2, obj.getEmail());
		p.setString(3, obj.getPhonenumber());

		p.executeUpdate();

	}

	public ArrayList<userP> insertTable() throws ClassNotFoundException, SQLException {
		ArrayList<userP> user = new ArrayList<userP>();
		Connection con = JDBCConnection.getConnection();
		String query = "select *from user3";
		PreparedStatement p = con.prepareStatement(query);
		ResultSet re = p.executeQuery();
		while (re.next()) {
			userP userdetails = new userP();
			userdetails.setId(re.getInt("user_id"));
			userdetails.setName(re.getString("user_name"));
			userdetails.setEmail(re.getString("user_email"));
			userdetails.setPhonenumber(re.getString("user_phonenumber"));
			user.add(userdetails);
		}

		return user;
		// TODO Auto-generated method stub

	}

	public static  void delete(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Connection con = JDBCConnection.getConnection();
		String query = "DELETE FROM user3 WHERE user_id=?";
		PreparedStatement p = con.prepareStatement(query);
		p.setInt(1, id);
		p.executeUpdate();

	}
    
	@Override
	public void insert() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}
	public static  void update(userP obj1,int id) throws ClassNotFoundException, SQLException {
		
		Connection con=JDBCConnection.getConnection();
		String query=("update user3 set user_name=?,user_email=?,user_phonenumber=? where user_id=?");
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1,obj1.getName());
		p.setString(2, obj1.getEmail());
		p.setString(3, obj1.getPhonenumber());
		p.setInt(4,id );
		p.executeUpdate();
	}

	
	}
