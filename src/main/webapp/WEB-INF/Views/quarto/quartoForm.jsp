<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Quartos</title>
</head>
<body>
	<form action="/hotelSunshine/quarto/createQuarto" method="post">
		<div>
			<label> Nome do quarto </label>
			<input type="text" name="nome" >
		</div>	
	    	<label> quantidade de pessoas </label>
			<input type="text" name="qtdPessoas" >
		<div>	
			<label> Tipo de cama </label>
			<input type="text" name="tipoDeCama" >
		</div>
		<div>	
			<label> status </label>
			<input type="text" name="status" >
		</div>
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>