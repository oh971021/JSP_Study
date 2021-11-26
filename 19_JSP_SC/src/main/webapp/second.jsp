<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Second</h1>

	파라미터 : ${param.a }
	<p></p>
	어트리뷰트 : ${b }
	<p></p>

	<!-- 여기서부터는 새로운 리퀘스트로 이어진다. -->
	<a href="ThirdC">ThirdC로 get 요청</a>

</body>
</html>