<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/languages/${langObj.id}/edit" method="POST" modelAttribute="langObj">
		<input type="hidden" name="_method" value="put">
		<p> Name: </p>
		<form:input path="name" type="text"/>
		<form:errors path="name" />
		<p>Creator: </p>
		<form:input path="creator" type="text" />
		<form:errors path="creator" />
		<p> Current Version: </p>
		<form:input path="currentVersion" type="text" />
		<form:errors path="currentVersion" />
		<button type="submit">Update</button>
	</form:form>
</body>
</html>