
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	       
        <%@page import="java.util.*" %>
        <%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
<style>
table, th, td {
  border:1px solid black;
  
}

.center{
	text-align=center;
}

.link-button { 
     background: #ffffff none repeat scroll 0 0; 
     border: 1px solid #aa8d56; 
     color: #aa8d56; 
     outline: medium none; 
     padding: 5px; 
     text-decoration: none; 
}
</style>

<head>
<meta charset="UTF-8">
<title>Resultats Etudiant</title>
</head>
<body>


 	
 	

<h1 class="center">Resultats Etudiant</h1>

<!-- 
<div>${etudiant1.getNom()}</div>
<div>${etudiant1.getPrenom()}</div>
<div>${etudiant1.getAge()}</div>
<div>${param.country}</div>
 	
 	 -->
<h3> Nom: 
${etudiant1.getNom()}</h3>
<h3> Prenom: 
${etudiant1.getPrenom()}</h3>
<h3> Age: 
${etudiant1.getAge()}</h3>
<h3> Pays: 
${etudiant1.getPaysChoisi()}</h3>
<h3> Immatriculation: 
${etudiant1.getImmatriculation()}</h3>
<h3> Date Of Birth: 
${etudiant1.getBirthDate()}</h3>


<h3> Courses List: 
<c:forEach items="${etudiant1.getMatieres()}" var="element"> 	
<c:out value="${element}"></c:out>
  </c:forEach>
</h3>
<br>

	<a href=""> Click Here to Add a new Student</a>








		
		

</body>
</html>