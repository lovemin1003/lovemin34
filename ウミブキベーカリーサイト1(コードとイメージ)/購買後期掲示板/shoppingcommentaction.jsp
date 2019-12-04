<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="bbs1.shopbbs1dao" %>
<%@page import="bbs.shopbbsdao" %>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.PrintWriter" %>
<%request.setCharacterEncoding("UTF-8");%>
<%@page import="bbs.bbs" %>
<%@page import="bbs1.bbs1" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>掲示板</title>
</head>
<body>
<%

bbs1 bbs1 = new bbs1();


String realpath = request.getServletContext().getRealPath("/Storage");

MultipartRequest mr = new MultipartRequest(request,realpath,1024 * 1024 * 500,
		"UTF-8", new DefaultFileRenamePolicy() );




bbs1.setBbscontent1(mr.getParameter("bbscontent1"));



System.out.println(mr.getOriginalFileName("filename"));//파일의 원래 이름


String filename = mr.getFilesystemName("filename");//실제 저장된 파일 이름
System.out.println(filename);
bbs1.setFilename(filename);

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
%>
<%@page import="user.userdao"%>

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
int bbsid=0;

if(request.getParameter("bbsid") != null)
{
	bbsid = Integer.parseInt(request.getParameter("bbsid"));
}

%>



<%
	if(userid==null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('ログインしてください。')");
	script.println("location.href = 'main.jsp'");
	script.println("</script>");
}


if(
bbs1.getBbscontent1()==null

)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('コメントを　入力してください。')");
	script.println("history.back()");
	script.println("</script>");
}
//< > [ ] ^ ` { | } 
if(bbs1.getFilename()!=null)
{
if(
bbs1.getFilename().contains("<")||
bbs1.getFilename().contains(">")||
bbs1.getFilename().contains("[")||
bbs1.getFilename().contains("]")||
bbs1.getFilename().contains("^")||
bbs1.getFilename().contains("`")||
bbs1.getFilename().contains("{")||
bbs1.getFilename().contains("|")||
bbs1.getFilename().contains("}"))
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('ファイル名に < > [ ] ^ ` { | }が入った　ファイルは載せられません。')");
//	script.println("history.back()"); 기능을 못 함(잠깐 원래대로 돌아갔다가 작성처리됨.)
	script.println("</script>");
}
//script.printf("location.href = 'view.jsp?bbsid=%d'",bbsid);

}


	bbs bbs = new bbs();

shopbbsdao bbsdao = new shopbbsdao();
shopbbs1dao bbs1dao = new shopbbs1dao();
int result = bbs1dao.write(bbsid, userid, bbs1.getBbscontent1(), bbs1dao.checkLogin(userid), bbs1.getFilename());

if(result==-1)
{
	//

	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('コメント作成失敗。')");
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
	
	bbs1dao.commentcount(bbs.getBbsid());
	
	PrintWriter script = response.getWriter();
	script.println("<script>");
	//script.println("location.href = 'view.jsp'");
	script.println("history.back()");
	script.println("</script>");
}





%>
</body>
</html>