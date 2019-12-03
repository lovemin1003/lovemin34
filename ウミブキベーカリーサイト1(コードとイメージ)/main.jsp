<%@page import="user.userdao"%>
<%@page import="user.user1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.PrintWriter" %>
     <%@page import="java.util.ArrayList" %>
          <%@page import="java.util.Date" %>
     
<!DOCTYPE html>
<html>
<head>

<!--  時計機能 -->
 
  <link rel="stylesheet" href="styles.css">
  <link rel="stylesheet" type="text/css" href="mystyle.css"/>
  <script defer src="script.js"></script>
  
  
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


int pagenumber = 1;//基本ページ
 
if(request.getParameter("pagenumber") != null)
{
	pagenumber = Integer.parseInt(request.getParameter("pagenumber"));
}


String name;

userdao dao = new userdao();

name = dao.checkLogin(userid, userpassword);



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
<li class="active"><a href="main.jsp">メイン</a></li>
<li><a href="bbs.jsp">掲示板</a></li>
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



<%
Date d = new Date();
int e=(d.getMonth()+1)%12;//月を示す
%>

<%
if(e==0)//１２月の場合
{
	e=12;
}
%>


<aside id="left">
 <div class="시계">
    <!-- div.number.number$*12{$}*12 -->
    <div class="표시 초침" 데이타-초></div>
    <div class="표시 분침" 데이타-분></div>
    <div class="표시 시침" 데이타-시></div>
    <div class="숫자 숫자1">1</div>
    <div class="숫자 숫자2">2</div>
    <div class="숫자 숫자3">3</div>
    <div class="숫자 숫자4">4</div>
    <div class="숫자 숫자5">5</div>
    <div class="숫자 숫자6">6</div>
    <div class="숫자 숫자7">7</div>
    <div class="숫자 숫자8">8</div>
    <div class="숫자 숫자9">9</div>
    <div class="숫자 숫자10">10</div>
    <div class="숫자 숫자11">11</div>
    <div class="숫자 숫자12">12</div>
  </div>
  <%=d.getYear()+1900 %>年 <%=e %>月<%=d.getDate() %>月
 
 
</aside>
<aside id="left">
 
  <h4>パンのメニュー</h4>
  <table width=175px>
<ul>
<li><a id="plainbread" target="iframe1" href="제품설명/식빵.html">食パン</a></li>
<li><a id="cake" target="iframe1" href="제품설명/케이크.html">ケーキ</a></li>
<li><a id="melonbread" target="iframe1" href="제품설명/메론빵.html">メロンパン</a></li>
<li><a id="coronebread" target="iframe1" href="제품설명/소라빵.html">コロネ</a></li>
<li><a id="beanbread" target="iframe1" href="제품설명/단팥빵.html">アンパン</a></li>


<li><a id="muffin" target="iframe1" href="제품설명/머핀.html">マフィン </a></li>
<li><a id="koroke" target="iframe1" href="제품설명/고로케.html">コロッケ</a></li>
<li><a id="prancebread" target="iframe1" href="제품설명/크루아상.html">クロワッサン</a></li>
<li><a id="sandwich" target="iframe1" href="제품설명/샌드위치.html">サンドイッチ</a></li>
<li><a id="choucream" target="iframe1" href="제품설명/슈크림빵.html">シュークリームパン</a></li>
<li><a id="baguette" target="iframe1" href="제품설명/바게트.html">バゲット</a></li>


</ul>

 </table>
 <h4>お菓子のメニュー</h4>
  <table width=175px>

<ul>
<li><a id="tart" target="iframe1" href="제품설명/타르트.html">タルト</a></li>
<li><a id="makaron" target="iframe1" href="제품설명/마카롱.html">マカロン</a></li>
<li><a id="dacquoise" target="iframe1" href="제품설명/다쿠아즈.html">ダックワース</a></li>
<li><a id="chocochip" target="iframe1" href="제품설명/초코칩쿠키.html">チョコチップクッキー</a></li>
<li><a id="sabre" target="iframe1" href="제품설명/사브레.html">サブレ</a></li>
<li><a id="gingerbread" target="iframe1" href="제품설명/진저브레드.html">ジンジャーブレッド</a></li>




</ul>

 </table>
 
</aside>

<%if(userid!=null && userpassword!=null){ %>
<%=userid%>さん 
<%} %>


<%
switch(e)
{
//ちょっとした言語遊戯がある 月別セリフ。
case 1:
	%>
	１月には　苺ケーキで　新年の　願いを　叶えてみましょう。
	<% 
	break;
	
case 2:
	%>
	甘いお菓子には　もちろん　２月の　苦いコーヒーが　一番です！
	<% 
	break;
	
case 3:
	%>
	３月には　サンドイッチと一緒に　お出かけしてみましょう。
	<% 
	break;
	
case 4:
	%>
	４月の　パンは　様々なシロップと　ともに！
	<% 
	break;
	
case 5:
	%>
	５月の　エナジーは　コロッケに　お任せ！
	<% 
	break;
	
case 6:
	%>
    ６月には　まんまるの　ロールケーキが　お勧めです。
	<% 
	break;
	
case 7:
	%>
	７月には　やっぱり　バナナパン！
	<% 
	break;
	
case 8:
	%>
	８月には　甘さと健康の　申し子　蜂蜜マフィンを　是非　召し上がってください。
	<% 
	break;
	
case 9:
	%>
	９月の　月は　クロワッサンのように　すごく　素敵です。　
	<% 
	break;

case 10:
	%>
	１０月には　シュークリームが　誘う　甘い世界を　享受してみましょう。
	<% 
	break;
 
case 11:
	%>
	１１月には　愛する人に　チョコスティックで　愛を　伝えてみましょう。
	<% 
	break;
case 12:
	%>
	年末には　近い人と一緒に　楽しめる　クリスマスケーキは　いかがでしょうか。　
	<% 
	break;
	
default:
	%>
	ウミブキ　ベーカリー!
	<% 
	break;
}


%>


<aside id="left">
<section id="main">

<article id="article1">

<iframe name="iframe1" src="제품설명/케이크.html" width="1040" height="600" seamless>
</iframe>
</article>

</section>

<footer align="center">umibuki's bread shop</footer>
</aside>




















<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>