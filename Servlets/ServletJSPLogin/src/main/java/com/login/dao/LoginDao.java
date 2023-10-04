package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;



public class LoginDao {
	String sql="select * from student  where username=? and password=?";
	String url ="jdbc:mysql://localhost:3306/kamil";
	String uname="root";
	String pass="1234";
	public boolean check(String username, String password) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			java.sql.PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, username);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
}
