<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title>Display Employee Information</title>
	</head>
	<body bgcolor="#CCCCC">
		<center><h3>Display Employee Information</h3></center>
		<hr>
		<BR>
		<BR>
		<h4>Employee Information.....!</h4>
		<BR>
		<form name="displayform" method="post" >
			 <%
        			
       			        response.sendRedirect("/EmployeeStruts/PDisplay.do");
   			 %>
		</form>
	</body>
</html>
