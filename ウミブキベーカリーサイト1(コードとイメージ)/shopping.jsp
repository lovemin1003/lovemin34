<%@page import="user.userdao"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content ="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">

<style>
body
{
 background-image: url("우리와 멍파치.jpg");
 background-attachment: fixed;
  background-size: 50%;

  background-repeat:repeat;


}
</style>

<title>掲示板</title>
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

String name;
userdao dao = new userdao();

name = dao.checkLogin(userid, userpassword);//name= username(닉네임.)

if(userid==null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('簡単な会員登録で購買出来ます。')");
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
<li><a href="bbs.jsp">掲示板</a></li>
<li class="active"><a href="shopping.jsp">製品購買</a></li>
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


<div class="container" align="center">

<div class="jumbotron" style="padding-top: 20px; width: 400px;">
<form method="post" action="plainbreadaction.jsp">
<h3 style="text-align:center;">どんな製品を　探していますか？</h3>

<a id="a" href="multishopping.jsp" class="btn btn-primary form-control" style="background-color: gray;">二種類以上　購買</a> 


<h4>パン</h4>

<a id="a" href="plainbread.jsp" class="btn btn-primary form-control" style="background-color: #2FF00F;">様々な食べ方がある　食パン</a> 
<a id="a" href="cake.jsp" class="btn btn-primary form-control" style="background-color: white; color: black;">愛おしい人と共に！ ケーキ</a>
<a id="a" href="melonbread.jsp" class="btn btn-primary form-control" style="background-color: yellowgreen;">本物のメロンが入った メロンパン</a>
<a id="a" href="coronebread.jsp" class="btn btn-primary form-control" style="background-color: #FF8C80; color: black;">常連さんの 人気メニュー コロネ</a>
<a id="a" href="beanbread.jsp" class="btn btn-primary form-control" style="background-color: orange;">うちの看板メニュー アンパン</a>
<a id="a" href="muffin.jsp" class="btn btn-primary form-control" style="background-color: #259A0A;">食事でもおやつでも マフィン</a>
<a id="a" href="koroke.jsp" class="btn btn-primary form-control" style="background-color: yellow; color:black;">揚げ物のアイドル コロッケ</a>
<a id="a" href="prancebread.jsp" class="btn btn-primary form-control" style="background-color: blue;">バターの幸せ クロワッサン</a>
<a id="a" href="sandwich.jsp" class="btn btn-primary form-control" style="background-color: #7F00FF;">忙しい人のために！ サンドイッチ</a>
<a id="a" href="choucream.jsp" class="btn btn-primary form-control" style="background-color: #EEEE82; color:black;">ソフトな味 シュークリームパン</a>

<h4>お菓子</h4>

<a id="a" href="tart.jsp" class="btn btn-primary form-control" style="background-color: cyan; color:black;">パイ上のアート タルト</a>
<a id="a" href="makaron.jsp" class="btn btn-primary form-control" style="background-color: pink;">一口の幸せ マカロン</a>
<a id="a" href="dacquoise.jsp" class="btn btn-primary form-control" style="background-color: #A52A0A;">花よりダックワース</a>
<a id="a" href="chocochip.jsp" class="btn btn-primary form-control" style="background-color: #800000;">クッキー王 チョコチップクッキー</a>
<a id="a" href="sabre.jsp" class="btn btn-primary form-control" style="background-color: #905020;">カリカリで甘いな サブレ</a>
<a id="a" href="gingerbread.jsp" class="btn btn-primary form-control" style="background-color: #809040;">可愛い ジンジャーブレッド</a>
<h4></h4>
<a id="a" href="main.jsp" class="btn btn-primary form-control" style="background-color: black;">キャンセル</a>
</form> 
</div>


<div class="col-lg-4"></div>

</div>


<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>

</html>