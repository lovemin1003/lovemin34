<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="user.userdao" %>
<%@page import="java.io.PrintWriter" %>


<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user1" class="user.user1" scope="page" />
<jsp:setProperty name="user1" property="userid"/>
<jsp:setProperty name="user1" property="username"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>게시판</title>
</head>
<body>
<%

String userid=null;
if(session.getAttribute("userid")!=null)
{
	userid=(String) session.getAttribute("userid");
}

String username=null;
if(session.getAttribute("username")!=null)
{
	username=(String) session.getAttribute("username");
}






{

userdao userdao = new userdao();
int result = userdao.checkid(user1.getUserid());//이것만 입력해도 닉네임이 나오도록 해야 함.
//int result1 = userdao.login1(user1.getUsername(), user1.getUserpassword());//로그인시 닉네임도 나올 수 있게 하기 위해 만들어 본 것(테스팅) 이걸로 로그인시 아이디도 같이 출력되는 듯.



if(result==1)
{
	session.setAttribute("userid",user1.getUserid());
	session.setAttribute("username",user1.getUsername());


	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('その　ID、ニックネームを　使っている　会員が　あるため　他の　ID、ニックネームを　入力してください。')");
	script.println("history.back()");
	script.println("</script>");
}

else if(result==0)
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


}




%>
</body>
</html>