<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
	<meta charset="ISO-8859-1">
	<title>Survey</title>
</head>
<body>
	<div class="container">
        <form action="/results" method= "POST">
            <div class="name">
                <p>Your Name:</p>
                <input type="text" name="name">
            </div>
            <div class="location">
                <p>Dojo Location:</p>
                <select name="locations" id="locations">
                    <option value="San Jose">San Jose</option>
                    <option value="Burbank">Burbank</option>
                    <option value="Dallas">Dallas</option>
				</select>
            </div>
            <div class= language>
            	<p> Favorite Language: </p>
            	<select name="lang">
            		<option value = "Python">Python </option>
            		<option value = "JavaScript"> JavaSript </option>
            		<option value = "Java"> JAVA </option>
            	</select>
            </div>
            <p> Comments: </p>
            <textarea name="comments" cols="30" rows= "5"></textarea>
            <button>Send</button>
        </form>
    </div>
</body>
</html>