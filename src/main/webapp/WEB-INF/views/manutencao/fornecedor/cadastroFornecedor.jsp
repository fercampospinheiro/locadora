<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Fernando_2
  Date: 09/07/2014
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Fornecedores</title>
</head>
<body>
    <form:form modelAttribute="Fornecedor">

        <form:label path="">nome</form:label>
        <form:input path="nome"/>

    </form:form>
</body>
</html>
