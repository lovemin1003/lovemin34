<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//var a = 12.333;
	//alert(a);
	function check(){
		
		if(document.f.name.value == ""){
			alert("이름을 입력하십시오!!");
		}else if(document.f.java.value == ""){
			alert("JAVA를 입력하십시오!!");
		}else if(document.f.jsp.value == ""){
			alert("JSP를 입력하십시오!!");
		}else if(document.f.spring.value == ""){
			alert("Spring을 입력하십시오!!");
		}else{
			document.f.submit();// 전송
		}
		
	}
	
</script>
</head>
<body>
	<div align="center">
		<form action="/JSP/StudentResult.jsp" method="post" name="f">
			<table border="1">
				<tr>
					<th>Name</th>
					<td><input type="text" name = "name"></td>
				</tr>
				<tr>
					<th>Java</th>
					<td><input type="text" name = "java"></td>
				</tr>
				<tr>
					<th>Jsp</th>
					<td><input type="text" name = "jsp"></td>
				</tr>
				<tr>
					<th>Spring</th>
					<td><input type="text" name = "spring"></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<!--  <input type = "submit" value = "전송"> -->
						<input type="button" value="전송" onclick="javascript:check()">
						<input type="button" value="다시" onclick="document.f.reset()">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>




