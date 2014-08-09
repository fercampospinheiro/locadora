<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login de usuário</title>

</head>
<body >

<ul>
    <c:forEach var="user" items="${usuarios}">
    <li>${user.nome}</li>
    </c:forEach>
</ul>

	<form:form  action="autentica" modelAttribute="usuario">
		<form:label path="">Email:</form:label><br>
		<form:input path="email"/><br>
		<form:label path="">Senha:</form:label><br>
		<form:password path="senha"/><br>
		<form:button type="submit">Entrar</form:button>
	</form:form>

</body>
</html>