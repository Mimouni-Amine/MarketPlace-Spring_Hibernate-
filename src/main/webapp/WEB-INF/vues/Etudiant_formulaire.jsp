<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire Etudiant</title>
<link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>




<!-- 	<form action="resultat_formulaire.jsp"> -->
	<form:form action="Etudiant_add" modelAttribute="etudiant1">
		Nom: <form:input type="text" name="nom" path="nom"/>  <form:errors path="nom" cssClass="error"/>
		<br>
		
		Prenom: <form:input type="text"  name="prenom"  path="prenom"/><form:errors path="prenom" cssClass="error"/>
		<br>
		
		immatriculation: <form:input type="text"  name="immatriculation"  path="immatriculation"/><form:errors path="immatriculation" cssClass="error"/>
		<br>
		BirthDate: <form:input type="text"  name="birthDate"  path="birthDate"/><form:errors path="birthDate" cssClass="error"/>
		<br>
		<h2>Age:</h2>
		<form:input type="text" name="age" path="age"/>
		<br>
		
		<h2>Votre Pays est:</h2><form:select name="pays" path="paysChoisi">
	    <form:options items="${etudiant1.pays}"></form:options>

	
	</form:select>
	<br>
	Maths<form:checkbox path="matieres" name="cours" value="Maths"/>
	<br>
	Physique<form:checkbox  path="matieres" name="cours" value="Physique"/>
	<br>
	Sciences<form:checkbox  path="matieres" name="cours" value="Sciences"/>
	<br>
		<input type="submit" value="valider">

	</form:form>



 
</body>
</html>