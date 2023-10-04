<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	response.setHeader("cache-Control", "no-cache, no-store, must-revalidate");//Http 1.1
	response.setHeader("Pragma", "no-cache"); //Http 1.0
	response.setHeader("Expires", "0"); //Proxies
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
	%>
	
	video link<br>
	<iframe width="560" height="315" src="https://www.youtube.com/embed/gQLQ0t9B5yk?si=UtxlRKp5wRmSnz9m" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
</body>
</html>