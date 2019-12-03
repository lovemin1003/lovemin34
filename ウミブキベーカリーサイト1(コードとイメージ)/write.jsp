<%@page import="user.userdao"%>
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.PrintWriter" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content ="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>掲示板</title>
</head>
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
String bbstitle=null;
if(session.getAttribute("filename")!=null)
{
	bbstitle=(String) session.getAttribute("bbstitle");
}
String filename=null;
if(session.getAttribute("filename")!=null)
{
	filename=(String) session.getAttribute("filename");
}

String name;
userdao dao = new userdao();

name = dao.checkLogin(userid, userpassword);//name= username(닉네임.)

if(userid==null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('会員登録すると 文を作成できます。')");
	script.println("location.href = 'join.jsp'");
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
<li class="active"><a href="bbs.jsp">掲示板</a></li>
<li><a href="shopping.jsp">製品購買</a></li>
<li><a href="shoppinghistory.jsp">購買目録</a></li>
<li><a href="shoppingbbs.jsp">購買後記</a></li>
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
<!--
<div class="container">
<div class="col-lg-4"></div>
<div class="col-lg-4">
<div class="jumbotron" style="padding-top: 20px;">
<form method="post" action="loginaction.jsp">
<h3 style="text-align:center;"> 로그인 화면</h3>
<div class="form-group">
<input type="text" class="form-control" placeholder="아이디" name="userid">
</div>
<div class="form-group">
<input type="password" class="form-control" placeholder="비밀번호" name="userpassword">
</div>
<input type="submit" class="btn btn-promary form-control" value="로그인">
</form> 
</div>
</div>
<div class="col-lg-4"></div>
</div>

-->
<div class="container">
<div class="row">
<form name="form" method="post" action="writeaction.jsp" enctype="multipart/form-data">
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
				<td align="left" colspan="2" id = "border">
					ファイル: <input type="file" name="filename"> 
						
				
				</td>
			</tr>
</tbody>
</table>
<input type=submit  class="btn btn-primary pull-right" value="文を作成する">
</form>



</div>
</div>





<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>

</html>