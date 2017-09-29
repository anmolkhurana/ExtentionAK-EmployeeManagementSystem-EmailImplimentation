package com.extention.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class addempcontroller extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public addempcontroller() 
    {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{	
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String emp_uid=request.getParameter("e_uid");
			String emp_password=request.getParameter("e_pass");
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database?useSSL=false","root","admin123");
			
			String add="insert into emp values ('"+emp_uid+"','"+emp_password+"')";
			PreparedStatement ps= con.prepareStatement(add, Statement.RETURN_GENERATED_KEYS); 
			ResultSet rs; 

			int i=ps.executeUpdate();
			rs = ps.getGeneratedKeys();

			   if (rs.next()) {
				   java.sql.RowId rid=rs.getRowId(1); 
				      
				      out.println(rid);
				   
				   //System.out.println("Auto Generated Primary Key " + rs.getInt(1)); 
			   }
			   
			   
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Added Successfully');");  
			out.println("</script>");
			
			javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("addemp.jsp");
			rd.include(request, response);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
