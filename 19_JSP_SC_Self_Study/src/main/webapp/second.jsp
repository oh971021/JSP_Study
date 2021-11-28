<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Second!!</h1>
	
	<!-- 값이 비어있어서 parameter 와 attribute로 받아도 값은 비어있다. -->
	param : ${valueA }
	<p></p>
	attri : ${valueB }
	<p></p>
	 
	sesion : ${sessionScope.b }
	<p></p> 
	cookie : ${cookie.d.value }
	<p></p> 
	
	
	
</body>
</html>