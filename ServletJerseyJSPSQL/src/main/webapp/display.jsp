<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:set var="str" value="Kamil Talowski is Java Student"/>
	
	
	
<%-- 		${fn:toLowerCase(str)} --%>
	
<%-- 		<c:if test="${fn:endsWith(str,'Student')}">
		
		Yeah I'm Student brother
	</c:if>  --%>
	
<%-- 	<c:if test="${fn:contains(str,'Java')}">
		
		Java is there
	</c:if> --%>
	
<%-- 	is there : ${fn:contains(str,"Java")} --%>
	
	<%-- index : ${fn:indexOf(str,"is")} --%>
	
	<%-- <c:forEach items="${fn:split(str,' ')}" var="s">
	<br> ${s}
	</c:forEach> --%>
	
	<%-- Length : ${fn:length(str)} --%>
	
	
<%-- 	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/kamilservlet" user="root" password="1234"/>
	<% Class.forName("com.mysql.jdbc.Driver");  %>
	<sql:query var="rs" dataSource="${db}"> select * from products </sql:query>
	
	<c:forEach items="${rs.rows}" var="products"> 
		<c:out value="${products.pid}"></c:out> : <c:out value="${products.name}"></c:out> : 
		<c:out value="${products.price}"></c:out>
	</c:forEach> --%>
	 
</body>
</html>