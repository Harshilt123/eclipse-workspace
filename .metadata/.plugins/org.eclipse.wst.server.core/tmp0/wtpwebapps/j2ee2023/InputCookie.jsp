<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="InputCookieServlet" method="post">
	
	CookieName  :  <input type="text" name="cName"/><br><br>
	CookieValue :  <input type="text" name="cValue"/><br> <Br>
	
	<input type="submit" value="Add Cookie"/> 

</form>
<br><br>

<a href="PrintAllCookie.jsp">All Cookie</a>

</body>
</html>
