<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.io.PrintWriter" %>
   
    <%@page import="java.util.ArrayList" %>
    <jsp:useBean id="shop1" class="shop.shop" scope="page" />
    <jsp:setProperty name="shop1" property="totalprice"/>
    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
#main{
		width: 600px;
		min-height: 400px;
		padding-top: 15px;
	}
	#table {
		width: 450px;s
		border : 1px solid black;
		border-spacing: 0px
	}
	
	
a:hover
{
color: gray;
text-decoration:none;
}

body
{
 background-image: url("소라빵리미.jpg");
 background-attachment: fixed;
 background-size: 50%;
 


}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content ="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>掲示板</title>
</head>
<body>

<%

String userid=null;

if(session.getAttribute("userid")!=null)
{
	userid=(String) session.getAttribute("userid");
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
<li class="active"><a href="shopping.jsp">製品購買</a></li>
<li><a href="shoppinghistory.jsp">購買目録</a></li>
<li><a href="shoppingbbs.jsp">購買後記</a></li>


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
<div class="col-lg-4"></div>
<div class="col-lg-4">
<div class="jumbotron" style="padding-top: 20px;">



<div class="form-group">

花咲銀行　<br>
２２７－２４１－１３４２５１　<br>
　海武器真綾に　<%=shop1.getTotalprice() %>円を　入金してください。
</div>
<input onclick="return confirm('本当に　脱退しますか？')"   type="button" class="btn btn-promary form-control" value="確認">

</div>
</div>
<div class="col-lg-4"></div>
</div>




<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>