package com.extention.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class viewempcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public viewempcontroller() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database?useSSL=false","root","admin123");
		
		Statement st= con.createStatement();
		ResultSet rs;
		
		String selq = "Select emp.emp_username, emp.emp_password, empdata.emp_firstname, empdata.emp_lastname, empdata.emp_email,empdata.emp_contact, empdata.emp_dob from emp join empdata on emp.emp_username=empdata.emp_username";
		rs=st.executeQuery(selq);
		PrintWriter out = response.getWriter();
		
		out.println("<html>"
				+ "<head>"
				+ "<title>Reading All Employees</title>"
				+"<link rel=\"stylesheet\" type=\"text/css\" href=\"Style.css\">"
				+ "</head>"
				+ "<center>"
				+ "<body>"
				+ "<div class=\"menu\">\r\n" + 
				"	\r\n" + 
				"	<a style=\"float:left;\">Welcome Admin</a>\r\n" + 
				"	<a href=\"contact.jsp\">Contact</a>\r\n" + 
				"	<a href=\"aboutus.jsp\">About us</a>\r\n" + 
				"	<a href=\"index.jsp\">Logout</a>\r\n" + 
				"	<a href=\"emplog.jsp\">Employee login</a>\r\n" + 
				"</div><br><br>\r\n" + 
				"<center><h1>AnmolKhurana <span style=\"color: #e6b800\">Synergistics</span></h1></center><br><br>\r\n" + 
				
				
				"<table border=10><tr>"
				+ "<td style=\"color:#FFFFFF\">EMP_USERNAME</td>"
				+ "<td style=\"color:#FFFFFF\">EMP_PASSWORD</td>" 
				+ "<td style=\"color:#FFFFFF\">EMP_FIRSTNAME</td>"
				+"<td style=\"color:#FFFFFF\">EMP_LASTNAME</td>"
				+"<td style=\"color:#FFFFFF\">EMP_EMAIL</td>"
				+"<td style=\"color:#FFFFFF\">EMP_CONTACT</td>"
				+"<td style=\"color:#FFFFFF\">EMP_DOB</td></tr>");
				while(rs.next())
				{
					
					
					out.print("<tr><td style=\"color:#FFFFFF\">"+rs.getString("emp_username")+"</td>");
					out.print("<td style=\"color:#FFFFFF\">"+rs.getString("emp_password")+"</td>");
					out.print("<td style=\"color:#FFFFFF\">"+rs.getString("emp_firstname")+"</td>");
					out.print("<td style=\"color:#FFFFFF\">"+rs.getString("emp_lastname")+"</td>");
					out.print("<td style=\"color:#FFFFFF\">"+rs.getString("emp_email")+"</td>");
					out.print("<td style=\"color:#FFFFFF\">"+rs.getString("emp_contact")+"</td>");
					out.print("<td style=\"color:#FFFFFF\">"+rs.getString("emp_dob")+"</td></tr>");
				}
				out.println("</table></body></center></html>");
				con.close();
				
				
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
