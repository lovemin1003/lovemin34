<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<style type="text/css">

	
a:hover
{
color: gray;
text-decoration:none;
}

body
{
 background-image: url("코로케 쿠미.jpg");
 background-attachment: fixed;
 background-size: 50%;
 


}


</style><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<li><a href="shopping.jsp">製品購買</a></li>
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
<form method="post" action="cowchangeaction.jsp">
<h3 style="text-align:center;"> 会員情報 修正 画面</h3>

<div class="form-group">
<input type="password" class="form-control" placeholder="パスワード" name="userpassword">
</div>
<div class="form-group">
<input type="text" class="form-control" placeholder="ニックネーム" name="username">
</div>
<div class="form-group" style="text-align: center;">
<div class ="btn-group" data-toggle="buttons">
<label class="btn btn-primary active">
<input type="radio"  name="usergender" autocomplete="off" value="男性" checked>男性
</label>
<label class="btn btn-primary active">
<input type="radio"  name="usergender" autocomplete="off" value="女性" checked>女性
</label>
</div>
</div>
<div class="form-group">
<input type="email" class="form-control" placeholder="イーメール" name="useremail">
</div>
<input type="submit" class="btn btn-promary form-control" value="修正する">
</form> 
</div>
</div>
<div class="col-lg-4"></div>
</div>


<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>