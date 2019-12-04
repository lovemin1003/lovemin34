<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.PrintWriter" %>
    <%@page import="bbs.bbs" %>
    <%@page import="bbs.bbsdao" %>
    <%@page import="bbs1.bbs1" %>
    <%@page import="bbs1.bbs1dao" %>
    <%@page import="user.userdao"%>
     <%@page import="java.util.ArrayList" %>
     <%@page import="java.util.Vector" %>
    <%@page import="shop.shop"%>
    <%@page import="shop.shopdao"%>
     


     
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content ="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">

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

int pagenumber = 1;//기본 페이지 의미

if(request.getParameter("pagenumber") != null)
{
	pagenumber = Integer.parseInt(request.getParameter("pagenumber"));
}
int shopid = 0;

if(request.getParameter("shopid") != null)
{
	shopid = Integer.parseInt(request.getParameter("shopid"));
}

int order = 0;
if(request.getParameter("order") != null)
{
	order = Integer.parseInt(request.getParameter("order"));
}

//String order="order";
//if(session.getAttribute("order")!=null)
//{
//	order=(String)session.getAttribute("order");
//}
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
<li class="active"><a href="shoppinghistory.jsp">購買目録</a></li>
<li><a href="shoppingbbs.jsp">購買後記</a></li>
</ul>
<%
	if(userid!=null && userpassword!=null)
{
%>
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
<%
	}
%>
</div>

</nav>



<div class="container">
<div class="row">
<%

shopdao shopdao = new shopdao();
ArrayList<shop> list = shopdao.onlylist(pagenumber, userid);

ArrayList<shop> list2 = shopdao.getlist(pagenumber);
int list3=(shopid-list2.size())*-1;
//for(int i=shopid; i <= shopid+2; i++)
//for(int i=shopid-1; i > 1; i--)	
{
	for(int i=shopid; i <= shopid; i++)
		//for(int i=shopid-1; i > 1; i--)	
		{
%>



<%} %>

<table class="table table-striped" style="text-align:center; border: 1px dotted cyan">

<thead>
<tr>
<th colspan="3" style="background-color: pink; text-align: center;">
<%=userid %>さんの <%=order%>番目 購買目録</th>

</thead>

<tbody>
<tr>
<td style="width:20%">購買日</td>
<td conspan="2"><%=list2.get(list3).getShoppingdate()%></td>
</tr>
<tr style="background-color:violet;">
<td>購買者ID</td>
<td conspan="2"><%=list2.get(list3).getUserid()%></td>
</tr>
<tr style="background-color:violet;">
<td>購買者の名前, 性別</td>
<td conspan="2"><%=list2.get(list3).getCustomname()%>(<%=list2.get(list3).getUsergender()%>)</td>
</tr>
<tr >
<td>購買者のイーメール</td>
<td conspan="2"><%=list2.get(list3).getUseremail()%></td>
</tr>

<tr >
<td>電話番号</td>
<td conspan="2">
<%=list2.get(list3).getTel1()%>-<%=list2.get(list3).getTel2()%>-<%=list2.get(list3).getTel3()%>
</td>
</tr>
<tr >
<td>アドレス</td>
<td conspan="2"><%=list2.get(list3).getCustomaddress1()%> <%=list2.get(list3).getCustomaddress2()%></td>
</tr>

<tr>
<td style="background-color:black; color:white; ">購買目録</td>
<td conspan="2" style="min-height: 200px; text-align: left; background-color:white;">


<%
if(list2.get(list3).getNormalplain()>=1)
{
%>
基本の食パン:<%=list2.get(list3).getNormalplain()%>個
<%
}
%>
<%
if(list2.get(list3).getNutplain()>=1)
{
%>
栗食パン:<%=list2.get(list3).getNutplain()%>個
<%
}
%>
<%
if(list2.get(list3).getChocoplain()>=1)
{
%>
チョコ食パン:<%=list2.get(list3).getChocoplain()%>個
<%
}
%>
<%
if(list2.get(list3).getMilkplain()>=1)
{
%>
ミルク食パン:<%=list2.get(list3).getMilkplain()%>個
<%
}
%>
<%
if(list2.get(list3).getCornplain()>=1)
{
%>
コーン食パン:<%=list2.get(list3).getCornplain()%>個
<%
}
%>

<%
int plain=list2.get(list3).getNormalplain()+list2.get(list3).getNutplain()
+list2.get(list3).getChocoplain()+list2.get(list3).getMilkplain()
+list2.get(list3).getCornplain();

if(plain>=1)
{
%>
<br>
<%
}
%>

<%
if(list2.get(list3).getChococake()>=1)
{
%>
チョコケーキ:<%=list2.get(list3).getChococake()%>個
<%
}
%>
<%
if(list2.get(list3).getCreamcake()>=1)
{
%>
生クリームケーキ:<%=list2.get(list3).getCreamcake()%>個
<%
}
%>
<%
if(list2.get(list3).getBerrycake()>=1)
{
%>
苺ケーキ:<%=list2.get(list3).getBerrycake()%>個
<%
}
%>
<%
if(list2.get(list3).getCheesecake()>=1)
{
%>
チーズケーキ:<%=list2.get(list3).getCheesecake()%>個
<%
}
%>
<%
if(list2.get(list3).getSweetpotatocake()>=1)
{
%>
さつま芋ケーキ:<%=list2.get(list3).getSweetpotatocake()%>個
<%
}
%>

<%
int cake=list2.get(list3).getChococake()+list2.get(list3).getCreamcake()
+list2.get(list3).getBerrycake()+list2.get(list3).getCheesecake()
+list2.get(list3).getSweetpotatocake();

if(cake>=1)
{
%>
<br>
<%
}
%>

<%
if(list2.get(list3).getCreamplus()>=1)
{
%>
クリームあり:<%=list2.get(list3).getCreamplus()%>個
<%
}
%>
<%
if(list2.get(list3).getCreamless()>=1)
{
%>
クリームなし:<%=list2.get(list3).getCreamless()%>個
<%
}
%>

<%
int melonbread=list2.get(list3).getCreamplus()+
list2.get(list3).getCreamless();

if(melonbread>=1)
{
%>
<br>
<%
}
%>

<%
if(list2.get(list3).getChococorone()>=1)
{
%>
チョココロネ:<%=list2.get(list3).getChococorone()%>個
<%
}
%>
<%
if(list2.get(list3).getPumpkincorone()>=1)
{
%>
カボチャコロネ:<%=list2.get(list3).getPumpkincorone()%>個
<%
}
%>
<%
if(list2.get(list3).getBerrycorone()>=1)
{
%>
苺コロネ:<%=list2.get(list3).getBerrycorone()%>個
<%
}
%>

<%
int corone=list2.get(list3).getChococorone()+list2.get(list3).getPumpkincorone()
+list2.get(list3).getBerrycorone();

if(corone>=1)
{
%>
<br>
<%
}
%>

<%
if(list2.get(list3).getBeanbread()>=1)
{
%>
アンパン:<%=list2.get(list3).getBeanbread()%>個<br>
<%
}
%>



<%
if(list2.get(list3).getChocomuffin()>=1)
{
%>
チョコマフィン:<%=list2.get(list3).getChocomuffin()%>個
<%
}
%>
<%
if(list2.get(list3).getPlanemuffin()>=1)
{
%>
プレーンマフィン:<%=list2.get(list3).getPlanemuffin()%>個
<%
}
%>
<%
if(list2.get(list3).getHoneymuffin()>=1)
{
%>
蜂蜜マフィン:<%=list2.get(list3).getHoneymuffin()%>個
<%
}
%>

<%
int muffin=list2.get(list3).getChocomuffin()+list2.get(list3).getPlanemuffin()
+list2.get(list3).getHoneymuffin();

if(muffin>=1)
{
%>
<br>
<%
}
%>

<%
if(list2.get(list3).getPotatokoroke()>=1)
{
%>
じゃが芋コロッケ:<%=list2.get(list3).getPotatokoroke()%>個
<%
}
%>
<%
if(list2.get(list3).getCurrykoroke()>=1)
{
%>
カレーコロッケ:<%=list2.get(list3).getCurrykoroke()%>個
<%
}
%>
<%
if(list2.get(list3).getVegekoroke()>=1)
{
%>
野菜コロッケ:<%=list2.get(list3).getVegekoroke()%>個
<%
}
%>

<%
int koroke=list2.get(list3).getPotatokoroke()+list2.get(list3).getCurrykoroke()
+list2.get(list3).getVegekoroke();

if(koroke>=1)
{
%>
<br>
<%
}
%>

<%
if(list2.get(list3).getCroissant()>=1)
{
%>
基本のクロワッサン:<%=list2.get(list3).getCroissant()%>個
<%
}
%>
<%
if(list2.get(list3).getChococroissant()>=1)
{
%>
チョコクロワッサン:<%=list2.get(list3).getChococroissant()%>個
<%
}
%>
<%
if(list2.get(list3).getAlmondcroissant()>=1)
{
%>
アーモンドクロワッサン:<%=list2.get(list3).getAlmondcroissant()%>個
<%
}
%>

<%
int croissant=list2.get(list3).getCroissant()+list2.get(list3).getChococroissant()
+list2.get(list3).getAlmondcroissant();

if(croissant>=1)
{
%>
<br>
<%
}
%>

<%
if(list2.get(list3).getVegesandwich()>=1)
{
%>
野菜サンドイッチ:<%=list2.get(list3).getVegesandwich()%>個
<%
}
%>
<%
if(list2.get(list3).getChickensandwich()>=1)
{
%>
チキンサンドイッチ:<%=list2.get(list3).getChickensandwich()%>個
<%
}
%>
<%
if(list2.get(list3).getBeefsandwich()>=1)
{
%>
ビーフサンドイッチ:<%=list2.get(list3).getBeefsandwich()%>個
<%
}
%>
<%
if(list2.get(list3).getHamsandwich()>=1)
{
%>
ハムサンドイッチ:<%=list2.get(list3).getHamsandwich()%>個
<%
}
%>
<%
if(list2.get(list3).getEggsandwich()>=1)
{
%>
卵サンドイッチ:<%=list2.get(list3).getEggsandwich()%>個
<%
}
%>

<%
int sandwich=list2.get(list3).getVegesandwich()+list2.get(list3).getChickensandwich()
+list2.get(list3).getBeefsandwich()+list2.get(list3).getHamsandwich()
+list2.get(list3).getEggsandwich();

if(sandwich>=1)
{
%>
<br>
<%
}
%>

<%
if(list2.get(list3).getChoucream()>=1)
{
%>
シュークリームパン:<%=list2.get(list3).getChoucream()%>個<br>
<%
}
%>



<%
if(list2.get(list3).getCheesetart()>=1)
{
%>
チーズタルト:<%=list2.get(list3).getCheesetart()%>個
<%
}
%>
<%
if(list2.get(list3).getEggtart()>=1)
{
%>
エッグタルト:<%=list2.get(list3).getEggtart()%>個
<%
}
%>
<%
if(list2.get(list3).getWalnuttart()>=1)
{
%>
クルミタルト:<%=list2.get(list3).getWalnuttart()%>個
<%
}
%>

<%
int tart=list2.get(list3).getCheesetart()+list2.get(list3).getEggtart()
+list2.get(list3).getWalnuttart();

if(tart>=1)
{
%>
<br>
<%
}
%>

<%
if(list2.get(list3).getPlanemakaron()>=1)
{
%>
プレーンマカロン:<%=list2.get(list3).getPlanemakaron()%>個
<%
}
%>
<%
if(list2.get(list3).getChocomakaron()>=1)
{
%>
チョコマカロン:<%=list2.get(list3).getChocomakaron()%>個
<%
}
%>
<%
if(list2.get(list3).getBerrymakaron()>=1)
{
%>
苺マカロン:<%=list2.get(list3).getBerrymakaron()%>個
<%
}
%>
<%
if(list2.get(list3).getCheesemakaron()>=1)
{
%>
チーズ マカロン:<%=list2.get(list3).getCheesemakaron()%>個
<%
}
%>
<%
if(list2.get(list3).getGreenmakaron()>=1)
{
%>
抹茶マカロン:<%=list2.get(list3).getGreenmakaron()%>個
<%
}
%>

<%
int makaron=list2.get(list3).getPlanemakaron()+list2.get(list3).getChocomakaron()
+list2.get(list3).getBerrymakaron()+list2.get(list3).getCheesemakaron()
+list2.get(list3).getGreenmakaron();

if(makaron>=1)
{
%>
<br>
<%
}
%>

<%
if(list2.get(list3).getDacquoise()>=1)
{
%>
ダックワース:<%=list2.get(list3).getDacquoise()%>00g<br>
<%
}
%>


<%
if(list2.get(list3).getChocochip()>=1)
{
%>
チョコチップクッキー:<%=list2.get(list3).getChocochip()%>00g<br>
<%
}
%>


<%
if(list2.get(list3).getSabre()>=1)
{
%>
基本のサブレ:<%=list2.get(list3).getSabre()%>00g
<%
}
%>
<%
if(list2.get(list3).getChocosabre()>=1)
{
%>
チョコサブレ:<%=list2.get(list3).getChocosabre()%>00g
<%
}
%>

<%
int sabre=list2.get(list3).getSabre()+
list2.get(list3).getChocosabre();

if(sabre>=1)
{
%>
<br>
<%
}
%>

<%
if(list2.get(list3).getGingerbread()>=1)
{
%>
ジンジャーブレッド:<%=list2.get(list3).getGingerbread()%>個
<%
}
%>




</td>
</tr>
<tr >
<%

int total=list2.get(list3).getTotalprice()/10;

%>
<td>合計購買額</td>
<td conspan="2"><%= total%>円</td>
</tr>
<tr>
<td>希望事項</td>
<td conspan="2">

<%

if(list2.get(list3).getHope().length()<=4)
{
%>
なし。

<%
}
%>

<% 
if(list2.get(list3).getHope().length()>4)
{
%>

<%=list2.get(list3).getHope()%>
<%
}
%>

</td>
</tr>

</tbody>

<div class="form-group">



<% 
}
%>






</table>










<%
if(userid!=null){
%>

<%
}
%>
<a href="shoppinghistory.jsp" class="btn btn-primary">全体目録</a>
<%

int bbsidud= shopid;//수정, 삭제시킬 글 순서 지정
int bbsidup= shopid;//다음글 순서 지정

while(shopdao.nextbbs(shopid-1, userid)==false)
{
	shopid-=1;
}
while(shopdao.nextbbs(bbsidup+1, userid)==false)
{
	bbsidup+=1;
	
}

if(shopdao.nextbbs(shopid-1, userid)&&shopid>1)
{
	
%>
<a href="shopview.jsp?shopid=<%=shopid-1 %>&order=<%=order-1 %>" class="btn btn-primary">前の　購買目録</a>

<%
}
%>
<%
if(shopdao.nextbbs(bbsidup+1, userid)&&list.size()>order)
{
%>
<a href="shopview.jsp?shopid=<%=bbsidup+1 %>&order=<%=order+1 %>" class="btn btn-primary">次の　購買目録</a>
<%
}
%>

</div>

</div>




<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>