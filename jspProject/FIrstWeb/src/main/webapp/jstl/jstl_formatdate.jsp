<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	request.setAttribute("now", new Date());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	${now} <br>
	
	<fmt:formatDate value="${now}"/> <br>
	
	<fmt:formatDate value="${now}" type="date"/> <br>
	<fmt:formatDate value="${now}" type="date" dateStyle="full"/> <br>
	<fmt:formatDate value="${now}" type="date" dateStyle="short"/> <br><br><br><br>
	
	
	
	<fmt:formatDate value="${now}" type="time"/> <br>
	
	
	
	
	
	
	
	
	
	
	
	






</body>
</html>