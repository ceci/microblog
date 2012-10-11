<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mini-twitter</title>
</head>
<body>

<div>
	<form action="novaMensagem" method="post">
		Nova mensagem:
		<input type="text" name="mensagem.descricao" class="textbox"/>
		<input type="submit" value="Publicar">
	</form>
</div>

<c:forEach var="msg" items="${mensagens}">
	<p>
		${msg.descricao }
	</p>
</c:forEach>
</body>

<style>
form {
	margin: 0px 30px;
	background-color: #9999DD;
	padding: 20px;
	font-size: 15pt;
}

p {
    background-color: #BBBBEE;
    font-size: 13pt;
    margin: 10px auto;
    padding: 20px;
    width: 700px;
}

form input {
	font-size: 15pt;
}

form .textbox {
	width: 410px;
}

div {
	clear: both;
	display: block;
	margin: 15px auto;
	max-width: 800px;
	position: relative;
}
</style>
</html>