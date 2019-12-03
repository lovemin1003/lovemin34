<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="user.userdao" %>
<%@page import="user.user1" %>
<%@page import="shop.shopdao" %>


<%@page import="java.io.PrintWriter" %>
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

<jsp:setProperty name="shop1" property="totalprice"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 
String userid=null;
if(session.getAttribute("userid")!=null)
{
	userid=(String)session.getAttribute("userid");
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

try
{
int tel11= Integer.parseInt( shop1.getTel1() );
}
catch ( NumberFormatException e ) {
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('電話番号は　数字で入力してください。')");
	script.println("history.back()");
	script.println("</script>");
    
}

String tel2=null;

if(request.getParameter("tel2") != null)
{
	tel2=(String) session.getAttribute("tel2");
}

try
{
int tel22= Integer.parseInt( shop1.getTel2() );
}
catch ( NumberFormatException e ) {
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('電話番号は　数字で入力してください。')");
	script.println("history.back()");
	script.println("</script>");
    
}


String tel3=null;

if(request.getParameter("tel3") != null)
{
	tel3=(String) session.getAttribute("tel3");
}

//int tel33= Integer.parseInt( shop1.getTel3() );

try
{
int tel33= Integer.parseInt( shop1.getTel3() );
}
catch ( NumberFormatException e ) {
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('電話番号は　数字で入力してください。')");
	script.println("history.back()");
	script.println("</script>");
    
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

shopdao shopdao = new shopdao();
userdao bbsdao = new userdao();
ArrayList<user1> list = bbsdao.getlist(userid);
for(int i=0; i < list.size(); i++)
	{%>


<%= list.get(i).getUserid() %>
<%= list.get(i).getUsername() %>
<%= list.get(i).getUsergender() %>
<%= list.get(i).getUseremail() %>

<%
int tel11= Integer.parseInt( shop1.getTel1() );
int tel22= Integer.parseInt( shop1.getTel2() );
int tel33= Integer.parseInt( shop1.getTel3() );
try
{
	
}
catch ( NumberFormatException e ) {
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('電話番号は　数字で入力してください。')");
	script.println("history.back()");
	script.println("</script>");
    
}

int result = shopdao.write(list.get(i).getUserid(),list.get(i).getUsername(),
		list.get(i).getUsergender(),list.get(i).getUseremail(), 
		shop1.getCustomname(),shop1.getCustomaddress1()
		,shop1.getCustomaddress2(),tel11,tel22
		,tel33,shop1.getHope()
		,shop1.getNormalplain(),shop1.getNutplain(),shop1.getChocoplain(),shop1.getMilkplain(),shop1.getCornplain()
		,shop1.getChococake(),shop1.getCreamcake(),shop1.getBerrycake(),shop1.getCheesecake(),shop1.getSweetpotatocake()
		,shop1.getCreamplus(),shop1.getCreamless()
		,shop1.getChococorone(),shop1.getPumpkincorone(),shop1.getBerrycorone()
		,shop1.getBeanbread()
		,shop1.getChocomuffin(),shop1.getPlanemuffin(),shop1.getHoneymuffin()
		,shop1.getPotatokoroke(),shop1.getCurrykoroke(),shop1.getVegekoroke()
		,shop1.getCroissant(),shop1.getChococroissant(),shop1.getAlmondcroissant()
		,shop1.getVegesandwich(),shop1.getChickensandwich(),shop1.getBeefsandwich(),shop1.getHamsandwich(),shop1.getEggsandwich()
		,shop1.getChoucream()
		,shop1.getCheesetart(),shop1.getEggtart(),shop1.getWalnuttart()
		,shop1.getPlanemakaron(),shop1.getChocomakaron(),shop1.getBerrymakaron(),shop1.getCheesemakaron(),shop1.getGreenmakaron()
		,shop1.getDacquoise(),shop1.getChocochip(),shop1.getSabre(),shop1.getChocosabre(),shop1.getGingerbread()
		,shop1.getTotalprice()
		);

if(result==-1)
{
	

	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('購買失敗。')");
	script.println("history.back()");
	script.println("</script>");
}


else 
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('購買成功。')");
	script.printf("location.href = 'banking.jsp?totalprice=%d'",shop1.getTotalprice());
	script.println("</script>");
}



%>
	
	<%} %>
	
	
	

</body>
</html>