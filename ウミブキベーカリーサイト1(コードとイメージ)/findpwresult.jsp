<%@page import="user.userdao"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.io.PrintWriter" %>
    <%@page import="java.util.ArrayList" %>
        <%@page import="java.util.List" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content ="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>掲示板</title>
<style type="text/css">
body
{
 background-image: url("츠구미.png");
 background-attachment: fixed;
 background-size: 50%;
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

String pw;
userdao dao = new userdao();

pw = dao.findpassword(userid, username);//name= username(닉네임.)



//소문자를 입력해야 처리되도록 만든 코드
String list =  "abcdefghijklmnopqrstuvwxyz"; //<-소문자들을 입력했지만 대문자나 숫자, 특수문자도 삽입 가능

ArrayList list1=new ArrayList(100);//소문자 집합

String list2=pw;//아이디에  소문자를 입력해야 가입 가능하도록 처리함.

//ArrayList list3 =new ArrayList(100);//입력 글자 집합

List<String> list3 = new ArrayList<String>();

ArrayList list4 =new ArrayList(100);//입력 글자 집합(복제판)

for (int i=0; i<list.length(); i++)//소문자 집합 만들기
{
	
		list1.add(list.substring(i,i+1));
		
	
}

for (int i=0; i<list2.length(); i++)//입력글자 집합 만들기
{
	
		list3.add(list2.substring(i,i+1));
		list4.add(list2.substring(i,i+1));
	
}

System.out.println(list1);//소문자 집합 출력
System.out.println(list3);//입력글자 집합 출력

String[] stockArr = new String[list3.size()];
stockArr = list3.toArray(stockArr);

for(int i=0; i<3; i++)
{
stockArr[i]="*";
}
String password="";
for(int i=0; i<list3.size(); i++)
{
	password+=stockArr[i];
}
%>

<%
     //session.invalidate(); 초기화 코드
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





<div align="center">




</div>


<div align="center">
あなたのパスワードは <%=password%> です。
</div>




<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>