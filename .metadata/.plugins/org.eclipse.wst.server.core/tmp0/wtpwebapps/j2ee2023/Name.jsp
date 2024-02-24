
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="NameServlet" method="post">
   Name:<input type="text" name="userName"/>
   ${nameError}
   <br></br>
   <input type ="submit" value="Convert"/>
</form>
</body>
</html>