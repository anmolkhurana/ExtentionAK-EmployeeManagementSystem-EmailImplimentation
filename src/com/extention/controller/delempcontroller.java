package com.extention.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class delempcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public delempcontroller() 
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

			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database?useSSL=false","root","admin123");
			
			
			String delq = "delete from emp where emp_username ='"+ emp_uid +"'";
			PreparedStatement ps = con.prepareStatement(delq);
			int rowsdeleted=ps.executeUpdate();
			
			if (rowsdeleted==0)
			{
				out.println("<script type=\"text/javascript\">");  
				out.println("alert('No record found');");  
				out.println("</script>");
				javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("delemp.jsp");
				rd.include(request, response);
				
			}
			else
			{
				out.println("<script type=\"text/javascript\">");  
				out.println("alert('Deleted Successfully');");  
				out.println("</script>");
				
				javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("delemp.jsp");
				rd.include(request, response);
					
			}
				
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}

}
