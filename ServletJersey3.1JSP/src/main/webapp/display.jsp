<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%String name = request.getAttribute("label").toString(); 
	out.println(name);
	%> --%>
	
	<c:out value="Hello World"/><br>
	
	<%-- ${students}<br> --%>
	<c:forEach items="${students}" var="s">
	${s.name}<br>
	</c:forEach>
	
</body>
</html>