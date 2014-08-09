<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Categorias</title>
</head>
<body>
	<form:form modelAttribute="categoria">
		<form:label path="">Nome</form:label>
		<form:input path="nome"/>
		<form:label path="">Produtos :</form:label>
        <c:forEach var="produto" items="${Produtos}">
		<form:select path="categoria.produto[0].nome">
            <form:option value="${produto.nome}" label="${produto.nome}"/>
        </form:select> 
		</c:forEach>
		<form:button type="submit">enviar</form:button>
	
	</form:form>
	
</body>
</html>