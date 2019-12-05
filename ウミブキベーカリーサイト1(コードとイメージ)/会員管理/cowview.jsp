

<%@page import="user.user1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.PrintWriter" %>
     <%@page import="java.util.ArrayList" %>
          <%@page import="java.util.Vector" %>
          <%@page import="user.userdao"%>
          <%@page import="bbs.shopbbsdao"%>
          
<%@page import="bbs.bbsdao"%>
<%@page import="bbs.bbs"%>   
<%@page import="shop.shopdao"%>  
<%@page import="shop.shop"%>  

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content ="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>掲示板</title>
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
 background-image: url("로젤리아1.png");
 background-attachment: fixed;
 background-size:50%;
 color:cyan;
 


}


</style>
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


String name;

userdao dao = new userdao();

name = dao.checkLogin(userid, userpassword);//name= username(닉네임.)



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

<div class="container">
<div class="row">
<% 
userdao bbsdao = new userdao();
ArrayList<user1> list = bbsdao.getlist(userid);

bbsdao bbsdao1 = new bbsdao();
ArrayList<bbs> list1 = bbsdao1.onlylist(pagenumber, userid);

shopdao shopdao = new shopdao();
ArrayList<shop> list2 = shopdao.onlylist(pagenumber, userid);

shopbbsdao shopbbsdao = new shopbbsdao();
ArrayList<bbs> list3 = shopbbsdao.onlylist(pagenumber, userid);



for(int i=0; i < list.size(); i++)
	{%>


<table class="table table" style="text-align:center; border: 1px dotted cyan">


    <tr>
	<td>ID </td>
	<td><%= list.get(i).getUserid() %></td>
	</tr>
	
	<tr>
	<td>ニックネーム </td>
	<td><%= list.get(i).getUsername() %></td>
	</tr>
	
	<tr>
	<td>性別 </td>
	<td><%= list.get(i).getUsergender() %></td>
	</tr>
	
	<tr>
	<td>イーメール </td>
	<td><%= list.get(i).getUseremail() %></td>
	</tr>
	
	<tr>
	<td>掲示板文の作成数</td>
	<td><%= list1.size() %>個</td>
	</tr>
	
	<tr>
	<td>購買後記文の作成数 </td>
	<td><%= list3.size() %>個</td>
	</tr>
	
	<tr>
	<td>購買回数 </td>
	<td><%= list2.size() %>回</td>
	</tr>

	<%} %>	
	<%
	int normalplane = 0;
	int nutplain = 0;    
	int chocoplain = 0;
	int milkplain = 0;
	int cornplain = 0;
	
	int chococake = 0;
	int creamcake = 0;
	int berrycake = 0;
	int cheesecake = 0;
	int sweetpotatocake = 0;
	
	int creamplus = 0;
	int creamless = 0;
	
	int chococorone = 0;
	int pumpkincorone = 0;
	int berrycorone = 0;
	
	int beanbread = 0;
	
	int chocomuffin = 0;
	int planemuffin = 0;
	int honeymuffin = 0;
	
	int potatokoroke = 0;
	int currykoroke = 0;
	int vegekoroke = 0;
	
	int croissant = 0;
	int chococroissant = 0;
	int almondcroissant = 0;
	
	int vegesandwich = 0;
	int chickensandwich = 0;
	int beefsandwich = 0;
	int hamsandwich = 0;
	int eggsandwich = 0;
	
	int choucream = 0;
	int cheesetart = 0;
	int eggtart = 0;
	int walnuttart = 0;
	
	int planemakaron = 0;
	int chocomakaron = 0;
	int berrymakaron = 0;
	int cheesemakaron = 0;
	int greenmakaron = 0;
	
	
	
	int dacquoise = 0;
	int chocochip = 0;
	int sabre = 0;
	int chocosabre = 0;
	int gingerbread = 0;
	int totalprice = 0;
	
	
	
	
	for(int q=0; q<list2.size(); q++)
{
	
	normalplane += list2.get(q).getNormalplain();
	nutplain += list2.get(q).getNutplain();
	chocoplain += list2.get(q).getChocoplain();
	milkplain += list2.get(q).getMilkplain();
	cornplain += list2.get(q).getCornplain();
	
	chococake += list2.get(q).getChococake();
	creamcake += list2.get(q).getCreamcake();
	berrycake += list2.get(q).getBerrycake();
	cheesecake += list2.get(q).getCheesecake();
	sweetpotatocake += list2.get(q).getSweetpotatocake();
	
	creamplus += list2.get(q).getCreamplus();
	creamless += list2.get(q).getCreamless();
	
	chococorone += list2.get(q).getChococorone();
	pumpkincorone += list2.get(q).getPumpkincorone();
	berrycorone += list2.get(q).getBerrycorone();
	
	beanbread += list2.get(q).getBeanbread();
	
	chocomuffin += list2.get(q).getChocomuffin();
	planemuffin += list2.get(q).getPlanemuffin();
	honeymuffin += list2.get(q).getHoneymuffin();
	
	potatokoroke += list2.get(q).getPotatokoroke();
	currykoroke += list2.get(q).getCurrykoroke();
	vegekoroke += list2.get(q).getVegekoroke();
	
	croissant += list2.get(q).getCroissant();
	chococroissant += list2.get(q).getChococroissant();
	almondcroissant += list2.get(q).getAlmondcroissant();
	
	vegesandwich += list2.get(q).getVegesandwich();
	chickensandwich += list2.get(q).getChickensandwich();
	beefsandwich += list2.get(q).getBeefsandwich();
	hamsandwich += list2.get(q).getHamsandwich();
	eggsandwich += list2.get(q).getEggsandwich();

	choucream += list2.get(q).getChoucream();
	
	cheesetart += list2.get(q).getCheesetart();
	eggtart += list2.get(q).getEggtart();
	walnuttart += list2.get(q).getWalnuttart();
	
	planemakaron += list2.get(q).getPlanemakaron();
	chocomakaron += list2.get(q).getChocomakaron();
	berrymakaron += list2.get(q).getBerrymakaron();
	cheesemakaron += list2.get(q).getCheesemakaron();
	greenmakaron += list2.get(q).getGreenmakaron();
	
	dacquoise += list2.get(q).getDacquoise();
	chocochip += list2.get(q).getChocochip();
	sabre += list2.get(q).getSabre();
	chocosabre += list2.get(q).getChocosabre();
	gingerbread += list2.get(q).getGingerbread();
	
	totalprice += list2.get(q).getTotalprice();
 %>	
	
<%} %>	
    <tr>
    <td>食パン 購買量 </td>
	<td>基本の 食パン: <%= normalplane %>個 栗食パン:<%= nutplain %>個 チョコ食パン:<%= chocoplain %>個 ミルク食パン:<%= milkplain %>個 コーン食パン:<%= cornplain %>個</td>
	</tr>
	
	<tr>
    <td>ケーキ 購買量 </td>
	<td>チョコケーキ: <%= chococake %>個 生クリームケーキ:<%= creamcake %>個 苺ケーキ:<%= berrycake %>個 チーズケーキ:<%= cheesecake %>個 さつま芋ケーキ:<%= sweetpotatocake %>個</td>
	</tr>
	
	<tr>
    <td>メロンパン 購買量 </td>
	<td>クリームあり: <%= creamplus %>個 クリームなし:<%= creamless %>個 </td>
	</tr>
	
	<tr>
    <td>コロネ 購買量 </td>
	<td>チョココロネ:<%= chococorone %>個 カボチャコロネ:<%= pumpkincorone %>個 苺コロネ:<%= berrycorone %>個</td>
	</tr>
	
	<tr>
    <td>コロッケ 購買量  </td>
	<td>じゃが芋コロッケ:<%= potatokoroke %>個 カレーコロッケ:<%= currykoroke %>個 野菜コロッケ:<%= vegekoroke %>個</td>
	</tr>
	<tr>
    <td>クロワッサン 購買量 </td>
	<td>基本のクロワッサン: <%= croissant %>個 チョコクロワッサン:<%= chococroissant %>個 アーモンドクロワッサン:<%= almondcroissant %>個 </td>
	</tr>
	
	<tr>
    <td>サンドイッチ  購買量 </td>
	<td>野菜サンドイッチ: <%= vegesandwich %>個 チキンサンドイッチ:<%= chickensandwich %>個 ビーフサンドイッチ:<%= beefsandwich %>個 ハムサンドイッチ:<%= hamsandwich %>個 卵サンドイッチ:<%= eggsandwich %>個</td>
	</tr>
	<tr>
    <td>シュークリームパン 購買量 </td>
	<td>シュークリームパン:<%= choucream %>個</td>
	</tr>
	<tr>
    <td>タルト 購買量 </td>
	<td>チーズタルト:<%= cheesetart %>個 エッグタルト:<%= eggtart %>個 クルミタルト:<%= walnuttart %>個</td>
	</tr>
	<tr>
    <td>マカロン 購買量  </td>
	<td>プレーンマカロン: <%= planemakaron %>個 チョコマカロン:<%= chocomakaron %>個 苺マカロン:<%= berrymakaron %>個 チーズマカロン:<%= cheesemakaron %>個 抹茶マカロン:<%= greenmakaron %>個</td>
	</tr>
	<tr>
    <td>ダックワース 購買量 </td>
	<td>ダックワース: <%= dacquoise %>個</td>
	</tr>
	<tr>
    <td>チョコチップクッキー 購買量 </td>
	<td>チョコチップクッキー: <%= chocochip %>個</td>
	</tr>
    <td>サブレ 購買量 </td>
	<td>基本のサブレ: <%= sabre %>個 チョコサブレ:<%= chocosabre %>個</td>
	</tr>
	<tr>
    <td>ジンジャーブレッド 購買量 </td>
	<td>ジンジャーブレッド: <%= gingerbread %>個</td>
	</tr>
	<tr>
    <td>合計購買額 </td>
	<td><%= totalprice %>円</td>
	</tr>
	
</table>	
	
	</div>
</div>










<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>