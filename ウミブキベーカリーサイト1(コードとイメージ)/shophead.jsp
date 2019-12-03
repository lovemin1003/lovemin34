<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.io.PrintWriter" %>
    <%@page import="bbs.bbsdao" %>
    <%@page import="bbs.bbs" %>
    <%@page import="shop.shopdao" %>
    <%@page import="shop.shop" %>
    <%@page import="java.util.ArrayList" %>
    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">


body
{
 background-image: url("우리와 멍파치.jpg");
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
String customname=null;
if(session.getAttribute("customname")!=null)
{
	customname=(String) session.getAttribute("customname");
}

String hope=null;
if(session.getAttribute("hope")!=null)
{
	hope=(String) session.getAttribute("hope");
}
String customaddress1=null;
if(session.getAttribute("customaddress1")!=null)
{
	customaddress1=(String) session.getAttribute("customaddress1");
}
String customaddress2=null;
if(session.getAttribute("customaddress2")!=null)
{
	customaddress2=(String) session.getAttribute("customaddress2");
}


String tel1=null;

if(request.getParameter("tel1") != null)
{
	tel1=(String) session.getAttribute("tel1");
}
String tel2=null;

if(request.getParameter("tel2") != null)
{
	tel2=(String) session.getAttribute("tel2");
}
String tel3=null;

if(request.getParameter("tel3") != null)
{
	tel3=(String) session.getAttribute("tel3");
}



int normalplain=0;
if(request.getParameter("normalplain") != null)
{
	normalplain = Integer.parseInt(request.getParameter("normalplain"));
}
int nutplain=0;
if(request.getParameter("nutplain") != null)
{
	nutplain = Integer.parseInt(request.getParameter("nutplain"));
}
int chocoplain=0;
if(request.getParameter("chocoplain") != null)
{
	chocoplain = Integer.parseInt(request.getParameter("chocoplain"));
}
int milkplain=0;
if(request.getParameter("milkplain") != null)
{
	milkplain = Integer.parseInt(request.getParameter("milkplain"));
}
int cornplain=0;
if(request.getParameter("cornplain") != null)
{
	cornplain = Integer.parseInt(request.getParameter("cornplain"));
}



int chococake=0;
if(request.getParameter("chococake") != null)
{
	chococake = Integer.parseInt(request.getParameter("chococake"));
}
int creamcake=0;
if(request.getParameter("creamcake") != null)
{
	creamcake = Integer.parseInt(request.getParameter("creamcake"));
}
int berrycake=0;
if(request.getParameter("berrycake") != null)
{
	berrycake = Integer.parseInt(request.getParameter("berrycake"));
}
int cheesecake=0;
if(request.getParameter("cheesecake") != null)
{
	cheesecake = Integer.parseInt(request.getParameter("cheesecake"));
}
int sweetpotatocake=0;
if(request.getParameter("sweetpotatocake") != null)
{
	sweetpotatocake = Integer.parseInt(request.getParameter("sweetpotatocake"));
}


int creamplus=0;
if(request.getParameter("normalplain") != null)
{
	normalplain = Integer.parseInt(request.getParameter("normalplain"));
}
int creamless=0;
if(request.getParameter("nutplain") != null)
{
	nutplain = Integer.parseInt(request.getParameter("nutplain"));
}


int chococorone=0;
if(request.getParameter("chococorone") != null)
{
	chococorone = Integer.parseInt(request.getParameter("chococorone"));
}
int pumpkincorone=0;
if(request.getParameter("pumpkincorone") != null)
{
	pumpkincorone = Integer.parseInt(request.getParameter("pumpkincorone"));
}
int berrycorone=0;
if(request.getParameter("berrycorone") != null)
{
	berrycorone = Integer.parseInt(request.getParameter("berrycorone"));
}



int beanbread=0;
if(request.getParameter("normalplain") != null)
{
	normalplain = Integer.parseInt(request.getParameter("normalplain"));
}


int chocomuffin=0;
if(request.getParameter("chocomuffin") != null)
{
	chocomuffin = Integer.parseInt(request.getParameter("chocomuffin"));
}
int planemuffin=0;
if(request.getParameter("planemuffin") != null)
{
	planemuffin = Integer.parseInt(request.getParameter("planemuffin"));
}
int honeymuffin=0;
if(request.getParameter("honeymuffin") != null)
{
	honeymuffin = Integer.parseInt(request.getParameter("honeymuffin"));
}



int potatokoroke=0;
if(request.getParameter("potatokoroke") != null)
{
	potatokoroke = Integer.parseInt(request.getParameter("potatokoroke"));
}
int currykoroke=0;
if(request.getParameter("currykoroke") != null)
{
	currykoroke = Integer.parseInt(request.getParameter("currykoroke"));
}
int vegekoroke=0;
if(request.getParameter("vegekoroke") != null)
{
	vegekoroke = Integer.parseInt(request.getParameter("vegekoroke"));
}


int croissant=0;
if(request.getParameter("croissant") != null)
{
	croissant = Integer.parseInt(request.getParameter("croissant"));
}
int chococroissant=0;
if(request.getParameter("chococroissant") != null)
{
	chococroissant = Integer.parseInt(request.getParameter("chococroissant"));
}
int almondcroissant=0;
if(request.getParameter("almondcroissant") != null)
{
	almondcroissant = Integer.parseInt(request.getParameter("almondcroissant"));
}



int vegesandwich=0;
if(request.getParameter("vegesandwich") != null)
{
	vegesandwich = Integer.parseInt(request.getParameter("vegesandwich"));
}
int chickensandwich=0;
if(request.getParameter("chickensandwich") != null)
{
	chickensandwich = Integer.parseInt(request.getParameter("chickensandwich"));
}
int beefsandwich=0;
if(request.getParameter("beefsandwich") != null)
{
	beefsandwich = Integer.parseInt(request.getParameter("beefsandwich"));
}
int hamsandwich=0;
if(request.getParameter("hamsandwich") != null)
{
	hamsandwich = Integer.parseInt(request.getParameter("hamsandwich"));
}
int eggsandwich=0;
if(request.getParameter("eggsandwich") != null)
{
	normalplain = Integer.parseInt(request.getParameter("normalplain"));
}



int choucream=0;
if(request.getParameter("choucream") != null)
{
	choucream = Integer.parseInt(request.getParameter("choucream"));
}



int cheesetart=0;
if(request.getParameter("cheesetart") != null)
{
	cheesetart = Integer.parseInt(request.getParameter("cheesetart"));
}
int eggtart=0;
if(request.getParameter("eggtart") != null)
{
	eggtart = Integer.parseInt(request.getParameter("eggtart"));
}
int walnuttart=0;
if(request.getParameter("walnuttart") != null)
{
	walnuttart = Integer.parseInt(request.getParameter("walnuttart"));
}


int planemakaron=0;
if(request.getParameter("planemakaron") != null)
{
	planemakaron = Integer.parseInt(request.getParameter("planemakaron"));
}
int chocomakaron=0;
if(request.getParameter("chocomakaron") != null)
{
	chocomakaron = Integer.parseInt(request.getParameter("chocomakaron"));
}
int berrymakaron=0;
if(request.getParameter("berrymakaron") != null)
{
	berrymakaron = Integer.parseInt(request.getParameter("berrymakaron"));
}
int cheesemakaron=0;
if(request.getParameter("cheesemakaron") != null)
{
	cheesemakaron = Integer.parseInt(request.getParameter("cheesemakaron"));
}
int greenmakaron=0;
if(request.getParameter("greenmakaron") != null)
{
	greenmakaron = Integer.parseInt(request.getParameter("greenmakaron"));
}


int dacquoise=0;
if(request.getParameter("dacquoise") != null)
{
	dacquoise = Integer.parseInt(request.getParameter("dacquoise"));
}


int chocochip=0;
if(request.getParameter("chocochip") != null)
{
	chocochip = Integer.parseInt(request.getParameter("chocochip"));
}


int sabre=0;
if(request.getParameter("sabre") != null)
{
	sabre = Integer.parseInt(request.getParameter("sabre"));
}
int chocosabre=0;
if(request.getParameter("chocosabre") != null)
{
	chocosabre = Integer.parseInt(request.getParameter("chocosabre"));
}
int gingerbread=0;
if(request.getParameter("gingerbread") != null)
{
	gingerbread = Integer.parseInt(request.getParameter("gingerbread"));
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
aria-haspopup="true" aria-expanded="false">ログインする<span class="caret"></span></a>
<ul class="dropdown-menu">
<li><a href="login.jsp">ログイン</a><li>
<li><a href="join.jsp">会員登録</a><li>
<li><a href="findcow.jsp">ID探し</a></li>
<li><a href="findpw.jsp">パスワード探し</a></li>
</ul>
</li>
</ul>
</div>

</nav>

<div class="container" align="center">

<div class="jumbotron" style="padding-top: 20px; width: 450px;">
<form method="post" action="shoppingaction.jsp">
