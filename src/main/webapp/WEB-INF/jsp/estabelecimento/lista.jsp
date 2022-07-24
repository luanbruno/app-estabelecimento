<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
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
		<h2>Lista de estabelecimento</h2>
		<security:authorize access="hasRole('ADMIN')">
		<form action="/estabelecimento" method="get">
				<button type="submit" class="btn btn-primary">Novo</button>
			</form>
		</security:authorize>
		
		<h3>Total dos estabelecimento: ${lista.size()}</h3>

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
						<td>${e.cnpj}</td>
						<td>${e.endereco}</td>
						<td>${e.edTech}</td>
						<td>${e.nome}</td>
						<td>${e.login}</td>
						<td>${e.senha}</td>
						<security:authorize access="hasRole('ADMIN')">
						<td><a href="/estabelecimento/${e.id}/excluir">excluir</a></td>
						</security:authorize>

					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>