<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appendereco</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Lista de funcionario</h2>
		
		<form action="/funcionario" method="get">
				<button type="submit" class="btn btn-primary">Novo</button>
			</form>
		
		
		<h3>Total dos funcionario: ${lista.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>cnpj</th>
					<th>endereco</th>
					<th>edtech</th>
					<th>Nome</th>
					<th>CPF</th>
					<th>Login</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="e" items="${lista}">
					<tr>
						<td>${e.cpf}</td>
						<td>${e.email}</td>
						<td>${e.telefone}</td>
						<td>${e.nome}</td>
						<td>${e.login}</td>
						<td>${e.senha}</td>
						<td></td>
						<td><a href="/funcionario/${e.id}/excluir">excluir</a></td>


					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>