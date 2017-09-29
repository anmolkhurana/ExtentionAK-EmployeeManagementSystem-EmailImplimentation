<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EmployeeActivities_Page</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
<div class="menu">
	
	<a style="float:left;">Welcome <%= request.getAttribute("e_uname") %></a>
	<a href="contact.jsp">Contact</a>
	<a href="aboutus.jsp">About us</a>
	<a href="index.jsp">Logout</a>
	<a href="adminlog.jsp">Admin login</a>
</div><br><br>
<center><h1>AnmolKhurana <span style="color: #e6b800">Synergistics</span></h1></center><br><br>
<div id="main">
	<div class="left">
	
	<h3 style="color:white;padding-left:40px;font-family:Roboto;">ACTIVITIES</h3><hr>
	<form action="editdataemp.jsp">
	<input  type="submit" name="editData_emp" value="Edit Data"></input><br><br>
	</form>
	<form action="changepassemp.jsp">
	<input  type="submit" name="changePassword_emp" value="Change Password"></input><br><br>
	</form>
	</div>
	
	<div class="right">
	<p style="color:#e6b800"><b>This page basically allows an employee to edit his own data. At the same time allows employee to change his password if necessary.</b></p>
	</div>
</div>
</body>
</html>