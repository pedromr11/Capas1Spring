<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Introduzca el nombre para buscar el número de coches.</h2>

	<form action="http://localhost:8080/coches" method="post">

	<input type="text" name="nombre"/>
	
	<input type="submit">

</form>
</body>
</html>