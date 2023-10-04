package com.talowski.web.dao;

import java.sql.*;

import com.talowski.web.model.Person;


public class PersonDao {
	
	
	
	public Person getPerson(int pid)
	{
		Person p = new Person();
		p.setPid(1);
		p.setPname("Navin");
		p.setPass("learning");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kamil","root","1234");
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery("select * from student where id="+pid);
			if(rs.next()) {
				p.setPid(rs.getInt("id"));
				p.setPname(rs.getString("username"));
				p.setPass(rs.getString("password"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return p;
	}
	
	public int setPerson(int pid, String pname, String pass)
	{
/*		Person p = new Person();
		p.setPid(102);
		p.setPname("Kamil");
		p.setPass("test");*/

		
		String sql="insert into student values (?, ?, ?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kamil","root","1234");
			PreparedStatement st= con.prepareStatement(sql);
			st.setInt(1, pid);
			st.setString(2,pname);
			st.setString(3,pass);
			int affected= st.executeUpdate();
				return affected;
				


		} catch (Exception e) {
			System.out.println(e);
		}
		
		return 0;
	}
	

}
