<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminActivities_Page</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
<div class="menu">
	
	<a style="float:left;">Welcome <%= request.getAttribute("a_uname") %></a>
	<a href="contact.jsp">Contact</a>
	<a href="aboutus.jsp">About us</a>
	<a href="index.jsp">Logout</a>
	<a href="emplog.jsp">Employee login</a>
</div><br><br>
<center><h1>AnmolKhurana <span style="color: #e6b800">Synergistics</span></h1></center><br><br>
<div id="main">
	<div class="left">
	
	<h3 style="color:white;padding-left:40px;font-family:Roboto;">ACTIVITIES</h3><hr>
	<form action="addemp.jsp">
	<input id="adminactlinks" type="submit" name="add_emp" value="Add Employee"></input><br><br>
	</form>
	<form action="viewemp.jsp">
	<input id="adminactlinks" type="submit" name="view_emp" value="View Employee"></input><br><br>
	</form>
	<form action="delemp.jsp">
	<input id="adminactlinks" type="submit" name="del_emp" value="Delete Employee"></input><br><br>
	</form>
	</div>
	
	<div class="right">
	<p style="color:#e6b800"><b>This page allows admin to work upon 3 functionalities. Firstly this page allows admin to add a new employee. Secondly, allows admin to 
	view an employee's data. Thirdly, allows admin to delete an employee's record from the database.</b></p>  
	</div>
</div>
</body>
</html>