<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EmailForm_Page</title>
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
<h2 style="color:#e6b800">Account Information</h2><hr>
<div id="main">
	<div class="leftn">
	
	<center><h3 style="color:white;padding-left:40px;font-family:Roboto;">NOTE</h3></center><hr>
	<center><p>Please provide Recipient's address as "anmolkhuranaindustriesandgroups@gmail.com". Write "Add New Employee" as a subject line. Also Provide your Full name along with your Branch 
	name in the context area provided on the right hand side. </p></center>
	
	<center><p>It might take couple of minutes.</p></center>
	</div>
	
</div>
<div class="rightn">
	<form action="emailsendingservlet" method="post">
	
	<center><input type="text" name="recipient" placeholder="Recipient Address"></input><br><br></center>
	<center><input type="text" name="subject" placeholder="Subject"></input><br><br></center>
	<center><textarea  rows="10" cols="39" name="content" placeholder="Content"></textarea><br><br></center>
	<center><input id="in" type="submit" name="applyregistration_emp" value="Send Request"></input><br><br></center>
	
	</form>
</div>

</body>
</html>