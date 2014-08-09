<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Clientes</title>
</head>
<body>
	<form:form modelAttribute="cliente">
	
		<form:label path="">nome</form:label>
		<form:input path="nome"/>	
		<form:label path="">Endereço :</form:label>
		<form:input path="endereco.logradouro"/>
		<form:label path="">numero :</form:label>
		<form:input path="endereco.numero"/>
		<form:label path="">bairro :</form:label>
		<form:input path="endereco.bairro"/>
		<form:label path="">cidade :</form:label>
		<form:input path="endereco.cidade"/>
		<form:label path="">estado :</form:label>
		<form:input path="endereco.uf"/>
		<form:label path="">status do cliente :</form:label>
		<form:option value="statuscliente">ATIVO</form:option>		
		<form:option value="stauscliente">ATIVO</form:option>
		<form:button type="submit">enviar</form:button>
	
	</form:form>

</body>
</html>