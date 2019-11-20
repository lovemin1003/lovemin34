<%@ page import="java.util.Date"%>
    <%response.setContentType("text/event-stream; charset=utf-8"); Date time =  new Date() %>
    data:<%= time %>//안 되는 이유가...
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
data:<%= time %>
</body>
</html>