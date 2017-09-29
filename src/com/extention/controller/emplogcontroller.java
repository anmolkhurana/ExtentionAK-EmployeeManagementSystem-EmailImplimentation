package com.extention.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class emplogcontroller extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
  
    public emplogcontroller() 
    {
        super();
       
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String e_uname = request.getParameter("e_uid");
		String e_password = request.getParameter("e_pass");
		request.setAttribute("e_uname",e_uname);
		
		if(emplogDao.validate(e_uname,e_password))
		{	
			
			javax.servlet.RequestDispatcher rd= request.getRequestDispatcher("empact.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Sorry, Password and Username Error');");  
			out.println("</script>");
			
			javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("emplog.jsp");
			rd.include(request, response);
		}
	}
	
}


