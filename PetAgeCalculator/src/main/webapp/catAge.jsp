<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center">
		<h1 style="color:DarkBlue;">Calculate Your Cat's Age</h1>
	<form action = "getCatServlet" method="post">
		Enter the number of whole years of your cat. 
		<input type = "text" name = "userPetAge" size = "10"/>
		<input type = "submit" value = "Calculate Age"/>	
	</form>
</body>
</html>