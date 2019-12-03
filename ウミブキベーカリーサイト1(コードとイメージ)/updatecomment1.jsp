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
if(userid==null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("ログインしてください。");
	script.println("location.href = 'login.jsp'");
	script.println("</script>");
}
int commentid=0;
if(request.getParameter("commentid")!=null)
{
	commentid=Integer.parseInt(request.getParameter("commentid"));
}

int bbsid=0;
if(request.getParameter("bbsid")!=null)
{
	bbsid=Integer.parseInt(request.getParameter("bbsid"));
}
int pagenumber = bbsid;//기본 페이지 의미

if(request.getParameter("pagenumber") != null)
{
	pagenumber = Integer.parseInt(request.getParameter("pagenumber"));
}
if(commentid==0)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("有効しない文です。");
	script.println("location.href = 'bbs.jsp'");
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

<div class="container">
<div class="row">
<% 
bbs1dao bbs1dao = new bbs1dao();
ArrayList<bbs1> list = bbs1dao.getlist1(commentid);
bbsid=list.get(0).getBbsid();
bbs1dao bbsdao1 = new bbs1dao();

ArrayList<bbs1> list2 = bbsdao1.getlist(bbsid);

bbsdao bbsdao = new bbsdao();

ArrayList<bbs> list1 = bbsdao.getlist4(bbsid);

%>
<table class="table table-striped" style="text-align:center; border: 1px dotted cyan">

<thead>
<tr>
<th colspan="3" style="background-color: pink; text-align: center;">掲示板</th>
</tr>
</thead>
<h4 style="text-align: right;">閲覧数:<%=list1.get(0).getHit()%> コメント数:<%=bbs1dao.commentcount(bbsid) %></h4>
<tbody>
<tr>
<td style="width:20%">タイトル</td>
<td conspan="2"><%=list1.get(0).getBbstitle().replaceAll(" ","&nbsp").replaceAll("<", "&lt").replaceAll(">", "&gt").replaceAll("\n", "<br>")%></td>
</tr>
<tr style="background-color:violet;">
<td>書いた会員のID</td>
<td conspan="2"><%=list1.get(0).getUserid()%></td>
</tr>
<tr >
<td>作成日</td>
<td conspan="2"><%=list1.get(0).getBbsdate()%></td>
</tr>
<td>書いた会員のニックネーム</td>
<td conspan="2"><%=list1.get(0).getUsername()%></td>
</tr>
<td>作成順番</td>
<td conspan="2"><%=list1.get(0).getBbsid()%></td>
</tr>
<tr  >
<td style="background-color:black; color:white;">作成内容</td>
<td conspan="2" style="min-height: 200px; text-align: left; background-color:white;"><%=list1.get(0).getBbscontent() .replaceAll(" ","&nbsp").replaceAll("<", "&lt").replaceAll(">", "&gt").replaceAll("\n", "<br>")%></td>
</tr>


</tbody>
</table>
<a href="bbs.jsp" class="btn btn-primary">目録</a>
<%
	if(userid != null && userpassword!=null && userid.equals(list1.get(0).getUserid()) )
	{
%> 
<a onclick="return confirm('本当に　修正しますか？')" 
href="update.jsp?bbsid=<%=bbsid%>" class="btn btn-primary" style="background-color:blue;">修正</a>
<a onclick="return confirm('本当に　削除しますか？')"  
 href="deleteaction.jsp?bbsid=<%=bbsid%>" class="btn btn-primary">削除</a>
 
<%
 	}
 %>
 <%
	if(userid!=null && userpassword!=null&& userid.equals(list1.get(0).getUserid())){
%>
<a href="write.jsp" class="btn btn-primary pull-right" style="background-color: orange;">文を作成する</a>
<%
	}
%>
<br>

<%
for(int i=0; i < list.size(); i++)
	{
%>
<%
	if(userid != null && userpassword!=null && list.get(i).getUserid().equals(userid)
	&& list.get(i).getCommentid()==commentid){
				
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

<%=list.get(i).getFilename() %> 


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

</tr>



<form method="post" action="updatecommentaction.jsp?commentid=<%=commentid%>&bbsid=<%=bbsid%>" enctype="multipart/form-data">

<table class="table table-striped" style="text-align:center; border: 1px dotted cyan">

<input type="text" class="form-control" placeholder="コメント内容" name="bbscontent1" maxlength="500" style="height: 30px;">


ファイル: <input type="file" name="filename"> 


<a  href="view.jsp?bbsid=<%=bbsid%>" class="btn btn-primary pull-right" style="background-color:blue;">戻る</a>
<input type="submit" class="btn btn-primary pull-right" value="コメント修正">

</form>

<%
 	}
 %>
<br>


<%} %>






</div>
</div>





<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>