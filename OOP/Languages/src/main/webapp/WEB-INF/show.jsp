<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show?</title>
</head>
<body>
	<h3><c:out value="${language.id}" /></h3>
	<h3><c:out value="${language.name}" /></h3>
	<h3><c:out value="${language.creator}" /></h3>
	<h3><c:out value="${language.currentVersion}" /></h3>
</body>
</html>