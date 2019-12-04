
<% request.setCharacterEncoding("UTF-8"); %>
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
<title>Insert title here</title>
</head>
<body>
<%
//소문자를 입력해야 처리되도록 만든 코드
String list =  "abcdefghijklmnopqrstuvwxyz"; //<-소문자들을 입력했지만 대문자나 숫자, 특수문자도 삽입 가능


ArrayList list1=new ArrayList(100);//소문자 집합

String list2=request.getParameter("username");

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

//String username=null;
//if(session.getAttribute("username")!=null)
//{
//	username=(String) session.getAttribute("username");
//}
if(userid==null)
{
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('ログインしてください。')");
	script.println("location.href = 'login.jsp'");
	script.println("</script>");
}




else
{
	if(
			 request.getParameter("userpassword") == null
			|| request.getParameter("username") == null
			|| request.getParameter("usergender") == null
			|| request.getParameter("useremail") == null
			
			|| request.getParameter("userpassword").equals("")
			|| request.getParameter("username").equals("")
			|| request.getParameter("usergender").equals("")
			|| request.getParameter("useremail").equals(""))
	{
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('全て 入力してください。')");
		script.println("history.back()");
		script.println("</script>");
	}



	


	else
	{
		userdao userdao = new userdao();
		int result = userdao.update(
				userid,
				request.getParameter("userpassword")
				,request.getParameter("username")
				,request.getParameter("usergender"),
				request.getParameter("useremail"));
		
		
		
		if(result == -1)
		{
			

			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('修正失敗。')");
			script.println("history.back()");
			script.println("</script>");
		}
		else
		{
			
			//session.setAttribute("userid",request.getParameter("userid")); 이걸 같이 적으면 username이 null로 나옴.(userid도 수정 가능하게 만들고 이걸 작동시키면 정상 작동 가능한 듯.)
			
			session.setAttribute("userpassword",request.getParameter("userpassword"));
			session.setAttribute("username",request.getParameter("username"));
			session.setAttribute("usergender",request.getParameter("usergender"));
			session.setAttribute("useremail",request.getParameter("useremail"));
			
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('修正成功。')");
			script.println("location.href = 'main.jsp'");
			script.println("</script>");
		}
	}
}







%>
</body>
</html>