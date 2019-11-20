<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% ArrayList ar= new ArrayList(); %>
<% 
ar.add("피나");
ar.add("세레나");
%>
<% for(int a=0; a<ar.size(); a++) 
{
	out.println(ar.get(a));
}
	
%>
</body>
</html>