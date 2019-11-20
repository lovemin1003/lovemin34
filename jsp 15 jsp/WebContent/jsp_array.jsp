<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String[] color={"소나타","캐로","카논"}; %>
<%for(int a=0; a<color.length; a++) { %>
 <%=color[a] %><br>
<%} %>
</body>
</html>