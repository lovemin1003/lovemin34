<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.PrintWriter" %>
    <%@page import="bbs.bbs" %>
    <%@page import="bbs.shopbbsdao" %>
    
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



</div>

</nav>

<div class="container">
<div class="row">
<form method="post" action="shoppingupdateaction.jsp?bbsid=<%= bbsid %>"enctype="multipart/form-data">
<table class="table table-striped" style="text-align:center; border: 1px dotted cyan">
<thead>
<tr>
<th colspan="2" style="background-color: pink; text-align: center;">購買後記 掲示板　文の修正</th>
</tr>
</thead>
<tbody>
<tr>
<td><input type="text" class="form-control" placeholder="タイトル" name="bbstitle" maxlength="50"value=" <%= bbs.getBbstitle() %>"></td>
</tr>
<tr>
<td><textarea class="form-control" placeholder="内容" name="bbscontent" maxlength="3000" style="height: 350px;"><%= bbs.getBbscontent() %></textarea></td>
</tr>
<tr>
				<td align="left" colspan="2" id = "border">
					ファイル: <input type="file" name="filename" > 
						
				
				</td>
			</tr>
</tbody>
</table>
<input type="submit"  onclick="return confirm('本当に　修正しますか？')" class="btn btn-primary pull-right" style="background-color:#a23456;" value="文を修正する。">
</form>
</div>
</div>





<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>