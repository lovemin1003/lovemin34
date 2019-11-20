<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	int java = Integer.parseInt(request.getParameter("java"));
	int jsp = Integer.parseInt(request.getParameter("jsp"));
	int spring = Integer.parseInt(request.getParameter("spring"));

	int tot = java + jsp + spring;
	
	double avg = tot/3.0;
	
	//소수점 두번째자리.
	DecimalFormat df = new DecimalFormat("##.##");
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align = "center">
		<tr>
			<th>Name</th>
			<td><%=name %></td>
		</tr>
		<tr>
			<th>Java</th>
			<td><%=java %></td>
		</tr>
		<tr>
			<th>Jsp</th>
			<td><%=jsp %></td>
		</tr>
		<tr>
			<th>Spring</th>
			<td><%=spring %></td>
		</tr>
		<tr>
			<th>Tot</th>
			<td><%=tot %></td>
		</tr>
		<tr>
			<th>avg</th>
			<td><%=df.format(avg) %></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<%if(avg>=60) {%>
					합격입니다!!
				<%}else { %>
					불합격입니다!!
				<%} %>
			</td>
		</tr>
	</table>
</body>
</html>













