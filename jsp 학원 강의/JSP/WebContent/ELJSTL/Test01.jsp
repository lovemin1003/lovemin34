<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%--
	EL(Expression Language)
	 - 표현언어...
	 - 자바코드 대신 표현하기 쉽게 하기위해 사용하는 언어
	 - 내장....isELIgnored="true"
	 - <% %>과 <%= %>대신에 EL/JSTL 사용을 권장한다.
	 - 영역과 속성 내장객체들안의 속성을 사용가능하다.
	 - 자바 메소드,연산.....
	 - ${ 코드 }
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="400">
		<tr>
			<th width="50%">표현식</th>
			<th>값</th>
		</tr>
		<tr>
			<td align="center">\${ 25+36 }</td>
			<td align="center">${ 25+36 }</td>
		</tr>
		<tr>
			<td align="center">\${ 25/6 }</td>
			<td align="center">${ 25/6 }</td>
		</tr>
		<tr>
			<td align="center">\${ 25%6 }</td>
			<td align="center">${ 25%6 }</td>
		</tr>
		<tr>
			<td align="center">\${ 25>36 }</td>
			<td align="center">${ 25>36 }</td>
		</tr>
		<tr>
			<td align="center">\${ header['host'] }</td>
			<td align="center">${ header['host'] }</td>
		</tr>
		<tr>
			<td align="center">\${ header.host }</td>
			<td align="center">${ header.host }</td>
		</tr>
	</table>
</body>
</html>
