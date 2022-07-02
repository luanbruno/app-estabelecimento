<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppMIT</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de usuarios</h2>
		
		<form action="/endereco" method="get">
			<label>Endereco:</label>
		  	<button type="submit" class="btn btn-primary">Novo</button>
	  </form>



	<c:if test="${not empty lista}">		
		<h2>Total de usuario: ${lista.size()}</h2>
		  
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>nome</th>
		        <th>login</th>
		        <th>senha</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="u" items="${lista}">
			      <tr>
			        <td>${u.id}</td>
			        <td>${u.nome}</td>
			        <td>${u.login}</td>
			        <td>${u.senha}</td>
			        <td><a href="/usuario/${e.id}/excluir">excluir</a> </td>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h2>Não existem usuarios cadastrados!!!</h2>
	</c:if>

	</div>
</body>
</html>