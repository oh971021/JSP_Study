<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Third</h1>

	파라미터 : ${param.a }
	<p></p>
	어트리뷰트 : ${b }
	<p></p>
	
	<!-- session Attribute 는 스코프를 사용해서 학인한다. -->
	세션 : ${sessionScope.c } 
	<p></p>
	쿠키 : ${cookie.d.value }
	
	
</body>
</html>