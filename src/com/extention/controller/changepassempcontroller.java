package com.extention.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;


public class changepassempcontroller extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public changepassempcontroller() 
    {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		response.setContentType("text/html");
		
		String u_id = request.getParameter("e_uid");
		String pass = request.getParameter("password");
		String confirmpass = request.getParameter("confirm");
		
		
		
		
		try
		{
		PrintWriter out = response.getWriter();	
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database?useSSL=false","root","admin123");
		
		if(pass.equals(confirmpass))
		{
			String str = "update emp set emp_password = ? where emp_username=?";
			PreparedStatement ps=con.prepareStatement(str);
			ps.setString(1, pass);
			ps.setString(2, u_id);
			
			ps.executeUpdate();
			
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Change done successfully here!!!!!');");  
			out.println("</script>");
						
			RequestDispatcher rd = request.getRequestDispatcher("empact.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Sorry, Password and Username Error');");  
			out.println("</script>");		
			
			RequestDispatcher rd = request.getRequestDispatcher("changepassemp.jsp");
			rd.forward(request, response);
		}
		
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}