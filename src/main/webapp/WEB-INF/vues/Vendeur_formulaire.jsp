<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire Client</title>
<link rel="stylesheet" type="text/css" href="/style.css">
<style>
.button {
            background-color: #1c87c9;
            box-shadow: 0 5px 0 #105cad;
            color: white;
            padding: 1em 1.5em;
            position: relative;
            text-decoration: none;
            display: inline-block;
        }
        
body {
  font-family: Arial, Helvetica, sans-serif;
  color: red;
  background-color: blue;
}
* {
  box-sizing: border-box;
}

h1 {
  padding: 10px;
  border: 3px solid black;
  border-radius: 15px;
  background-color: #0289ff;
  color: white;
}

h1:hover {
  opacity: 1;
  transform: scale(1.1);
  transition-duration: 0.5s;
}

/* Full-width input fields */
input[type="text"],
input[type="password"] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

/* Add a background color when the inputs get focus */
input[type="text"]:focus,
input[type="password"]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for all buttons */
button {
  background-color: #0289ff;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: 2px solid black;
  border-radius: 15px;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity: 1;
  transform: scale(1.1);
  transition-duration: 0.5s;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #fa1d0e;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn,
.signupbtn {
  float: left;
  width: 25%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
  background-color: #013a6b;
  color: white;
}

input {
  border-radius: 15px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: #474e5d;
  padding-top: 50px;
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* Style the horizontal ruler */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* The Close Button (x) */
.close {
  position: absolute;
  right: 35px;
  top: 15px;
  font-size: 40px;
  font-weight: bold;
  color: #f1f1f1;
}

.close:hover,
.close:focus {
  color: #f44336;
  cursor: pointer;
}

/* Clear floats */

.clearfix {
  display: flex;
  justify-content: center;
  gap: 50px;
}

.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn,
  .signupbtn {
    width: 100%;
  }
}

.home {
  display: flex;
  flex-direction: column;
  gap: 50px;
  align-items: center;
  justify-content: center;
}

.buttons {
  display: flex;
  gap: 25px;
}

body {
  background-color: #013a6b;
}
        
</style>
</head>
<body>


<center><h1>Devenir Client Inscription</h1></center>

<!-- 	<form action="resultat_formulaire.jsp"> -->
	<form:form action="Vendeur_Add_toUser_ID" modelAttribute="vendeur1">
	

		inventaire: <form:input type="text" name="inventaire" path="inventaire"/>  <form:errors path="inventaire" cssClass="error"/>
		<br>
		
		historique: <form:input type="text"  name="historique"  path="historique"/><form:errors path="historique" cssClass="error"/>
		<br>
		
		<br>
		<input type="submit" value="valider">
		
		

	</form:form>



 
</body>
</html>