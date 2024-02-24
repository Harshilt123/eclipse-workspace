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
         for(Cookie x : c)
         {
        	 if(x.getName()=="login")
        	 {
        		       		 
        	 }
        	 
         }


%>
<form action="RoyalLoginServlet" method="post">

Email: <input type="text" name="email">
<br>
Password : <input type="password" name="password">

<input type="submit" value="login">

</form>
       ${error }

</body>
</html>