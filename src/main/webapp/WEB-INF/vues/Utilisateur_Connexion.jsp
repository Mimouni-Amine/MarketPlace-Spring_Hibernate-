<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire Connexion</title>
<link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>




<!-- 	<form action="resultat_formulaire.jsp"> -->
<center><h1>Connection Utilisateur</h1></center>

<form action="utilisateur_Connexion" >
		<h2>User_name: </h2>
		<input type="text" name="user_name">

		<h2>Password: </h2>
		<input type="text" name="password">
		<input type="submit" value="Se Connecter">

	</form>

 
</body>
</html>