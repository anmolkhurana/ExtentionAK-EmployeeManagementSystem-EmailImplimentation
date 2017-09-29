package com.extention.controller;
import java.io.IOException;
import javax.servlet.annotation.*;

import javax.mail.MessagingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emailsendingservlet")
public class emailsendingservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String host;
    private String port;
    private String user;
    private String pass;

   
    public void init()
    {
    	ServletContext context = getServletContext();
    	host=context.getInitParameter("host");
    	port=context.getInitParameter("port");
    	user=context.getInitParameter("user");
    	pass=context.getInitParameter("pass");
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String recipient = request.getParameter("recipient");
		String subject=request.getParameter("subject");
		String content=request.getParameter("content");
		
		String resultMessage="";
		
			try 
			{
				EmailUtility.sendEmail(host, port, user, pass, recipient, subject, content);
				resultMessage = "The email sent successfully";
			} 
			catch (MessagingException e1) 
			{
				System.out.println(e1);
				e1.printStackTrace();
				resultMessage ="There was an error" + e1.getMessage();
			}
			finally
			{
				request.setAttribute("Message", resultMessage);
	            getServletContext().getRequestDispatcher("/resultemail.jsp").forward(
	                    request, response);
			}
			
			
	}

}
