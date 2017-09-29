package com.extention.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class adminlogcontroller extends HttpServlet 
{	
	
	private static final long serialVersionUID = 1L;
       
    
    public adminlogcontroller() 
    {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String a_uname = request.getParameter("a_uid");
		String a_password = request.getParameter("a_pass");
		request.setAttribute("a_uname",a_uname);// to display the name of the user on the top of the screen
		if(adminlogDao.validate(a_uname,a_password))
		{	
			
			javax.servlet.RequestDispatcher rd= request.getRequestDispatcher("adminact.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Sorry, Password and Username Error');");  
			out.println("</script>");
			
			javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("adminlog.jsp");
			rd.include(request, response);
		}
	}

}
