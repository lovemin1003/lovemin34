<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="user.userdao" %>
<%@page import="java.io.PrintWriter" %>
<%@page import="java.util.ArrayList" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user1" class="user.user1" scope="page" />
<jsp:setProperty name="user1" property="userid"/>
<jsp:setProperty name="user1" property="userpassword"/>
<jsp:setProperty name="user1" property="username"/>
<jsp:setProperty name="user1" property="usergender"/>
<jsp:setProperty name="user1" property="useremail"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>掲示板</title>
</head>
<body>
<%
if(
user1.getUserid()==null||
user1.getUserpassword()==null||
user1.getUsername()==null||
user1.getUsergender()==null||
user1.getUseremail()==null
)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('全て 入力してください。')");
	script.println("location.href = 'join.jsp'");
	script.println("history.back()");

	script.println("</script>");
}


//소문자를 입력해야 처리되도록 만든 코드
String list =  "abcdefghijklmnopqrstuvwxyz"; //<-소문자들을 입력했지만 대문자나 숫자, 특수문자도 삽입 가능

ArrayList list1=new ArrayList(100);//소문자 집합

String list2=user1.getUserpassword();//아이디에  소문자를 입력해야 가입 가능하도록 처리함.

ArrayList list3 =new ArrayList(100);//입력 글자 집합

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

int a1=0;//소문자 가지 수

for (int i1=0; i1< list2.length(); i1++)
{	
for (int i=0; i<list.length(); i++)
{
    
    	// 소문자 있으면 바로 루프 탈출해서 소문자 있다고 알려줌.
    	  if(list3.contains(list1.get(i)))
    	  {
    	  a1++;
    	  break; 
    		
	      }
     }
}



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


if(userid!=null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("既に ログインしています。");
	script.println("location.href = 'main.jsp'");
	script.println("</script>");
}


if(//이런 방법으로 다른 데이터의 길이도 설정 가능.
user1.getUserid().length() < 3 || user1.getUserid().length() > 12
)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('IDは 3文字以上、12文字以下で 設定してください。')");
	script.println("location.href = 'join.jsp'");
	script.println("</script>");
}








if(a1== 0)//소문자가 없으면 가입 처리 안 되도록 만듬.(특수 문자 없는 비번으로 설정하도록 만들 수도 있음.)
{
	PrintWriter script = response.getWriter();
  script.println("<script>");
	script.println("alert('パスワードに 英語の小文字を 一つ以上 含めてください。')");
	script.println("location.href = 'join.jsp'");
	script.println("</script>");
 
}


userdao userdao1 = new userdao();
int result1 = userdao1.checkid( user1.getUserid());//이것만 입력해도 닉네임이 나오도록 해야 함.
int result2 = userdao1.checkname( user1.getUsername());//이것만 입력해도 닉네임이 나오도록 해야 함.

//int result1 = userdao.login1(user1.getUsername(), user1.getUserpassword());//로그인시 닉네임도 나올 수 있게 하기 위해 만들어 본 것(테스팅) 이걸로 로그인시 아이디도 같이 출력되는 듯.


if(result1==1 && result2==1)//원래: 아이디, 계정 모두 같았을 때
{
	session.setAttribute("userid",user1.getUserid());
	session.setAttribute("username",user1.getUsername());


	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('その ID、ニックネームを 使っている 会員が あるため 他の ID、ニックネームを 入力してください。')");
	script.println("history.back()");
	script.println("</script>");
}



else if(result1==1 && result2!=1)//원래: 아이디만 같은게 있는 경우
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('その IDを 使っている 会員が あるため 他の IDを 入力してください。')");
	script.println("history.back()");
	script.println("</script>");
}

else if(result2==1 && result1!=1)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('その ニックネームを 使っている 会員が あるため 他の ニックネームを 入力してください。')");
	script.println("history.back()");
	script.println("</script>");
}




else if(result1==-2 ||result2==-2)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('データベースのエラー　発生')");
	script.println("history.back()");
	script.println("</script>");
}





else
{
	

userdao userdao = new userdao();
int result = userdao.join(user1);




if(result!=-1 )

{
	session.setAttribute("userid",user1.getUserid());
	session.setAttribute("username",user1.getUsername());
	session.setAttribute("userpassword",user1.getUserpassword());
	session.setAttribute("usergender",user1.getUsergender());
	session.setAttribute("useremail",user1.getUseremail());


	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('会員登録に 成功しました。')");
	script.println("location.href = 'main.jsp'");
	script.println("</script>");
}
else
{
	
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('その ニックネームを 使っている 会員が あるため 他の ニックネームを 入力してください。')");
	
	script.println("history.back()");
	script.println("</script>");
}




}








%>
</body>
</html>