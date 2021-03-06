<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
	<meta charset="ISO-8859-1">
	<title>New Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form action="/ninjas/new/post" method="POST" modelAttribute="ninjaObj">
		
		<p> Dojo: </p>
		<form:select path="dojo">
			<c:forEach var="eachdojo" items="${dojos}">
				<form:option value="${eachdojo.id}"> 
					<c:out value="${eachdojo.name}" /> 
				</form:option>
			</c:forEach>
		</form:select>
		<p> First Name: </p>
		<form:input path="first_name" type="text" />
		<p> Last Name: </p>
		<form:input path="last_name" type="text" />
		<p> Age: </p>
		<form:input path="age" type="text" />
		<button type="submit">Create!</button>
	</form:form>
</body>
</html>