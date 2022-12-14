<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire Utilisateur</title>
<link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>




<!-- 	<form action="resultat_formulaire.jsp"> -->
	<form:form action="Utilisateur_add" modelAttribute="utilisateur1">
			User_name: <form:input type="text" name="user_name" path="user_name"/>  <form:errors path="user_name" cssClass="error"/>
		<br>
		
		Mot_de_passe: <form:input type="text"  name="mot_de_passe"  path="mot_de_passe"/><form:errors path="mot_de_passe" cssClass="error"/>
		<br>
		
		
		Nom: <form:input type="text" name="nom" path="nom"/>  <form:errors path="nom" cssClass="error"/>
		<br>
		
		Prenom: <form:input type="text"  name="prenom"  path="prenom"/><form:errors path="prenom" cssClass="error"/>
		<br>
		

		Numero de telephone: <form:input type="text" name="numero" path="numero"/>  <form:errors path="numero" cssClass="error"/>
		<br>
		
		Email: <form:input type="text"  name="email"  path="email"/><form:errors path="email" cssClass="error"/>
		<br>
		
		
		<br>
		<input type="submit" value="valider">
		
		

	</form:form>


<a href="client_add" class="button" >Inscrire Compte Client</a>

 
</body>
</html>