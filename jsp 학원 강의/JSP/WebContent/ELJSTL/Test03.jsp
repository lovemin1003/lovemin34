<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%--
	JSTL(Java Standard Tag Library)
	 - JSP표준 태그 라이브러리...
	 - XML의 데이터 처리와 제어문을 처리하기위한 태그...
	 - https://tomcat.apache.org/download-taglibs.cgi 
	 - <%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <H3>** 변수 설정 **</H3>
 <c:set var = "name">홍길동</c:set>
 <c:set var = "age" value="25"/>
 나의 이름은 <c:out value="${name}" />입니다.<br>
 나의 나이는 <c:out value="${age}" />입니다.<br>
 나의 키는 ${height }입니다<br> <!-- 없는 변수는 안나옴! -->
 
 <H3>** 변수 삭제 **</H3>
 <c:remove var ="name" />
 나의 이름은 <c:out value="${name}"/>입니다.<br>
 나의 나이는 <c:out value="${age}" />입니다.<br>
 나의 키는 ${height }입니다<br> 
 
 <H3>** forEach **</H3>
 <c:forEach var="i" begin="1" end="10" step="1">
	 ${i } &nbsp;&nbsp;
 	<c:set var="sum" value="${sum+i }"/>
 </c:forEach>
 <br>
 1 ~ 10 까지의 합 = ${sum } <br><br>
 
 <H3>** 배열 처리 **</H3>
 <c:set var = "ar" value ="10,20,30,40,50" />
 <c:forEach var = "data" items = "${ar }"> <!-- for(int data : ar) -->
 	${data } &nbsp;&nbsp;
 </c:forEach>
 <H3>** 문자열 분리**</H3>
 <c:forTokens var = "car" 
		   items = "소나타-그랜져-아우디-링컨-페라리" delims="-">
	 ${car }<br>
 </c:forTokens>
 
 <H3>** if **</H3>
 <c:if test="${age le 19 }"><!-- test="${age <= 19 } -->
 	청소년
 </c:if>
 <c:if test="${age gt 19 }"><!-- test="${age > 19 } -->
 	성인
 </c:if>
 
 <H3>** 다중 if **</H3>
 <c:set var = "color" value="red,green,blue,magenta,cyan" />
 <c:forEach var="data" items="${color }">
 <c:choose>
 <c:when test="${data=='red' }">빨강</c:when>
 <c:when test="${data=='green' }">초록</c:when>
 <c:when test="${data=='blue' }">파랑</c:when>
 <c:when test="${data=='magenta' }">보라</c:when>
 <c:otherwise>하늘</c:otherwise>
 </c:choose>
 </c:forEach>
</body>
</html>
 