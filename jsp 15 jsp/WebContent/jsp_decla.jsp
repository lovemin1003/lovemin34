<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.*" %>
<%!
Date date = new Date();
Date getdate()
{
	return date;
}

%>
현재 시각:
<%= getdate() %>
</body>
</html>