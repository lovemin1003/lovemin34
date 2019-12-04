<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.PrintWriter" %>
    <%@page import="bbs.shopbbsdao" %>
    <%@page import="bbs.bbs" %>
    <%@page import="bbs1.shopbbs1dao" %>
    <%@page import="bbs1.bbs1" %>
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
	userid=(String) session.getAttribute("userid");
}


String userpassword=null;
if(session.getAttribute("userpassword")!=null)
{
	userpassword=(String)session.getAttribute("userpassword");
}


int pagenumber = 1;//기본 페이지 의미
 
if(request.getParameter("pagenumber") != null)
{
	pagenumber = Integer.parseInt(request.getParameter("pagenumber"));
}


int cn = 5;//목록 출력을 위한 숫자(CheckNumber)

if(request.getParameter("cn") != null)
{
	cn = Integer.parseInt(request.getParameter("cn"));
}

int fn = 2;//앞쪽 목록 출력 조절을 위한 숫자(FrontNumber) 앞쪽에 cn-fn만큼 앞쪽 목록이 나옴.

if(request.getParameter("fn") != null)
{
	fn = Integer.parseInt(request.getParameter("fn"));
}

int nn = 1;// 뒷쪽 목록 출력 조절을 위한 숫자(NearNumber) 뒷쪽에 cn-nn만큼 뒷쪽 목록이 나옴.

if(request.getParameter("nn") != null)
{
	nn = Integer.parseInt(request.getParameter("nn"));
}

String search=null;

if(session.getAttribute("search")!=null)
{
	search=(String)session.getAttribute("search");
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
<table class="table table" style="text-align:center; border: 1px dotted black;">
<!-- 닉네임으로 글 검색창 -->
<form  class="navbak-form" method="post" action="shoppingsearchaction.jsp">
<div class="form-group">
<input type="text" name="search" class="pull" placeholder="作成者のIDで文を検索">
<button type="submit" class="btn-primary pull">検索</button>
</div>

</form>
<!-- 제목으로 글 검색창 -->
<form  class="navbak-form" method="post" action="shoppingtitlesearchaction.jsp">
<div class="form-group">
<input type="text" name="search" class="pull" placeholder="タイトルで文を検索">
<button type="submit" class="btn-primary pull">検索</button>
</div>

</form>

<!-- 글내용으로 글 검색창 -->
<form  class="navbak-form" method="post" action="shoppingcontentsearchaction.jsp">
<div class="form-group" >
<input type="text"  name="search" class="pull" placeholder="文の内容で文を検索">
<button type="submit" class="btn-primary pull" >検索</button>
</div>


</form>

<thead>
<tr>
<th style="background-color: red; text-align: center;">番号</th>
<th style="background-color: violet; text-align: center;">タイトル</th>
<th style="background-color: green; text-align: center;">作成者</th>
<th style="background-color: gray; text-align: center;">作成日</th>
<th style="background-color: black; color: white; text-align: center;">閲覧数</th>
<th style="background-color: orange; color: white; text-align: center;">コメント数</th>

</tr>
</thead>
<tbody>
<%=search %> 検索結果
<%

shopbbsdao bbsdao = new shopbbsdao();
ArrayList<bbs> list5 = bbsdao.getlist6(pagenumber,search);

shopbbs1dao bbs1dao = new shopbbs1dao();
ArrayList<bbs> list3 = bbsdao.getlist(pagenumber);

int a = 10*pagenumber;

int b = list5.size();

int c = a-b;
if(a>=b)
{
	a=b;
}

for(int i=0; i < a; i++)
{
	
	
%>


<tr>
<td><%= list5.get(i).getBbsid() %></td>
<td><a href="shoppingview.jsp?bbsid=<%= list5.get(i).getBbsid() %>"><%= list5.get(i).getBbstitle().replaceAll(" ","&nbsp").replaceAll("<", "&lt").replaceAll(">", "&gt").replaceAll("\n", "<br>")  %></a></td>
<td><%= list5.get(i).getUserid() %></td>
<td><%= list5.get(i).getBbsdate() %></td>
<td><%= list5.get(i).getHit() %></td>
<td><%=bbs1dao.commentcount(list5.get(i).getBbsid()) %></td>



</tr>

<% 

}


%>



</tbody>
</table>

<%
int d=-c;
if(d>10)
{
	d=10;
}
if( d>=1){
%>
<a href="contentsearch.jsp?pagenumber=<%= pagenumber + 1 %>"class="btn btn-success btn-arrow-left" style="background-color:#909020;">後 <%=d %>個</a>
<%
}
%>

<%
if(userid!=null && userpassword!=null){
%>
<a href="shoppingwrite.jsp" class="btn btn-primary pull-right" style="background-color: orange;">分を作成する。</a>
<%
}
%>
</div>
</div>



<div align="center"><!-- 내가 따로 만들어본 것 -->
<%
if(list5.size()==0){
%>
내용 <%=search %>를 포함한 글이 없습니다.

<%} %>

</div>

<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>