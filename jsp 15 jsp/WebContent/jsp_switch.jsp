<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% int day=1; %>
<% 
switch(day)
{
case 1:
	out.println("일요일.");
    break;
case 2:
	out.println("월요일.");
    break;
default:
	out.println("zz");
	break;
}
%>
</body>
</html>