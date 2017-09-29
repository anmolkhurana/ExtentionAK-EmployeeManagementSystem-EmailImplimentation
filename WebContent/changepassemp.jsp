<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ChangePassword_Page</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
<div class="menu">
	
	<a style="float:left;">Welcome Employee</a>
	<a href="contact.jsp">Contact</a>
	<a href="aboutus.jsp">About us</a>
	<a href="index.jsp">Logout</a>
	<a href="adminlog.jsp">Admin login</a>
</div><br><br>
<center><h1>AnmolKhurana <span style="color: #e6b800">Synergistics</span></h1></center><br><br>
<form action="changepassempcontroller" method="post">
<h2 style="color:#e6b800">Information<h2><hr>
<h2>Note: Put same user name provided by the Admin on registration!!!</h2>
<center><input id= "first" style="text-indent:20px;" type="text" name="e_uid" placeholder="User name"><br></center>
<center><input id= "password" style="text-indent:20px;" type="password" name="password" placeholder="New Password"><br><center>
<center><input id= "confirmpass" style="text-indent:20px;" type="password" name="confirm" placeholder="Confirm password"><br><center>
<center><input id="in"  type="submit" name="submit" value="Change Password"></input></center>
</body>
</html>