<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% int fs; %>
<% for(fs=1; fs<=11; fs+=2) { %>
<font color="red" size="<%=fs %>">
뭐 먹을까?
</font>
<% } %>
</body>
</html>