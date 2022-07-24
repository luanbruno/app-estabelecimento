<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>app endereco</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de estabelecimento</h2>
	  
	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirmação!</strong> ${mensagem}
		</div>	  
	  </c:if>
	  <form action="/estabelecimento/incluir" method="post">
	   
	   <div class="mb-3 mt-3">
	      <label>Login:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu Login" name="login" value="luan">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com seu Nome" name="nome" value="luan bruno">
	    </div>
	     <div class="mb-3 mt-3">
	      <label>Senha:</label>
	      <input type="password" class="form-control" placeholder="Entre com sua senha" name="senha" value="123">
	    </div>
	     <div class="mb-3 mt-3">
	      <label>CNPJ:</label>
	      <input type="text" class="form-control" placeholder="Entre com seu CNPj" name="cnpj" value="1254879466000155">
	    </div>
	     <div class="mb-3 mt-3">
	      <label>Email:</label>
	      <input type="text" class="form-control" placeholder="Entre com seu email" name="Email" value="luan@luan.com">
	    </div>
	     <div class="mb-3 mt-3">
	      <label>EdTech:</label>
	      <label class="radio-inline">
                <input type="radio" name="edTech" value="1">Sim
            </label>
            <label class="radio-inline">
                <input type="radio" name="edTech" value="0">Não
            </label>
	    </div>
	  
      <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>