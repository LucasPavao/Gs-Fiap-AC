<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Adicionar Viagem ${viagem.author}</title>
</head>
<body>

	<c:if test="${addViagemSucess}">
		<h3>Viagem cadastrada com sucesso. Id: ${savedViagem.id} </h3>
	</c:if>	
	
	<c:url var="save_viagem_url" value="/viagens/save"/>
	<form:form action="${save_viagem_url}" method="viagem" modelAttribute="viagem">
	
	  <form:label path="id">Id: ${id}</form:label><br>
	  <form:input type="text" path="id" readonly="true"/><br>
	  
	  <form:label path="author">Autor:</form:label><br>
	  <form:input type="text" path="author"/><br>
	  
	  <form:label path="title">Título:</form:label><br>
	  <form:input type="text" path="title"/><br>
	  
	  <input type="submit" name="salvar" value="Salvar"/>
	</form:form>
</body>
</html>