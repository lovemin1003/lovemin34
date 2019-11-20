<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("name", "김민준");

	//response.sendRedirect("/JSP/Move/End.jsp");
%>

<script>
	location.href = "/JSP/Move/End.jsp?name=김민준&age=20";
</script>