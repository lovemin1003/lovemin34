<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="bbs.bbs" %>
<%@page import="bbs.shopbbsdao" %>
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

int bbsid=0;
if(request.getParameter("bbsid")!=null)
{
	bbsid=Integer.parseInt(request.getParameter("bbsid"));
}
if(bbsid==0)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("有効しない文です。");
	script.println("location.href = 'shoppingbbs.jsp'");
	script.println("</script>");
}

bbs bbs = new shopbbsdao().getbbs(bbsid);
if(!userid.equals(bbs.getUserid()))
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("権限なし。");
	script.println("location.href = 'shoppingbbs.jsp'");
	script.println("</script>");
}


	else
	{
		shopbbsdao bbsdao = new shopbbsdao();
		int result = bbsdao.delete(bbsid);
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
			script.println("location.href = 'shoppingbbs.jsp'");
			script.println("</script>");
		}
	}








%>
</body>
</html>