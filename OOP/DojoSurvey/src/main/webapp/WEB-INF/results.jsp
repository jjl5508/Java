<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Results</title>
</head>
<body>
	<h1>Submitted Info:</h1>
	<h3>Name:</h3>
	<h3><c:out value="${name}" /></h3>
	<h3>Location:</h3>
	<h3><c:out value="${locations}" /></h3>
	<h3>Favorite Language:</h3>
	<h3><c:out value="${lang}" /></h3>
	<h3>Comments:</h3>
	<h3><c:out value="${comments}" /></h3>
</body>
</html>