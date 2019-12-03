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
<title>掲示板</title>
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
	userid=(String)session.getAttribute("userid");
}
//String bbstitle=null;
//if(session.getAttribute("bbstitle")!=null)
//{
//	bbstitle=(String)session.getAttribute("bbstitle");
//}
String userpassword=null;
if(session.getAttribute("userpassword")!=null)
{
	userpassword=(String)session.getAttribute("userpassword");
}
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
//String filename=null;
//if(session.getAttribute("filename")!=null)
//{
//	filename=(String) session.getAttribute("filename");
//}


%>



<%=userid %>
<%=bbs.getBbstitle() %>
<%=bbs.getFilename() %>

<%=bbs.getBbstitle() %>

<%
if(userid==null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('ログインしてください。')");
	script.println("location.href = 'join.jsp'");
	script.println("</script>");
}

// < > [ ] ^ ` { | } 
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


if(
bbs.getBbstitle()==null||
bbs.getBbscontent()==null)//getParameter로 받은 값은 이걸로 null인지 아닌지 판별이 안 되는 듯.
{
//	PrintWriter script = response.getWriter();
//	script.println("<script>");
//	script.println("alert('입력이 안 된 부분이 있습니다.')");
//	script.println("history.back()");
//	script.println("</script>");

	
}

else
{
	

bbsdao bbsdao = new bbsdao();
int result = bbsdao.write(bbs.getBbstitle(), userid, bbs.getBbscontent(), bbsdao.checkLogin(userid),filename);

if(result==-1)
{
	session.setAttribute("bbsid",bbs.getBbsid());
	

	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('タイトルと内容　全て　入力してください。')");
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
	script.println("alert('作成成功。')");
	script.println("location.href = 'bbs.jsp'");
	script.println("</script>");
}


}








%>
</body>
</html>