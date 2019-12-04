<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="user.userdao" %>
<%@page import="user.user1" %>
<%@page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user1" class="user.user1" scope="page" />
<jsp:setProperty name="user1" property="userid"/>
<jsp:setProperty name="user1" property="username"/>
<jsp:setProperty name="user1" property="userpassword"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>게시판</title>
</head>
<body>
<%

String username=null;
if(session.getAttribute("username")!=null)
{
	username=(String) session.getAttribute("username");
}






if(username!=null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("既にログインしています。");
	script.println("location.href = 'main.jsp'");
	script.println("</script>");
}

if(
user1.getUsername()==null||
user1.getUserpassword()==null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('全て入力してください。')");
	script.println("history.back()");
	script.println("</script>");
}

else
{

userdao userdao = new userdao();
//int result1 = userdao.login1(user1.getUsername(), user1.getUserid(), user1.getUseremail());//이것만 입력해도 닉네임이 나오도록 해야 함.
//int result1 = userdao.login1(user1.getUsername(), user1.getUseremail());

int result1 = userdao.login1(user1.getUsername(), user1.getUserpassword());


if(result1==1)
{
	//session.setAttribute("userid",user1.getUserid());
	session.setAttribute("username",user1.getUsername());
	session.setAttribute("userpassword",user1.getUserpassword());


	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("location.href = 'findcowresult.jsp'");
	script.println("</script>");
}

else if(result1==0)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('パスワードが間違っています。')");
	script.println("history.back()");
	script.println("</script>");
}

else if(result1==-1)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('そんなIDは　ありません。')");
	script.println("history.back()");
	script.println("</script>");
}

else if(result1==-2)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('データベースのエラー　発生')");
	script.println("history.back()");
	script.println("</script>");
}


}




%>
</body>
</html>