<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Emplog_Page</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
<div class="menu">
	<a href="contact.jsp">Contact</a>
	<a href="aboutus.jsp">About us</a>
	<a href="index.jsp">Logout</a>
	<a href="adminlog.jsp">Admin</a>
</div><br><br>
<center><h1>AnmolKhurana <span style="color: #e6b800">Synergistics</span></h1></center><br><br>
<form action="emplogcontroller" method="post">
<center><input type="text" name="e_uid" placeholder="Username"></input><br><br></center>
    <center><input type="password" name="e_pass" placeholder="Password"></input><br></center><br>
  	<center><input id="in" type= "submit" name="submit" value="LOGIN"></input><br><br></center>
    <center><p>Not registered? <a id="link" href="emailform.jsp">Ask for registration.</a></p></center>
</form>
</body>
</html>