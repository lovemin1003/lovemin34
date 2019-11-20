<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get">
<input type="checkbox" name="뱅드림" value="roselia"> 로젤리아
<input type="checkbox" name="뱅드림" value="poppin party!"> 포핀파티
<input type="checkbox" name="뱅드림" value="raise a suiren"> 라스(RAS)
<input type="submit" value="선택">
</form>
<% String[] bd=request.getParameterValues("뱅드림");

if(bd!=null) {%>
<p>당신이 고른 밴드:</p>
<ul>
<%
for(int a=0; a< bd.length; a++)
{%>

<li><%=bd[a] %></li>
<% 	
}
%>
</ul>
<a href="<%=request.getRequestURI()%>">다시 시도</a>
<% 	
}
%>

</body>
</html>