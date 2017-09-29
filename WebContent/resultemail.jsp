<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ResulEmail_Page</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
<div class="menu">
	
	<a style="float:left;">Welcome Employee </a>
	<a href="contact.jsp">Contact</a>
	<a href="aboutus.jsp">About us</a>
	<a href="index.jsp">Logout</a>
	<a href="adminlog.jsp">Admin login</a>
</div><br><br>
<center><h1>AnmolKhurana <span style="color: #e6b800">Synergistics</span></h1></center><br><br>
<center><h2 style="color:white"><%=request.getAttribute("Message")%></h2></center>
<center><h2 style="color:white">The Employer will update the registration process in next 42 hours. You will receive Username and Password 
in a secure email sent over SMTP.</h2></center>
<center><h2 style="color:white">Thanks for Joining<span style="color: blue"> AnmolKhurana</span><span style="color: #e6b800"> Synergistics</span></h2>></center>
</body>
</html>