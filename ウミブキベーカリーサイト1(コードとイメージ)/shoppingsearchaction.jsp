<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="bbs.shopbbsdao" %>

<%@page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>



<jsp:useBean id="bbs1" class="bbs.bbs" scope="page" />
<jsp:setProperty name="bbs1" property="search"/>





<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>掲示板</title>
</head>
<body>
<%
String userid=null;
if(session.getAttribute("userid")!=null)
{
	userid=(String)session.getAttribute("userid");
}
String userpassword=null;
if(session.getAttribute("userpassword")!=null)
{
	userpassword=(String)session.getAttribute("userpassword");
}
String search=null;

if(session.getAttribute("search")!=null)
{
	search=(String)session.getAttribute("search");
}
%>
<%@page import="user.userdao"%>
<%{
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	String name = null;
	
	
	
	userdao dao = new userdao();
	
	name = dao.checkLogin(userid, userpassword);//name= username(닉네임.)
	
	%>
		<%= name%> 
		
		<% }
		
%>

<% 



String username=null;
if(session.getAttribute("username")!=null)
{
	username=(String)session.getAttribute("username");
}
String usergender=null;
if(session.getAttribute("usergender")!=null)
{
	usergender=(String)session.getAttribute("usergender");
}
String useremail=null;
if(session.getAttribute("useremail")!=null)
{
	useremail=(String)session.getAttribute("useremail");
}


%>





<%

if(
bbs1.getSearch()==null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('入力してください。')");
	script.println("history.back()");
	script.println("</script>");
}

else
{
	

shopbbsdao bbsdao = new shopbbsdao();
int result = bbsdao.user1search(bbs1.getSearch());
int result1 = bbsdao.bbssearch(bbs1.getSearch());

if(result==-1 && result1==-1)
{
	session.setAttribute("search",bbs1.getSearch());
	

	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('そんなIDは　ありません。')");
	script.println("history.back()");
	script.println("</script>");
}

if(result1==-1)
{
	session.setAttribute("search",bbs1.getSearch());
	

	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('そのIDで　購買した製品は　ありません。')");
	script.println("history.back()");
	script.println("</script>");
}






else 
{
	session.setAttribute("search",bbs1.getSearch());

	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("location.href = 'shoppingsearch.jsp'");
	script.println("</script>");
}


}








%>
</body>
</html>