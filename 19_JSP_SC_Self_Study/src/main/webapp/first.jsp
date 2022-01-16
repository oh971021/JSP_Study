<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>First!</h1>
	
	param : ${param.a }
	<p></p>
	attri : ${a }
	<p></p> 
	sesion : ${sessionScope.b }
	<p></p> 
	cookie : ${cookie.d.value }
	<p></p> 
	
	<form action="CC">
		<h1><button>Move to Second</button></h1>
	</form>
	
</body>
</html>