<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 

System.out.println("날짜를 확인한다.");
java.util.Date date= new java.util.Date();
%>

<% out.println(String.valueOf(date)); %>
<br>
<%= date %>
<br>
ip주소:
<% out.println(request.getRemoteAddr()); %>
</body>
</html>