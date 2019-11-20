<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%!
	int age = 17;

	int addAge(){
		age++;
		
		return age;
	}


%>
<%
	String name = "김민준";
	//int age = 17;
	
	//age++;

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <!-- <%= addAge() %> %> --> --%>
	<!-- HTML주석은 스크립트까지 주석을 처리할수 없다... 
		페이지소스보기 했을경우 스크립트 주석은 안보인다...
		HTML주석은 보인다..
	-->

	<div align="center">
		이름 : <%=name %><br>
		나이 : <%=addAge() %><br>
		<%if(age >= 20){%>
			성인입니다.<br>
		<% }else {
			out.write("미성년자 입니다.<br>");
		 } %>
	</div>
</body>
</html>















