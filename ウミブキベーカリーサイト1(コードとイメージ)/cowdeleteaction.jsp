<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="user.userdao" %>
<%@page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user1" class="user.user1" scope="page" />
<jsp:setProperty name="user1" property="userid"/>
<jsp:setProperty name="user1" property="userpassword"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>게시판</title>
</head>
<body>
<%

String userid=null;
String userpassword=null;
%>



<%

//String userid=null;
//String userpassword=null;

if(session.getAttribute("userid")!=null)
{
	userid=(String) session.getAttribute("userid");
}
if(session.getAttribute("userpassword")!=null)
{
	userid=(String) session.getAttribute("userpassword");
}

if(
		
user1.getUserpassword()==null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('空いた所に 入力してください。')");
	
	script.println("history.back()");
	script.println("</script>");
}



else
{
	

userdao userdao = new userdao();

int result = userdao.delete(user1.getUserid(),user1.getUserpassword());




 if(result==0)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('パスワードが間違っています。')");
	script.println("history.back()");
	script.println("</script>");
}

else if(result==-1)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('そんなIDは　ありません。')");
	script.println("history.back()");
	script.println("</script>");
}



else if(result==-2)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('データベースのエラー　発生')");
	script.println("history.back()");
	script.println("</script>");
}


else if(result==-3)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('脱退成功です。')");
	script.println("location.href = 'logoutaction.jsp'");
	script.println("</script>");
}




}



%>





</body>
</html>