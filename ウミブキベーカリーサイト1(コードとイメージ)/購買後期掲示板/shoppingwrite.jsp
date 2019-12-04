<%@page import="user.userdao"%>
<%@page import="shop.shopdao"%>
<%@page import="shop.shop"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.PrintWriter" %>
     <%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content ="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>掲示板</title>
<style type="text/css">
a:hover
{
color: gray;
text-decoration:none;
}

body
{
 background-image: url("아오이.jpg");
 background-attachment: fixed;
  background-size: 25%;


}
</style>
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

String filename=null;
if(session.getAttribute("filename")!=null)
{
	filename=(String) session.getAttribute("filename");
}

int pagenumber = 999999999;//기본 페이지 의미

if(request.getParameter("pagenumber") != null)
{
	pagenumber = Integer.parseInt(request.getParameter("pagenumber"));
}

String name;
userdao dao = new userdao();

name = dao.checkLogin(userid, userpassword);//name= username(닉네임.)

if(userid==null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('会員登録後 購買すると 文を　作成できます。')");
	script.println("location.href = 'join.jsp'");
	script.println("</script>");
}




shopdao shopdao = new shopdao();
ArrayList<shop> list = shopdao.onlylist(pagenumber, userid);

ArrayList<shop> list2 = shopdao.getlist(pagenumber);

if(list.size()==0)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('購買すると 文を　作成できます。')");
	script.println("location.href = 'shopping.jsp'");
	script.println("</script>");

}


%>


<nav class ="navbar navbar-default">
<div class="navbar-header">
<button type ="button" class="navbar-toggle collapsed" data-toggle="collapse"
data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
<span class="icon-bar"></span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
</button>
<a class="navbar-brand" href="main.jsp">ウミブキ　ベーカリー　サイト</a>
</div>

<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
<ul class="nav navbar-nav">
<li><a href="main.jsp">メイン</a></li>
<li><a href="bbs.jsp">掲示板</a></li>
<li><a href="shopping.jsp">製品購買</a></li>
<li><a href="shoppinghistory.jsp">購買目録</a></li>
<li class="active"><a href="shoppingbbs.jsp">購買後記</a></li>
</ul>
<%
if(userid!=null && userpassword!=null)
{%>
<ul class="nav navbar-nav navbar-right">
<li class="dropdown">
<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
aria-haspopup="true" aria-expanded="false">会員管理<span class="caret"></span></a>
<ul class="dropdown-menu">
<li><a href="logoutaction.jsp">ログアウト</a><li>
<li><a href="cowview.jsp">会員情報を見る</a><li>
<li><a href="cowchange.jsp">会員情報を修正する</a><li>
<li><a href="cowdelete.jsp?userid=<%=userid%>">会員脱退</a><li>
</ul>
</li>
</ul>


<%
}

else{
%>
<ul class="nav navbar-nav navbar-right">
<li class="dropdown">
<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
aria-haspopup="true" aria-expanded="false">ログインする<span class="caret"></span></a>
<ul class="dropdown-menu">
<li><a href="login.jsp">ログイン</a><li>
<li><a href="join.jsp">会員登録</a><li>
<li><a href="findcow.jsp">ID探し</a></li>
<li><a href="findpw.jsp">パスワード探し</a></li>
</ul>
</li>
</ul>
<%}%>
</div>

</nav>

<div class="container">
<div class="row">


<% 
if(list.size()>=1)
{
%>
<form method="post" action="shoppingwriteaction.jsp" enctype="multipart/form-data">
<table class="table table-striped" style="text-align:center; border: 1px dotted cyan">
<thead>
<tr>
<th colspan="2" style="background-color: pink; text-align: center;">掲示板</th>
</tr>
</thead>
<tbody>
<tr>
<td><input type="text" class="form-control" placeholder="タイトル" name="bbstitle" maxlength="50"></td>
</tr>
<tr>
<td><textarea class="form-control" placeholder="内容" name="bbscontent" maxlength="3000" style="height: 350px;"></textarea></td>
</tr>
<tr>
				<td colspan="2" id = "border">
					ファイル: <input type="file" name="filename"> 
						
				
				</td>
			</tr>
</tbody>
</table>
<input type="submit" class="btn btn-primary pull-right" value="文を作成する">
</form>
<%
}
%>
</div>
</div>



<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>

</html>