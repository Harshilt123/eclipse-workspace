<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie c[] = request.getCookies();

	for (Cookie x : c) {
		out.print(x.getName() + "::" + x.getValue() + "<bR><br>");
	}
	%>
	<br>
	<br>
	<a href="InputCookieData.jsp">Add New Cookie</a>


</body>
</html>