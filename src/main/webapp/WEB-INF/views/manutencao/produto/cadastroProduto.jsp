<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="../resources/bootstrap/3_1_1/css//bootstrap-responsive.css" rel="stylesheet">
<link href="../resources/bootstrap/3_1_1/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../resources/bootstrap-tagsinput/bootstrap-tagsinput.css" rel="stylesheet" media="screen">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css">
<link rel="stylesheet" href="http://bootsnipp.com/css/bootsnipp.css?ver=3dad078c6953f3a8a72bbfccae6365ae">

<title>Cadastro de Produtos</title>

</head>
<body>
 <div class="container">
	<form:form modelAttribute="produto" cssClass="form-horizontal" >
		<fieldset>
		
			<!-- Nomr do Formulário -->
			<legend>Cadastro de Produtos</legend>
			
			<!-- Text -->
			<div class="form-group">
			  <form:label cssClass="col-md-4 control-label" path="">nome</form:label> 
			  <div class="col-md-4">
			  <form:input path="nome" cssClass="form-control input-md" />  
			  </div>
			</div>
			
			<!-- Select Multiplo -->
			<div class="form-group">
			  <form:label cssClass="col-md-4 control-label" path="">Fornecedores :</form:label>
			  <div class="col-md-4"> 
				<form:select path="produto.fornececedor.id" cssClass="form-control" multiple="multiple" data-role="tagsinput">
					<c:forEach var="fornecedor" items="${fornecedores}">	
						<form:option value="${fornecedor.nome}" itemLabel="nome" itemValue="id">${fornecedor.nome}</form:option>
					</c:forEach>	
				</form:select>	
			  </div>
			</div>
			
			<!-- Select Multiplo -->
			<div class="form-group">
			  <form:label cssClass="col-md-4 control-label" path="">Categorias :</form:label>
			  <div class="col-md-4">
			    <form:select path="produto.categoria.id" cssClass="form-control" multiple="multiple" data-role="tagsinput" >
					<c:forEach var="categoria" items="${categorias}" varStatus="index">
						<form:option  value="${categoria.nome}" itemLabel="nome" itemValue="id">${categoria.nome}</form:option>
					</c:forEach>
				</form:select>	
			  </div>
			</div>
			
			<!-- Botão -->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="gravarProduto"></label>
			  <div class="col-md-4">
			    <form:button type="submit" class="btn btn-primary">Gravar</form:button>
			  </div>
			</div>
			
		</fieldset>
	</form:form>
		
<script type="text/javascript">
	$("select").tagsinput("");
</script>

		
</div>
 	<!-- Jquery e Bootstrap -->
 	<script src="../resources/jquery/2_1_1/jquery-2.1.1.min.js"></script>
  	<script src="../resources/bootstrap/3_1_1/js/bootstrap.min.js"></script>
	<script src="../resources/bootstrap-tagsinput/bootstrap-tagsinput.min.js"></script>
	<script src="http://bootsnipp.com/js/scripts.min.js"></script>
</body>
</html>