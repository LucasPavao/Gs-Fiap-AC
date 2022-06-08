<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<p>Listagem de Viagens</p>
	
	<p><a href="viagens/form">Adicionar nova viagem</a></p>		
	
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Título</th>
				<th>Autor</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="viagem" items="${viagens}">
				<tr>
					<td>${viagem.id}</td>
					<td>${viagem.title}</td>
					<td>${viagem.author}</td>
					<td><a href="viagens/${viagem.id}">Edit</a></td>
					<td><a href="viagens/${viagem.id}/delete">Apagar</a></td>
				</tr>
			</c:forEach>
		</tbody>
		
		
	</table>
</body>
</html>