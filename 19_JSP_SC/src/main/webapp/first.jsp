<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>First!!</h1>
	
	<a href="SecondC">(a 태그) SecondC로 get방식 요청</a>
	<hr>
	
	<form action="SecondC">
		<input name="a">
		<button>(form 태그) SecondC로 get방식 요청</button>
	</form>
	<hr>
	
	<h2 onclick="location.href='SecondC?a=ㅎㅅㅎ'">(js : onclick) SecondC로 ㅎㅅㅎ보내기</h2>
	<a href="SecondC?a=ㅋㅅㅋ">(a 태그) SecondC로 ㅋㅅㅋ 보내기</a>
	
	
	
</body>
</html>