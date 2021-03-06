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
	<title>Dojo</title>
</head>
<body>
	<h1>${onedojo.name}</h1>
	<table class="table table-dark">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ninjas" items="${onedojo.ninjas}">
				<tr>
					<td><c:out value="${ninjas.first_name}" /> </td>
					<td><c:out value="${ninjas.last_name}" /> </td>
					<td><c:out value="${ninjas.age}" /> </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>