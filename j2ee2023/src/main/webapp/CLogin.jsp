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

	if (c != null)
		for (Cookie x : c) {
			if (x.getName().equals("login")) {
				
				response.sendRedirect("CHome.jsp");
			}
		}
	%>


	<form action="CLoginServlet" method="post">
		Email : <input type="text" name="email" /><br> <br>
		Password : <input type="password" name="password" /><br> <br>
		<input type="submit" value="Login" />

	</form>
	<br> ${error}
</body>
</html>