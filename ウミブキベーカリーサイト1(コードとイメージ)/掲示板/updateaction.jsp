<%@page import="bbs.bbsdao" %>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="bbs.bbs" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

bbs bbs = new bbs();



	
	String realpath = request.getServletContext().getRealPath("/Storage");
	
	MultipartRequest mr = new MultipartRequest(request,realpath,1024 * 1024 * 500,
			"UTF-8", new DefaultFileRenamePolicy() );
	


	//bbs.setBbsid(mr.getParameter("bbsid"));
	bbs.setBbstitle(mr.getParameter("bbstitle"));
	bbs.setBbscontent(mr.getParameter("bbscontent"));
	
	
	
	System.out.println(mr.getOriginalFileName("filename"));//파일의 원래 이름
	
	
	String filename = mr.getFilesystemName("filename");//실제 저장된 파일 이름
	System.out.println(filename);
	bbs.setFilename(filename);

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

String username=null;

if(session.getAttribute("username")!=null)
{
	username=(String) session.getAttribute("username");
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
	script.println("location.href = 'bbs.jsp'");
	script.println("</script>");
}

bbs bbs1 = new bbsdao().getbbs(bbsid);
if(!userid.equals(bbs1.getUserid()))
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("権限なし。");
	script.println("location.href = 'bbs.jsp'");
	script.println("</script>");
}

//< > [ ] ^ ` { | } 
if(bbs.getFilename()!=null)
{
if(
bbs.getFilename().contains("<")||
bbs.getFilename().contains(">")||
bbs.getFilename().contains("[")||
bbs.getFilename().contains("]")||
bbs.getFilename().contains("^")||
bbs.getFilename().contains("`")||
bbs.getFilename().contains("{")||
bbs.getFilename().contains("|")||
bbs.getFilename().contains("}"))
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('ファイル名に < > [ ] ^ ` { | }が入った　ファイルは載せられません。')");
//	script.println("history.back()"); 기능을 못 함(잠깐 원래대로 돌아갔다가 작성처리됨.)
	script.println("</script>");
}
//script.printf("location.href = 'view.jsp?bbsid=%d'",bbsid);

}


		bbsdao bbsdao = new bbsdao();
		int result = bbsdao.update(bbsid ,bbs.getBbstitle(), bbs.getBbscontent(),filename);
		if(result == -1)
		{
			
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("修正失敗。");
			script.println("history.back()");
			script.println("</script>");
		}
		if(result==-2)//위의 제 기능을 못 하는 script.println("history.back()");을 대신해서 이걸 만들어 놓고 막음.
		{
			session.setAttribute("bbsid",bbs.getBbsid());
			

			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("history.back()");
			script.println("</script>");
		}

		else
		{
			PrintWriter script = response.getWriter();
			script.println("<script>");
			
			script.printf("location.href = 'view.jsp?bbsid=%d'",bbsid);

			script.println("</script>");
		}
	








%>
</body>
</html>