package com.group4.macfms.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.group4.macfms.model.User;
import com.group4.macfms.util.SQLConnection;

public class LoginDAO {
	
	static SQLConnection DBMgr = SQLConnection.getInstance();
	
	@SuppressWarnings("unused")
	public boolean userCheck (String username, String password) {
		boolean userExists = false;
		String queryString = "SELECT * from DB.table where username = "+username+";";
		
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();  
		try {
			stmt = conn.createStatement();
			ResultSet userList = stmt.executeQuery(queryString);
			while (userList.next()) {
				User user = new User(); 
				user.setUsername(userList.getString("username"));
				user.setPassword(userList.getString("password"));	
			}
		} catch (SQLException e) {}
		return userExists;
	}	
}
