package com.extention.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class emplogDao 
{
	public static boolean validate(String Emp_username, String Emp_password)
	{	boolean status = false;
		
		try
		{
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database?useSSL=false","root","admin123");
			
			String log = "Select * from emp where emp_username=? and emp_password = ?";
			PreparedStatement ps = con.prepareStatement(log);
			ps.setString(1, Emp_username);
			ps.setString(2, Emp_password);
			
			ResultSet rs = ps.executeQuery();
			status=rs.next();
			
			
			
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		return status;
		
	}
}

