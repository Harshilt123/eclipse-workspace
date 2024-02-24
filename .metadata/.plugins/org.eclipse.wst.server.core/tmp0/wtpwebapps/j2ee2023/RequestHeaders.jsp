<%@page import="java.util.Enumeration"%>
<%@page import="java.lang.Enum.EnumDesc"%>
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
     Enumeration<String> requestHeaders= (Enumeration<String>)request.getAttribute("requestHeaders");
    %>
   
   
   <%
       while(requestHeaders.hasMoreElements()) {
    	   
    	   out.print(requestHeaders.nextElement()+"<br> ");
       }
   
   %>



</body>
</html>