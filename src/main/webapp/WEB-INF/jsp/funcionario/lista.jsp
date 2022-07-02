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
		<h2>Lista de funcionarios</h2>
		<h3>Total dos funcionarios: ${lista.size()}</h3>


		<table class="table table-striped">
			<thead>
				<tr>
					<th>cpf</th>
					<th>email</th>
					<th>telefone</th>

					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="f" items="${lista}">
					<tr>
						<td>${f.id}</td>
						<td>${f.nome}</td>
						<td>${f.sigla}</td>
						<td><a href="/funcionario/${f.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>