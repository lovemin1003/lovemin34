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
 <?xml version="1.0" encoding="UTF-8" ?>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.net.URLEncoder"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="org.apache.log4j.*"%>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>


     
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

String bbscontent1=null;
if(session.getAttribute("bbscontent1")!=null)
{
	bbscontent1=(String)session.getAttribute("bbscontent1");
}



int bbsid=0;

if(request.getParameter("bbsid") != null)
{
	bbsid = Integer.parseInt(request.getParameter("bbsid"));
}

int commentid=0;
if(request.getParameter("commentid")!=null)
{
	commentid=Integer.parseInt(request.getParameter("commentid"));
}

int pagenumber = bbsid;//기본 페이지 의미

if(request.getParameter("pagenumber") != null)
{
	pagenumber = Integer.parseInt(request.getParameter("pagenumber"));
}


if(bbsid==0)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('その文はありません。')");
	script.println("location.href = 'bbs.jsp'");
	script.println("</script>");
}

bbs bbs = new bbsdao().getbbs(bbsid);

int bbsid1 = bbsid;

bbsdao bbsdao = new bbsdao();
int result = bbsdao.readcount(bbsid);
if(result == -1)
{
	
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("閲覧数　追加失敗。");
	script.println("history.back()");
	script.println("</script>");
}
else
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	//script.println("location.href = 'bbs.jsp'");
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
<li class="active"><a href="bbs.jsp">掲示板</a></li>
<li><a href="shopping.jsp">製品購買</a></li>
<li><a href="shoppinghistory.jsp">購買目録</a></li>
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

<table class="table table-striped" style="text-align:center; border: 1px dotted cyan">

<thead>
<tr>
<th colspan="3" style="background-color: pink; text-align: center;">掲示板</th>
</tr>
</thead>
<%
bbs1dao bbs1dao = new bbs1dao();
ArrayList<bbs1> list = bbs1dao.getlist(pagenumber);
%>

<h4 style="text-align: right;">閲覧数:<%=bbs.getHit()%> コメント数:<%=bbs1dao.commentcount(bbsid) %>
</h4>
<tbody>
<tr>
<td style="width:15%">タイトル</td>
<td conspan="2"><%=bbs.getBbstitle().replaceAll(" ","&nbsp").replaceAll("<", "&lt").replaceAll(">", "&gt").replaceAll("\n", "<br>")%></td>
</tr>
<tr style="background-color:violet;">
<td>書いた会員のID</td>
<td conspan="2"><%=bbs.getUserid()%></td>
</tr>
<tr >
<td>作成日</td>
<td conspan="2"><%=bbs.getBbsdate()%></td>
</tr>
<td>書いた会員のニックネーム</td>
<td conspan="2"><%=bbs.getUsername()%></td>
</tr>
<td>作成順番</td>
<td conspan="2"><%=bbs.getBbsid()%></td>
</tr>
<tr  >
<td style="background-color:black; color:white; ">作成内容</td>
<td conspan="2" style="min-height: 200px; text-align: left; background-color:white;"><%=bbs.getBbscontent().replaceAll(" ","&nbsp").replaceAll("<", "&lt").replaceAll(">", "&gt").replaceAll("\n", "<br>")%></td>

</tr>
<tr  >
<td style="background-color:black; color:white; ">添付ファイル</td>
<%
if(bbs.getFilename()!=null)
{
%>
<td conspan="2">

<%=bbs.getFilename() %> <a href = "FileDownload.jsp?filename=<%=bbs.getFilename()%>"> <input   type="button" value="ダウンロード"></input></a>


<script>

$(document).ready(function() { 
	$(".사진1").click(function() {
		$("#사진2").toggle(); //버튼을 누르면 구매창이 나오며 다시 누르면 사라짐.(일일이 다 하나씩 만들어야 되는 듯.)
		$(".사진1").toggle();//사진보기 버튼을 누르면 사진닫기 버튼이 나오며 다시 누르면 사진보기 버튼이 나옴.
		
    });
});
</script>
<% 
if(bbs.getFilename().contains(".mov")||
		bbs.getFilename().contains(".mp4")||
		bbs.getFilename().contains(".avi")||
		bbs.getFilename().contains(".wmv")||
		bbs.getFilename().contains(".mp3")||
		bbs.getFilename().contains(".wma")||
		bbs.getFilename().contains(".wav")||
		bbs.getFilename().contains(".aac")||
		bbs.getFilename().contains(".ogg")||
		bbs.getFilename().contains(".ogv")||
		bbs.getFilename().contains(".flac")||
		bbs.getFilename().contains(".webm")||
		bbs.getFilename().contains(".jpg")||
		bbs.getFilename().contains(".jpeg")||
		bbs.getFilename().contains(".png")||
		bbs.getFilename().contains(".gif")||
		bbs.getFilename().contains(".mkv")
		)
	//동영상, 오디오 파일
{
%>
<input class="사진1 "  type="button" value="ファイルを見る"></input>
<%
}
%>
<input class="사진1 "  style="display:none"  type="button" value="ファイルを閉じる"></input>
<fieldset id="사진2" style="display:none;">

<!-- 동영상,음악 파일일 경우 -->
<% 
if(bbs.getFilename().contains(".mov")||
		bbs.getFilename().contains(".mp4")||
		bbs.getFilename().contains(".avi")||
		bbs.getFilename().contains(".wmv")||
		bbs.getFilename().contains(".mp3")||
		bbs.getFilename().contains(".wma")||
		bbs.getFilename().contains(".wav")||
		bbs.getFilename().contains(".aac")||
		bbs.getFilename().contains(".ogg")||
		bbs.getFilename().contains(".ogv")||
		bbs.getFilename().contains(".flac")||
		bbs.getFilename().contains(".webm")||
		bbs.getFilename().contains(".mkv")
		)
	//동영상, 오디오 파일
{
%>
<video controls style="width:80%; height:80%;"> 
<source src="Storage/<%=bbs.getFilename() %>" style="width:55%; height:55%;" type='video/ogg'>
</video>

<%
}
%>

<!-- 이미지 파일일 경우 -->
<% 
if(bbs.getFilename().contains(".jpg")||
		bbs.getFilename().contains(".jpeg")||
		bbs.getFilename().contains(".png")||
		bbs.getFilename().contains(".gif")
		)
{
%>
<img src="Storage/<%=bbs.getFilename() %> " style="width:55%; height:55%;"></img>


<%
}
%>

<!-- 음악 파일일 경우(video에도 작동이 되는 듯.) -->
<!-- 
<audio controls>
<source src="Storage/<%=bbs.getFilename() %>" type='audio/ogg'>
</audio>
 -->
</fieldset>
</td>
<%
}
%>

<%
if(bbs.getFilename()==null)
{
%>
<td conspan="2">なし。</td>
<%
}
%>
</tr>
<tr  >



</tr>

</tbody>
</table>

<a href="bbs.jsp" class="btn btn-primary">目録</a>
<%

int bbsidud= bbsid;//수정, 삭제시킬 글 순서 지정
int bbsidup= bbsid;//다음글 순서 지정

while(bbsdao.nextbbs(bbsid-1)==false)
{
	bbsid-=1;
}
while(bbsdao.nextbbs(bbsidup+1)==false)
{
	bbsidup+=1;
	
}

if(bbsdao.nextbbs(bbsid-1)&&bbsid>1)
{
	
%>
<a href="view.jsp?bbsid=<%=bbsid-1 %>" class="btn btn-primary">前の文</a>

<%
}
%>
<%
if(bbsdao.nextbbs(bbsidup+1)&&bbsdao.getnext()>bbsid+1)
{
%>
<a href="view.jsp?bbsid=<%=bbsidup+1 %>" class="btn btn-primary">次の文</a>
<%
}
%>

<%
	if(userid != null && userpassword!=null && userid.equals(bbs.getUserid())){
%>
<a onclick="return confirm('本当に　修正しますか？')" 
href="update.jsp?bbsid=<%=bbsidud%>" class="btn btn-primary" style="background-color:blue;">修正</a>
<a onclick="return confirm('本当に　削除しますか？')"  
 href="deleteaction.jsp?bbsid=<%=bbsidud%>" class="btn btn-primary">削除</a>
 
<%
 	}
 %>

<a href="write.jsp" class="btn btn-primary pull-right" style="background-color: orange;">文を作成する</a>

<br>

<%
//bbs1dao bbs1dao = new bbs1dao();
//ArrayList<bbs1> list = bbs1dao.getlist(pagenumber);
for(int i=0; i < list.size(); i++)
	{
%>


<%= list.get(i).getUserid()  %>: <%= list.get(i).getBbscontent1()  %> <%= list.get(i).getBbsdate()  %>
<tr>
<td style="background-color:black; color:white; ">添付ファイル:</td>

<%
if(list.get(i).getFilename()==null)
{
%>
なし。
<%
}
%>

<%
if(list.get(i).getFilename()!=null)
{
%>

<td conspan="2">

<%=list.get(i).getFilename() %> <a href = "FileDownload.jsp?filename=<%=list.get(i).getFilename()%>"> <input   type="button" value="ダウンロード"></input></a>



<% 
if(list.get(i).getFilename().contains(".mov")||
		list.get(i).getFilename().contains(".mp4")||
		list.get(i).getFilename().contains(".avi")||
		list.get(i).getFilename().contains(".wmv")||
		list.get(i).getFilename().contains(".mp3")||
		list.get(i).getFilename().contains(".wma")||
		list.get(i).getFilename().contains(".wav")||
		list.get(i).getFilename().contains(".aac")||
		list.get(i).getFilename().contains(".ogg")||
		list.get(i).getFilename().contains(".ogv")||
		list.get(i).getFilename().contains(".flac")||
        list.get(i).getFilename().contains(".webm")||
        list.get(i).getFilename().contains(".jpg")||
        list.get(i).getFilename().contains(".jpeg")||
        list.get(i).getFilename().contains(".png")||
        list.get(i).getFilename().contains(".gif")||
        list.get(i).getFilename().contains(".mkv")
		)
	//동영상, 오디오 파일
{
%>



<%
}
%>


<fieldset >

<!-- 동영상,음악 파일일 경우 -->
<% 
if(list.get(i).getFilename().contains(".mov")||
		list.get(i).getFilename().contains(".mp4")||
		list.get(i).getFilename().contains(".avi")||
		list.get(i).getFilename().contains(".wmv")||
		list.get(i).getFilename().contains(".mp3")||
		list.get(i).getFilename().contains(".wma")||
		list.get(i).getFilename().contains(".wav")||
		list.get(i).getFilename().contains(".aac")||
		list.get(i).getFilename().contains(".ogg")||
		list.get(i).getFilename().contains(".ogv")||
		list.get(i).getFilename().contains(".flac")||
        list.get(i).getFilename().contains(".webm")||
        list.get(i).getFilename().contains(".mkv")
		)
		
	//동영상, 오디오 파일
{
%>
<video controls style="width:40%; height:40%;"> 
<source src="Storage/<%=list.get(i).getFilename() %>" style="width:55%; height:55%;" type='video/ogg'>
</video>

<%
}
%>

<!-- 이미지 파일일 경우 -->
<% 
if(list.get(i).getFilename().contains(".jpg")||
        list.get(i).getFilename().contains(".jpeg")||
        list.get(i).getFilename().contains(".png")||
        list.get(i).getFilename().contains(".gif")
		)
{
%>
<img src="Storage/<%=list.get(i).getFilename() %> " style="width:25%; height:25%;"></img>


<%
}
%>

<!-- 음악 파일일 경우(video에도 작동이 되는 듯.) -->
<!-- 
<audio controls>
<source src="Storage/<%=list.get(i).getFilename() %>" type='audio/ogg'>
</audio>
 -->
</fieldset>

</td>
<%
}
%>

<%
if(bbs.getFilename()==null)
{
%>
<td conspan="2">なし。</td>
<%
}
%>
</tr>
<%
	if(userid != null && userpassword!=null && list.get(i).getUserid().equals(userid)){
		bbsid= list.get(i).getBbsid();		
%>

<a onclick="return confirm('本当に　修正しますか？')" 
href="updatecomment1.jsp?commentid=<%=list.get(i).getCommentid()%>&bbsid<%=bbsid %>" class="btn btn" style="color:blue;">修正</a>
<a onclick="return confirm('本当に　削除しますか？')"  
 href="deletecommentaction.jsp?commentid=<%=list.get(i).getCommentid()%>" class="btn btn">削除</a>
 
<%
 	}
 %>
<br>

<%} %>


<% 
bbs1dao bbs1dao1 = new bbs1dao();
ArrayList<bbs1> list1 = bbs1dao1.getlist(pagenumber);
if(userid!=null && userpassword!=null){

	 
%>

<form method="post" action="commentaction.jsp?bbsid=<%=bbsid%>" enctype="multipart/form-data">

<table class="table table-striped" style="text-align:center; border: 1px dotted cyan">

<input type="text" class="form-control" placeholder="コメント内容" name="bbscontent1" maxlength="500" style="height: 30px;">

ファイル: <input type="file" name="filename"> 
						
				
				
</table>
<input type="submit" class="btn btn-primary pull-right" value="コメント作成">

</form>


<%
}
%>




<%
if(userid!=null){
%>
<!--  
<form method="post" action="commentaction.jsp">
<table class="table table-striped" style="text-align:center; border: 1px dotted cyan">
<thead>
<tr>
<th colspan="2" style="background-color: pink; text-align: center;">게시판 글쓰기 양식</th>
</tr>
</thead>
<tbody>
<tr>
<td><textarea class="form-control" placeholder="글 내용" name="bbscontent1" maxlength="1300" style="height: 50px;"></textarea></td>
</tr>
<tr>
<td><input type="submit" class="btn btn-primary pull-right" value="덧글 쓰기"></td>

</tr>

</tbody>
</table>
</form>
-->
<%
}
%>
</div>
</div>






<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>