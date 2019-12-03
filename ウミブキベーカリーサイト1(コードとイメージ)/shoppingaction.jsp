<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="user.userdao" %>

<%@page import="shop.shopdao" %>


<%@page import="java.io.PrintWriter" %>
<%@page import="java.lang.NullPointerException" %>
<%@page import="java.util.ArrayList" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="shop1" class="shop.shop" scope="page" />
<jsp:setProperty name="shop1" property="customname"/>
<jsp:setProperty name="shop1" property="customaddress1"/>
<jsp:setProperty name="shop1" property="customaddress2"/>
<jsp:setProperty name="shop1" property="tel1"/>
<jsp:setProperty name="shop1" property="tel2"/>
<jsp:setProperty name="shop1" property="tel3"/>
<jsp:setProperty name="shop1" property="hope"/>

<jsp:setProperty name="shop1" property="normalplain"/>
<jsp:setProperty name="shop1" property="nutplain"/>
<jsp:setProperty name="shop1" property="chocoplain"/>
<jsp:setProperty name="shop1" property="milkplain"/>
<jsp:setProperty name="shop1" property="cornplain"/>

<jsp:setProperty name="shop1" property="chococake"/>
<jsp:setProperty name="shop1" property="creamcake"/>
<jsp:setProperty name="shop1" property="berrycake"/>
<jsp:setProperty name="shop1" property="cheesecake"/>
<jsp:setProperty name="shop1" property="sweetpotatocake"/>

<jsp:setProperty name="shop1" property="creamplus"/>
<jsp:setProperty name="shop1" property="creamless"/>

<jsp:setProperty name="shop1" property="chococorone"/>
<jsp:setProperty name="shop1" property="pumpkincorone"/>
<jsp:setProperty name="shop1" property="berrycorone"/>

<jsp:setProperty name="shop1" property="beanbread"/>

<jsp:setProperty name="shop1" property="chocomuffin"/>
<jsp:setProperty name="shop1" property="planemuffin"/>
<jsp:setProperty name="shop1" property="honeymuffin"/>

<jsp:setProperty name="shop1" property="potatokoroke"/>
<jsp:setProperty name="shop1" property="currykoroke"/>
<jsp:setProperty name="shop1" property="vegekoroke"/>

<jsp:setProperty name="shop1" property="croissant"/>
<jsp:setProperty name="shop1" property="chococroissant"/>
<jsp:setProperty name="shop1" property="almondcroissant"/>

<jsp:setProperty name="shop1" property="vegesandwich"/>
<jsp:setProperty name="shop1" property="chickensandwich"/>
<jsp:setProperty name="shop1" property="beefsandwich"/>
<jsp:setProperty name="shop1" property="hamsandwich"/>
<jsp:setProperty name="shop1" property="eggsandwich"/>

<jsp:setProperty name="shop1" property="choucream"/>

<jsp:setProperty name="shop1" property="cheesetart"/>
<jsp:setProperty name="shop1" property="eggtart"/>
<jsp:setProperty name="shop1" property="walnuttart"/>

<jsp:setProperty name="shop1" property="planemakaron"/>
<jsp:setProperty name="shop1" property="chocomakaron"/>
<jsp:setProperty name="shop1" property="berrymakaron"/>
<jsp:setProperty name="shop1" property="cheesemakaron"/>
<jsp:setProperty name="shop1" property="greenmakaron"/>

<jsp:setProperty name="shop1" property="dacquoise"/>
<jsp:setProperty name="shop1" property="chocochip"/>
<jsp:setProperty name="shop1" property="sabre"/>
<jsp:setProperty name="shop1" property="chocosabre"/>
<jsp:setProperty name="shop1" property="gingerbread"/>

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

String username=null;
if(session.getAttribute("username")!=null)
{
	username=(String) session.getAttribute("username");
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

String normalplain=null;
if(request.getParameter("normalplain") != null)
{
	normalplain = (String) session.getAttribute("normalplain");
}
String nutplain=null;
if(request.getParameter("nutplain") != null)
{
	nutplain = (String) session.getAttribute("nutplain");
}
String chocoplain=null;
if(request.getParameter("chocoplain") != null)
{
	chocoplain = (String) session.getAttribute("chocoplain");
}
String milkplain=null;
if(request.getParameter("milkplain") != null)
{
	milkplain = (String) session.getAttribute("milkplain");
}
String cornplain=null;
if(request.getParameter("cornplain") != null)
{
	cornplain = (String) session.getAttribute("cornplain");
}



String chococake=null;
if(request.getParameter("chococake") != null)
{
	chococake = (String) session.getAttribute("chococake");
}
String creamcake=null;
if(request.getParameter("creamcake") != null)
{
	creamcake = (String) session.getAttribute("creamcake");
}
String berrycake=null;
if(request.getParameter("berrycake") != null)
{
	berrycake = (String) session.getAttribute("berrycake");
}
String cheesecake=null;
if(request.getParameter("cheesecake") != null)
{
	cheesecake = (String) session.getAttribute("cheesecake");
}
String sweetpotatocake=null;
if(request.getParameter("sweetpotatocake") != null)
{
	sweetpotatocake = (String) session.getAttribute("sweetpotatocake");
}


String creamplus=null;
if(request.getParameter("creamplus") != null)
{
	creamplus = (String) session.getAttribute("creamplus");
}
String creamless=null;
if(request.getParameter("creamless") != null)
{
	creamless = (String) session.getAttribute("creamless");
}


String chococorone=null;
if(request.getParameter("chococorone") != null)
{
	chococorone = (String) session.getAttribute("chococorone");
}
String pumpkincorone=null;
if(request.getParameter("pumpkincorone") != null)
{
	pumpkincorone = (String) session.getAttribute("pumpkincorone");
}
String berrycorone=null;
if(request.getParameter("berrycorone") != null)
{
	berrycorone = (String) session.getAttribute("berrycorone");
}



String beanbread=null;
if(request.getParameter("beanbread") != null)
{
	beanbread = (String) session.getAttribute("beanbread");
}


String chocomuffin=null;
if(request.getParameter("chocomuffin") != null)
{
	chocomuffin = (String) session.getAttribute("chocomuffin");
}
String planemuffin=null;
if(request.getParameter("planemuffin") != null)
{
	planemuffin = (String) session.getAttribute("planemuffin");
}
String honeymuffin=null;
if(request.getParameter("honeymuffin") != null)
{
	honeymuffin = (String) session.getAttribute("honeymuffin");
}



String potatokoroke=null;
if(request.getParameter("potatokoroke") != null)
{
	potatokoroke =(String) session.getAttribute("potatokoroke");
}
String currykoroke=null;
if(request.getParameter("currykoroke") != null)
{
	currykoroke = (String) session.getAttribute("currykoroke");
}
String vegekoroke=null;
if(request.getParameter("vegekoroke") != null)
{
	vegekoroke = (String) session.getAttribute("vegekoroke");
}


String croissant=null;
if(request.getParameter("croissant") != null)
{
	croissant = (String) session.getAttribute("croissant");
}
String chococroissant=null;
if(request.getParameter("chococroissant") != null)
{
	chococroissant =(String) session.getAttribute("chococroissant");
}
String almondcroissant=null;
if(request.getParameter("almondcroissant") != null)
{
	almondcroissant = (String) session.getAttribute("almondcroissant");
}



String vegesandwich=null;
if(request.getParameter("vegesandwich") != null)
{
	vegesandwich = (String) session.getAttribute("vegesandwich");
}
String chickensandwich=null;
if(request.getParameter("chickensandwich") != null)
{
	chickensandwich = (String) session.getAttribute("chickensandwich");
}
String beefsandwich=null;
if(request.getParameter("beefsandwich") != null)
{
	beefsandwich = (String) session.getAttribute("beefsandwich");
}
String hamsandwich=null;
if(request.getParameter("hamsandwich") != null)
{
	hamsandwich = (String) session.getAttribute("hamsandwich");
}
String eggsandwich=null;
if(request.getParameter("eggsandwich") != null)
{
	normalplain = (String) session.getAttribute("eggsandwich");
}



String choucream=null;
if(request.getParameter("choucream") != null)
{
	choucream = (String) session.getAttribute("choucream");
}



String cheesetart=null;
if(request.getParameter("cheesetart") != null)
{
	cheesetart = (String) session.getAttribute("cheesetart");
}
String eggtart=null;
if(request.getParameter("eggtart") != null)
{
	eggtart = (String) session.getAttribute("eggtart");
}
String walnuttart=null;
if(request.getParameter("walnuttart") != null)
{
	walnuttart = (String) session.getAttribute("walnuttart");
}


String planemakaron=null;
if(request.getParameter("planemakaron") != null)
{
	planemakaron = (String) session.getAttribute("planemakaron");
}
String chocomakaron=null;
if(request.getParameter("chocomakaron") != null)
{
	chocomakaron = (String) session.getAttribute("chocomakaron");
}
String berrymakaron=null;
if(request.getParameter("berrymakaron") != null)
{
	berrymakaron = (String) session.getAttribute("berrymakaron");
}
String cheesemakaron=null;
if(request.getParameter("cheesemakaron") != null)
{
	cheesemakaron = (String) session.getAttribute("cheesemakaron");
}
String greenmakaron=null;
if(request.getParameter("greenmakaron") != null)
{
	greenmakaron = (String) session.getAttribute("greenmakaron");
}


String dacquoise=null;
if(request.getParameter("dacquoise") != null)
{
	dacquoise = (String) session.getAttribute("dacquoise");
}


String chocochip=null;
if(request.getParameter("chocochip") != null)
{
	chocochip = (String) session.getAttribute("chocochip");
}


String sabre=null;
if(request.getParameter("sabre") != null)
{
	sabre = (String) session.getAttribute("sabre");
}
String chocosabre=null;
if(request.getParameter("chocosabre") != null)
{
	chocosabre = (String) session.getAttribute("chocosabre");
}
String gingerbread=null;
if(request.getParameter("gingerbread") != null)
{
	gingerbread = (String) session.getAttribute("gingerbread");
}

if(

userid==null
)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('ログインしてください。')");
	script.println("history.back()");

	script.println("</script>");
}

if(

shop1.getCustomname()==null||
shop1.getCustomaddress1()==null||
shop1.getCustomaddress2()==null||
shop1.getTel2()==null||
shop1.getTel3()==null
)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('名前、アドレス、電話番号の入力が　必要です。')");
	script.println("history.back()");

	script.println("</script>");
}

String a = shop1.getHope();
if(a!=null)
{
if(a.length()>=1 && a.length()<=4 )
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('希望事項を　書く場合は　5文字以上　書いてください。')");
	script.println("history.back()");

	script.println("</script>");
}

}


int plain=shop1.getNormalplain()+shop1.getNutplain()+shop1.getChocoplain()+shop1.getMilkplain()+shop1.getCornplain();
int cake=shop1.getChococake()+shop1.getCreamcake()+shop1.getBerrycake()+shop1.getCheesecake()+shop1.getSweetpotatocake();
int melonbread=shop1.getCreamplus()+shop1.getCreamless();
int corone=shop1.getChococorone()+shop1.getPumpkincorone()+shop1.getBerrycorone();
int bean = shop1.getBeanbread();
int muffin =shop1.getChocomuffin()+shop1.getPlanemuffin()+shop1.getHoneymuffin();
int koroke = shop1.getPotatokoroke()+shop1.getCurrykoroke()+shop1.getVegekoroke();
int prancebread = shop1.getCroissant()+shop1.getChococroissant()+shop1.getAlmondcroissant();
int sandwich = shop1.getVegesandwich()+shop1.getChickensandwich()+shop1.getBeefsandwich()+shop1.getHamsandwich()+shop1.getEggsandwich();
int chou = shop1.getChoucream();

int tart = shop1.getCheesetart()+ shop1.getEggtart()+ shop1.getWalnuttart();
int makaron=shop1.getPlanemakaron()+ shop1.getChocomakaron()+shop1.getBerrymakaron()+ shop1.getCheesemakaron()+shop1.getGreenmakaron();
int dacquoise1 =  shop1.getDacquoise();
int chocochip1 = shop1.getChocochip();
int sabre1 = shop1.getSabre()+shop1.getChocosabre();
int gingerbread1 = shop1.getGingerbread();


int total = plain+ cake+ melonbread+ corone+
bean+ muffin+ koroke+ prancebread+
 sandwich+ chou+ tart+ makaron+
  dacquoise1+ chocochip1+ sabre1+ gingerbread1
;


int plainprice = plain*2800;
int cakeprice = cake*18000;
int melonbreadprice = melonbread*1500;
int coroneprice = corone*1200;
int beanprice = bean*1200;
int muffinprice = muffin*1500;
int korokeprice = koroke*1600;
int prancebreadprice = prancebread*1400;
int sandwichprice = sandwich*5500;
int chouprice = chou*1200;

int tartprice = tart*1500;
int makaronprice = makaron*1500;
int dacquoise1price = dacquoise1*1600;
int chocochip1price = chocochip1*1800;
int sabre1price = sabre1*1800;
int gingerbread1price = gingerbread1*1000;



int totalprice= (plainprice+cakeprice+melonbreadprice+coroneprice+
beanprice+muffinprice+korokeprice+prancebreadprice+
sandwichprice+chouprice+tartprice+makaronprice+
dacquoise1price+chocochip1price+sabre1price+gingerbread1price)/10;

if(total<1)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('何か 注文してください。')");
	script.println("history.back()");

	script.println("</script>");
}

if(plain>10||cake>3||melonbread>15||corone>15||
		bean>15||muffin>10||koroke>10||prancebread>12||
		sandwich>5||chou>15||tart>25||makaron>25||
		dacquoise1>20||chocochip1>20||sabre1>20||gingerbread1>30)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('注文制限を 超えた製品が あります。')");
	script.println("history.back()");

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


<div class="container" align="center">

<div class="jumbotron" style="padding-top: 20px; width:820px;">
<form method="post" action="shoppingaction2.jsp?customname=<%=shop1.getCustomname() %>
&customaddress1=<%=shop1.getCustomaddress1() %>&customaddress2=<%=shop1.getCustomaddress2() %>
&tel1=<%=shop1.getTel1() %>&tel2=<%=shop1.getTel2() %>
&tel3=<%=shop1.getTel3() %>&hope=<%=shop1.getHope() %>

&normalplain=<%=shop1.getNormalplain() %>&nutplain=<%=shop1.getNutplain() %>&chocoplain=<%=shop1.getChocoplain() %>
&milkplain=<%=shop1.getMilkplain() %>&cornplain=<%=shop1.getCornplain() %>

&chococake=<%=shop1.getChococake() %>&creamcake=<%=shop1.getCreamcake() %>&berrycake=<%=shop1.getBerrycake() %>
&cheesecake=<%=shop1.getCheesecake() %>&sweetpotatocake=<%=shop1.getSweetpotatocake() %>

&creamplus=<%=shop1.getCreamplus() %>&creamless=<%=shop1.getCreamless() %>

&chococorone=<%=shop1.getChococorone() %>&pumpkincorone=<%=shop1.getPumpkincorone() %>&berrycorone=<%=shop1.getBerrycorone() %>

&beanbread=<%=shop1.getBeanbread() %>

&chocomuffin=<%=shop1.getChocomuffin() %>&planemuffin=<%=shop1.getPlanemuffin() %>&honeymuffin=<%=shop1.getHoneymuffin() %>

&potatokoroke=<%=shop1.getPotatokoroke() %>&currykoroke=<%=shop1.getCurrykoroke() %>&vegekoroke=<%=shop1.getVegekoroke() %>

&croissant=<%=shop1.getCroissant() %>&chococroissant=<%=shop1.getChococroissant() %>&almondcroissant=<%=shop1.getAlmondcroissant() %>

&vegesandwich=<%=shop1.getVegesandwich() %>&chickensandwich=<%=shop1.getChickensandwich() %>&beefsandwich=<%=shop1.getBeefsandwich() %>
&hamsandwich=<%=shop1.getHamsandwich() %>&eggsandwich=<%=shop1.getEggsandwich() %>

&choucream=<%=shop1.getChoucream() %>

&cheesetart=<%=shop1.getCheesetart() %>&eggtart=<%=shop1.getEggtart() %>&walnuttart=<%=shop1.getWalnuttart() %>

&planemakaron=<%=shop1.getPlanemakaron() %>&chocomakaron=<%=shop1.getChocomakaron() %>&berrymakaron=<%=shop1.getBerrymakaron() %>
&cheesemakaron=<%=shop1.getCheesemakaron() %>&greenmakaron=<%=shop1.getGreenmakaron() %>

&dacquoise=<%=shop1.getDacquoise() %>

&chocochip=<%=shop1.getChocochip() %>

&sabre=<%=shop1.getSabre() %>&chocosabre=<%=shop1.getChocosabre() %>

&gingerbread=<%=shop1.getGingerbread() %>
&totalprice=<%=totalprice %>
">

<div class="form-group" align="left">

名前:<%=shop1.getCustomname()%>님<br>

アドレス:<%=shop1.getCustomaddress1()%> <%=shop1.getCustomaddress2()%><br>

電話番号:<%=shop1.getTel1()%>-<%=shop1.getTel2()%>-<%=shop1.getTel3()%><br>

<%
if(plain>=1)
{
%>
食パンの購買数:
<%
}
%>

<%
if(shop1.getNormalplain()>=1)
{
%>
基本の食パン:<%=shop1.getNormalplain()%>個
<%
}
%>
<%
if(shop1.getNutplain()>=1)
{
%>
栗食パン:<%=shop1.getNutplain()%>個
<%
}
%>
<%
if(shop1.getChocoplain()>=1)
{
%>
チョコ食パン:<%=shop1.getChocoplain()%>個
<%
}
%>
<%
if(shop1.getMilkplain()>=1)
{
%>
ミルク食パン:<%=shop1.getMilkplain()%>個
<%
}
%>
<%
if(shop1.getCornplain()>=1)
{
%>
コーン食パン:<%=shop1.getCornplain()%>個
<%
}
%>

<%
if(plain>=1)
{
%>
<br>
<%
}
%>



<%
if(cake>=1)
{
%>
ケーキの購買数:
<%
}
%>
<%
if(shop1.getChococake()>=1)
{
%>
チョコケーキ:<%=shop1.getChococake()%>個
<%
}
%>
<%
if(shop1.getCreamcake()>=1)
{
%>
生クリームケーキ:<%=shop1.getCreamcake()%>個
<%
}
%>
<%
if(shop1.getBerrycake()>=1)
{
%>
苺ケーキ:<%=shop1.getBerrycake()%>個
<%
}
%>
<%
if(shop1.getCheesecake()>=1)
{
%>
チーズケーキ:<%=shop1.getCheesecake()%>個
<%
}
%>
<%
if(shop1.getSweetpotatocake()>=1)
{
%>
さつま芋ケーキ:<%=shop1.getSweetpotatocake()%>個
<%
}
%>

<%
if(cake>=1)
{
%>
<br>
<%
}
%>


<%
if(melonbread>=1)
{
%>
メロンパンの購買数:
<%
}
%>
<%
if(shop1.getCreamplus()>=1)
{
%>
クリームあり:<%=shop1.getCreamplus()%>個
<%
}
%>
<%
if(shop1.getCreamless()>=1)
{
%>
クリームなし:<%=shop1.getCreamless()%>個
<%
}
%>
<%
if(melonbread>=1)
{
%>
<br>
<%
}
%>



<%
if(corone>=1)
{
%>
コロネの購買数:
<%
}
%>

<%
if(shop1.getChococorone()>=1)
{
%>
チョココロネ:<%=shop1.getChococorone()%>個
<%
}
%>
<%
if(shop1.getPumpkincorone()>=1)
{
%>
カボチャコロネ:<%=shop1.getPumpkincorone()%>個
<%
}
%>
<%
if(shop1.getBerrycorone()>=1)
{
%>
苺コロネ:<%=shop1.getBerrycorone()%>個
<%
}
%>
<%
if(corone>=1)
{
%>
<br>
<%
}
%>




<%
if(bean>=1)
{
%>
アンパンの購買数:
<%
}
%>

<%
if(shop1.getBeanbread()>=1)
{
%>
<%=shop1.getBeanbread()%>個
<%
}
%>
<%
if(bean>=1)
{
%>
<br>
<%
}
%>



<%
if(muffin>=1)
{
%>
マフィンの購買数:
<%
}
%>

<%
if(shop1.getChocomuffin()>=1)
{
%>
チョコマフィン:<%=shop1.getChocomuffin()%>個
<%
}
%>
<%
if(shop1.getPlanemuffin()>=1)
{
%>
プレーンマフィン:<%=shop1.getPlanemuffin()%>個
<%
}
%>
<%
if(shop1.getHoneymuffin()>=1)
{
%>
蜂蜜マフィン:<%=shop1.getHoneymuffin()%>個
<%
}
%>
<% 
if(muffin>=1)
{
%>
<br>
<%
}
%>



<%
if(koroke>=1)
{
%>
コロッケの購買数:
<%
}
%>

<%
if(shop1.getPotatokoroke()>=1)
{
%>
じゃが芋コロッケ:<%=shop1.getPotatokoroke()%>個
<%
}
%>
<%
if(shop1.getCurrykoroke()>=1)
{
%>
カレーコロッケ:<%=shop1.getCurrykoroke()%>個
<%
}
%>
<%
if(shop1.getVegekoroke()>=1)
{
%>
野菜コロッケ:<%=shop1.getVegekoroke()%>個
<%
}
%>

<% 
if(koroke>=1)
{
%>
<br>
<%
}
%>

<%
if(prancebread>=1)
{
%>
クロワッサンの購買数:
<%
}
%>


<%
if(shop1.getCroissant()>=1)
{
%>
基本のクロワッサン:<%=shop1.getCroissant()%>個
<%
}
%>
<%
if(shop1.getChococroissant()>=1)
{
%>
チョコクロワッサン:<%=shop1.getChococroissant()%>個
<%
}
%>
<%
if(shop1.getAlmondcroissant()>=1)
{
%>
アーモンドクロワッサン:<%=shop1.getAlmondcroissant()%>個
<%
}
%>

<% 
if(prancebread>=1)
{
%>
<br>
<%
}
%>




<%
if(sandwich>=1)
{
%>
サンドイッチの購買数:
<%
}
%>
<%
if(shop1.getVegesandwich()>=1)
{
%>
野菜サンドイッチ:<%=shop1.getVegesandwich()%>個
<%
}
%>
<%
if(shop1.getChickensandwich()>=1)
{
%>
チキンサンドイッチ:<%=shop1.getChickensandwich()%>個
<%
}
%>
<%
if(shop1.getBeefsandwich()>=1)
{
%>
ビーフサンドイッチ:<%=shop1.getBeefsandwich()%>個
<%
}
%>
<%
if(shop1.getHamsandwich()>=1)
{
%>
ハムサンドイッチ:<%=shop1.getHamsandwich()%>個
<%
}
%>
<%
if(shop1.getEggsandwich()>=1)
{
%>
卵サンドイッチ:<%=shop1.getEggsandwich()%>個
<%
}
%>

<% 
if(sandwich>=1)
{
%>
<br>
<%
}
%>

<%
if(chou>=1)
{
%>
シュークリームパンの購買数:
<%
}
%>
<%
if(shop1.getChoucream()>=1)
{
%>
<%=shop1.getChoucream()%>個
<%
}
%>

<% 
if(chou>=1)
{
%>
<br>
<%
}
%>


<%
if(tart>=1)
{
%>
タルトの購買数:
<%
}
%>

<%
if(shop1.getCheesetart()>=1)
{
%>
チーズタルト:<%=shop1.getCheesetart()%>個
<%
}
%>
<%
if(shop1.getEggtart()>=1)
{
%>
エッグタルト:<%=shop1.getEggtart()%>個
<%
}
%>
<%
if(shop1.getWalnuttart()>=1)
{
%>
クルミタルト:<%=shop1.getWalnuttart()%>個
<%
}
%>

<% 
if(tart>=1)
{
%>
<br>
<%
}
%>



<%
if(makaron>=1)
{
%>
マカロンの購買数:
<%
}
%>

<%
if(shop1.getPlanemakaron()>=1)
{
%>
プレーンマカロン:<%=shop1.getPlanemakaron()%>個
<%
}
%>
<%
if(shop1.getChocomakaron()>=1)
{
%>
チョコマカロン:<%=shop1.getChocomakaron()%>個
<%
}
%>
<%
if(shop1.getBerrymakaron()>=1)
{
%>
苺マカロン:<%=shop1.getBerrymakaron()%>個
<%
}
%>
<%
if(shop1.getCheesemakaron()>=1)
{
%>
チーズ マカロン:<%=shop1.getCheesemakaron()%>個
<%
}
%>
<%
if(shop1.getGreenmakaron()>=1)
{
%>
抹茶マカロン:<%=shop1.getGreenmakaron()%>個
<%
}
%>

<% 
if(makaron>=1)
{
%>
<br>
<%
}
%>


<%
if(dacquoise1>=1)
{
%>
ダックワースの購買数:
<%
}
%>

<%
if(shop1.getDacquoise()>=1)
{
%>
<%=shop1.getDacquoise()%>00g
<%
}
%>

<% 
if(dacquoise1>=1)
{
%>
<br>
<%
}
%>

<%
if(chocochip1>=1)
{
%>
チョコチップクッキーの購買数:
<%
}
%>

<%
if(shop1.getChocochip()>=1)
{
%>
<%=shop1.getChocochip()%>00g

<%
}
%>

<% 
if(chocochip1>=1)
{
%>
<br>
<%
}
%>

<%
if(sabre1>=1)
{
%>
サブレの購買数:
<%
}
%>

<%
if(shop1.getSabre()>=1)
{
%>
基本のサブレ:<%=shop1.getSabre()%>00g
<%
}
%>
<%
if(shop1.getChocosabre()>=1)
{
%>
チョコサブレ:<%=shop1.getChocosabre()%>00g<br>
<%
}
%>

<% 
if(sabre1>=1)
{
%>
<br>
<%
}
%>

<%
if(gingerbread1>=1)
{
%>
ジンジャーブレッドの購買数
<%
}
%>

<%
if(shop1.getGingerbread()>=1)
{
%>
<%=shop1.getGingerbread()%>個
<%
}
%>
<br>
<%
if(shop1.getHope()!=null)
{
%>
希望事項:<%=shop1.getHope()%><br>
<%
}
%>
<%
if(shop1.getHope()==null)
{
%>
希望事項:なし。<br>
<%
}
%>
 合計:<%= totalprice%>円
 <% 
 if(totalprice>7000)
{
	%>
	<br>購買額制限を 超えました。 後戻りして 選び直してください。
	<% 
}
 %>
</div>
 <% 
 if(totalprice<=7000)
{
	%>
<input onclick="return confirm('購買申請すると 変更及びキャンセルは出来ません。 本当に 購買しますか？')" id="a"  type="submit" class="btn btn-promary form-control" value="購買">
	<% 
}
 %>
<a id="a" href="shopping.jsp" class="btn btn-primary form-control" style="background-color: orange;">以前の 購買画面へ</a>

</form> 
</div>

<div class="col-lg-4"></div>
</div>
<%


shopdao userdao1 = new shopdao();












%>
</body>
</html>