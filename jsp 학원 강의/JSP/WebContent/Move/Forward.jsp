<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	request.setAttribute("name", "김민준");

	//pageContext.forward("/Move/End.jsp");

	//RequestDispatcher rd = request.getRequestDispatcher("/Move/End.jsp");
	
	//rd.forward(request, response);
	
%>

<jsp:forward page="/Move/End.jsp">
	<jsp:param value="김민준" name="name"/>
</jsp:forward>
