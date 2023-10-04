<%@ page import="com.talowski.web.model.Person" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	Selected person: 
	<%
		Person p1 = (Person)request.getAttribute("person");
		out.println(p1);
	%><br>Rows Affected: 
	<% 
	 	int rowsAffected = (int)request.getAttribute("isCreated");
		out.println(rowsAffected);
	%><br>
	
</body>
</html>