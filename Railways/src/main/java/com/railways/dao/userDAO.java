package com.railways.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.railway.model.userP;

public interface userDAO {
	void insert() throws ClassNotFoundException, SQLException;
//	ArrayList<userP> insert() throws ClassNotFoundException, SQLException;
	ArrayList<userP> insertTable() throws ClassNotFoundException, SQLException;
//	void delete() throws ClassNotFoundException, SQLException;```````````````````````````
	
		
	

}
