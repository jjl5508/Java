<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Languages</title>
</head>
<body>
	<h1>Dashboard</h1>
	<table class="table table-dark">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Creator</th>
				<th>Current Version</th>
				<th> Actions </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="language" items="${languages}">
				<tr>
					<td><c:out value="${language.id}" /> </td>
					<td><c:out value="${language.name}" /> </td>
					<td><c:out value="${language.creator }" /> </td>
					<td><c:out value="${language.currentVersion }" /></td>
					<td>
						<a href="/languages/${language.id}"> Show</a>
						<a href= "/languages/${language.id}/edit">Edit</a>
						<a href="/languages/${language.id}/delete">Delete</a>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<form:form action="/languages" method="POST" modelAttribute="langObj">
		<p> Name: </p>
		<form:input path="name" type="text"/>
		<form:errors path="name" />
		<p>Creator: </p>
		<form:input path="creator" type="text" />
		<form:errors path="creator" />
		<p> Current Version: </p>
		<form:input path="currentVersion" type="text" />
		<form:errors path="currentVersion" />
		<button type="submit">Create</button>
	</form:form>
</body>
</html>