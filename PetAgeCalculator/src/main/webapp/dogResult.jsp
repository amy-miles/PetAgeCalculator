<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	
<meta charset="ISO-8859-1">
<title>Dog Age Results</title>
</head>
<body style="text-align:center">
	
		<h1 style="color:DarkBlue;">Your dog is ${dogAgeFetch.getPetAgeResult()} in human years!</h1>
		
		<p>
			<a href="index.jsp"><button>Home</button></a>
			<a href="dogAge.jsp"><button>Dog Age</button></a>
			<a href="catAge.jsp"><button>Cat Age</button></a>	
		</p>
</body>
</html>