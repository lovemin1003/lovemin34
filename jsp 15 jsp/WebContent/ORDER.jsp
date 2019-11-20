<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.util.*, java.lang.*" %>
    <%@page import="java.sql.*" %>
    
    <% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>애니 매장 예제</title>
</head>
<body>
<h1>인터넷 애니 문고</h1>
<p>제목을 입력하시오.</p>
<form method="post">
제목:<input type="text" name="title"><br> 
<input type="submit" value="검색">
</form>

<%
String title = request.getParameter("title");

if (title != null)
{
%>
<%

Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection
  ("jdbc:mysql://localhost:3306/book_db","root","kkue1004");	



Statement stmt = conn.createStatement();

String sqlStr = "select * from book_table where title like";
       sqlStr +="'%"+title+"%'";
       sqlStr += "order by title asc";
       ResultSet rset = stmt.executeQuery(sqlStr);

}
%>
<hr>
</body>
</html>