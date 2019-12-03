<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="bbs.bbs" %>
<%@page import="bbs.bbsdao" %>
 <%@page import="bbs1.bbs1" %>
<%@page import="bbs1.bbs1dao" %>
<%@page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

String userid=null;
if(session.getAttribute("userid")!=null)
{
	userid=(String) session.getAttribute("userid");
}
if(userid==null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("ログインしてください。");
	script.println("location.href = 'login.jsp'");
	script.println("</script>");
}



int commentid=0;
if(request.getParameter("commentid")!=null)
{
	commentid=Integer.parseInt(request.getParameter("commentid"));
}

if(commentid==0)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('ㅠㅠ')");
	script.println("history.back()");
	script.println("</script>");
}





	
		bbs1dao bbsdao = new bbs1dao();
		int result = bbsdao.deletecomment(commentid);
		if(result == -1)
		{
			
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("削除失敗。");
			script.println("history.back()");
			script.println("</script>");
		}
		else
		{
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('削除成功。')");
			script.println("history.back()");
			script.println("</script>");
		}
	








%>
</body>
</html>