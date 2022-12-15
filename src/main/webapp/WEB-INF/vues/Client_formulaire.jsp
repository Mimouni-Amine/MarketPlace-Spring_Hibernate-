<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire Client</title>
<link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>


<center><h1>Devenir Client Inscription</h1></center>

<!-- 	<form action="resultat_formulaire.jsp"> -->
	<form:form action="Client_Add_toUser_ID" modelAttribute="client1">
			panier: <form:input type="text" name="panier" path="panier"/>  <form:errors path="panier" cssClass="error"/>
		<br>
		
		moyen_de_payement: <form:input type="text"  name="moyen_de_payement"  path="moyen_de_payement"/><form:errors path="moyen_de_payement" cssClass="error"/>
		<br>
		
		<br>
		<input type="submit" value="valider">
		
		

	</form:form>



 
</body>
</html>