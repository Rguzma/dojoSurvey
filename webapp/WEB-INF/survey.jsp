<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Survey</title>
</head>
<body>
		<form method="POST" action="/submitInfo">
			<div>
				<label for="name"> Your Name: </label>
				<input type="text" id="name" name="name" >
			</div>
			<div>
				<label for="dojoLocation"> Dojo Location: </label>
				<select id="dojoLocation" name="dojoLocation">
					<option value="sanJose">San Jose </option>
					<option value="virtual">Virtual </option>
					<option value="miCasa">Mi casa</option>
					</select>
			</div>
			<div>
				<label for="favoriteLanguage"> Favorite Language: </label>
				<select id="favoriteLanguage" name="favoriteLanguage">
					<option value="Python">Python</option>
					<option value="Java">Java </option>
					<option value="JavaScript">JavaScript</option>
				</select>
			</div>
			<div>
				<label for="comment"> Identifier: </label>
				<textarea id="comment" name="comment"> </textarea>
			</div>
			<div>
				<button type="submit"> Submit
			
				</button>
			</div>
		</form>


</body>
</html>