<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.io.PrintWriter" %>
    <%@page import="bbs.bbs" %>
    <%@page import="bbs.bbsdao" %>
    <%@page import="bbs1.bbs1" %>
    <%@page import="bbs1.bbs1dao" %>
    <%@page import="user.userdao"%>
    <%@page import="shop.shop"%>
    <%@page import="shop.shopdao"%>
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.Vector" %>
    
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

int shopid=999999999;

if(request.getParameter("shopid") != null)
{
	shopid = Integer.parseInt(request.getParameter("shopid"));
}

if(shopid==0)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('そんな文は　ありません。')");
	script.println("location.href = 'main.jsp'");
	script.println("</script>");
}
int order=999999999;

if(request.getParameter("order") != null)
{
	order = Integer.parseInt(request.getParameter("order"));
}
//String order=null;
//if(session.getAttribute("order")!=null)
//{
//	order=(String)session.getAttribute("order");
//}


//bbs bbs = new bbsdao().getbbs(bbsid);



int pagenumber = 1;//기본 페이지 의미
 
if(request.getParameter("pagenumber") != null)
{
	pagenumber = Integer.parseInt(request.getParameter("pagenumber"));
}

int listnumber = 1;//기본 페이지 의미

if(request.getParameter("listnumber") != null)
{
	listnumber = Integer.parseInt(request.getParameter("listnumber"));
}
if(userid==null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('会員登録後 購買すると 見られます。')");
	script.println("location.href = 'join.jsp'");
	script.println("</script>");
}




shopdao shopdao = new shopdao();
ArrayList<shop> list = shopdao.onlylist(pagenumber, userid);

ArrayList<shop> list2 = shopdao.getlist(pagenumber);

if(list.size()==0)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('購買すると 見られます。')");
	script.println("location.href = 'shopping.jsp'");
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
<li><a href="shopping.jsp">製品購買</a></li>
<li class="active"><a href="shoppinghistory.jsp">購買目録</a></li>
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
<table class="table table" style="text-align:center; border: 1px dotted black;">


<thead>
<tr>
<th style="background-color: red; text-align: center;">番号</th>
<th style="background-color: violet; text-align: center;">購買記録</th>
<th style="background-color: green; text-align: center;">購買者</th>
<th style="background-color: gray; text-align: center;">購買日</th>

</tr>
</thead>
<tbody>

<%
//shopdao shopdao = new shopdao();
//ArrayList<shop> list = shopdao.onlylist(pagenumber, userid);

//ArrayList<shop> list2 = shopdao.getlist(pagenumber);

//for(int i=0; i < list.size(); i++)
	
	int a = 10*pagenumber;

int b = list.size();

int c = a-b;

int e = 10-list.size()%10;//게시글 개수 조절을 위한 값

if(a>=b)
{
	//a-=10;
}

int f=a;
if(e>=a)
{
	e=f;
	
}

int g = list.size()-a;//글이 나오는 최소 번호 조절
if(g<0)
{
	g=0;
}

int h = list.size()-1-a+10;
if(h<10)
{
	//h=10-h;
}


for(int i=h; i >= g; i--)	
{
	
%>

<%
if(userid != null && userpassword !=null && userid.equals(list.get(i).getUserid() )){
%>
<tr>
<td><%=i+1%></td>
<td><a href="shopview.jsp?shopid=<%= list.get(i).getShopid() %>&order=<%=i+1%>"><%= list.get(i).getUserid() %>さんの <%=i+1%>番目 購買</a></td>
<td><%= list.get(i).getUserid() %></td>
<td><%= list.get(i).getShoppingdate() %></td>



</tr>

<% 
}
%>
<% 
}
%>


</tbody>
</table>

<%
//int d=-c-1+(a-10);
//if(d<=10)
{
	//d=10-e;
}

%>
<%
if(pagenumber>1)
{
%>
<a href="shoppinghistory.jsp?pagenumber=<%= pagenumber - 1 %>"class="btn btn-success btn-arrow-left" style="background-color:#909020;">後 <%=10 %>個</a>
<%
}
%>
<%
if(g<=10)
{
	g+=1;
}
else
{
	g=11;
}

%>
<%
if(g-1!=0)
{
%>
<a href="shoppinghistory.jsp?pagenumber=<%= pagenumber + 1 %>"class="btn btn-success btn-arrow-left" style="background-color:#909020;">前の <%=g-1 %>個</a>
<%
}
%>


</div>
</div>





<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>