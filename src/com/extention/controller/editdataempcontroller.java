package com.extention.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class editdataempcontroller extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private static final String NULL = null;
       
    public editdataempcontroller() 
    {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		String e_username=request.getParameter("e_uid");
		String f_name = request.getParameter("firstname");
		String l_name = request.getParameter("lastname");
		String e_id = request.getParameter("emailid");
		String p_word = request.getParameter("password");
		String confirm_pass=request.getParameter("confirm");
		String cont= request.getParameter("contact");
		String date = request.getParameter("dob");
		
		try
		{
			PrintWriter out = response.getWriter();	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database?useSSL=false","root","admin123");
			
		
			
		String str="Insert into empdata values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(str);
		ps.setString(1, e_username);		
		ps.setString(2, f_name);
		ps.setString(3, l_name);
		ps.setString(4, e_id);
		ps.setString(5, cont);
		ps.setString(6, date);
				
		ps.executeUpdate();
				
		out.println("<script type=\"text/javascript\">");  
		out.println("alert('Editing Successful');");  
		out.println("</script>");
					
		RequestDispatcher rd = request.getRequestDispatcher("empact.jsp");
		rd.forward(request, response);

			
			
	}	
		catch(Exception e)
		{	
			System.out.println(e);
				
		}

	
	}

}
