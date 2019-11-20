<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%int day=1; %>
<% if(day==1 | day==7)
	{%>
	<p> 딱지치자!</p>
	
<% }else {%>
<p> 일하자!</p>
<%} %>
</body>
</html>