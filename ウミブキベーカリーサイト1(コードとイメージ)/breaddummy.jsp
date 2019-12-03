<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.io.PrintWriter" %>
    <%@page import="bbs.bbsdao" %>
    <%@page import="bbs.bbs" %>
    <%@page import="java.util.ArrayList" %>
    
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content ="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>게시판</title>
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
<a class="navbar-brand" href="main.jsp">우미부키 베이커리 사이트</a>
</div>

<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
<ul class="nav navbar-nav">
<li><a href="main.jsp">메인</a></li>
<li><a href="bbs.jsp">게시판</a></li>
<li><a href="bbs1.jsp">개인 전용 게시판(가칭)</a></li>
<li class="active"><a href="shopping.jsp">제품 구매</a></li>
<li><a href="shoppinghistory.jsp">구매 목록</a></li>
<li><a href="shoppingbbs.jsp">구매 후기</a></li>
<li><a href="minigame.jsp">미니 게임</a></li>

</ul>
<ul class="nav navbar-nav navbar-right">
<li class="dropdown">
<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
aria-haspopup="true" aria-expanded="false">접속하기<span class="caret"></span></a>
<ul class="dropdown-menu">
<li><a href="logoutaction.jsp">로그아웃</a><li>
<li><a href="cowview.jsp">흑우 정보 보기</a><li>
<li><a href="cowchange.jsp">흑우 정보수정</a><li>
<li><a href="cowdelete.jsp?userid=<%=userid%>">흑우 정보 삭제</a><li>
</ul>
</li>
</ul>
</div>

</nav>

<div class="container" align="center">

<div class="jumbotron" style="padding-top: 20px; width: 400px;">
<form method="post" action="plainbreadaction.jsp">
<h3 style="text-align:center;">원래 구매창 샘플</h3>
<div class="form-group">
<input type="text" class="form-control" placeholder="이름" name="customname">
</div>
<div class="form-group">
<input type="text" class="form-control" placeholder="주소" name="customaddress">
</div>


<div class="form-group">
전화번호:<br>
<select name = "tel1">
					<option value="010">010</option>
					<option value="011">011</option>
					<option value="016">016</option>
					<option value="019">019</option>
				</select>
				-<input type="text" class="form"  size = "5" maxlength="4" name = "tel2">
				-<input type="text" class="form"  size = "5" maxlength="4" name = "tel3">

</div>
<%
int d=0;//구매 제품의 총 가격을 나타내줌. 이걸로 표시 못 할 것 같으면 경고창에 총 가격이 나오도록 해도 될 듯.
%>
<div class="form-group">
샌드위치는 합계 5개까지만 주문이 가능합니다. 현재 총 가격:<%=d %>원<br>
야채 샌드위치:<input type="number" class="form"  min="0" max="5" name="vegesandwich"><br>
치킨 샌드위치:<input type="number" class="form"  min="0" max="5" name="chickensandwich"><br>
비프 샌드위치:<input type="number" class="form"  min="0" max="5" name="beefsandwich"><br>
햄 샌드위치:<input type="number" class="form"  min="0" max="5" name="hamsandwich"><br>
계란 샌드위치:<input type="number" class="form"  min="0" max="5" name="eggsandwich"><br>

</div>

<div class="form-group">
<input type="text" class="form-control" placeholder="희망사항" name="customhope">
</div>
<input id="a" onclick="return confirm('구매신청을 하실 경우 수정 및 취소가 불가하며 24시간 내로 입금해주셔야 합니다.\n 이대로 구매신청 하시겠습니까?')" 
type="submit" class="btn btn-promary form-control" value="구매">
<a id="a" href="shopping.jsp" class="btn btn-primary form-control" style="background-color: orange;">이전 구매창으로</a>
<a id="a" href="main.jsp" class="btn btn-primary form-control" style="background-color: black;">취소</a>

</form> 
</div>

<div class="col-lg-4"></div>
</div>

//제품 개수
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


<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>