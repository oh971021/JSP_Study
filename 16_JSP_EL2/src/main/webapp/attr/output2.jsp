<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td> 상품 가격 : ${param.p } </td>
		</tr>
		<tr>
			<td> 지불한 돈 : ${param.m } </td>
		</tr>
		<tr>
			<td> 잔돈 : ${rr.exchange } </td>
		</tr>
		<tr>
			<td> 멘트 : ${rr.say } </td>
		</tr>
	</table>

	<c:if test="${rr.exchange < 0}">
		<form action="ExController" method="get">
			<button name="how" value="${rr.exchange }">얼마 모자른데요?(겟)</button>
		</form>
	
		<form action="ExController" method="post">
			<button name="how" value="${ex2 }">얼마 모자른데요?(포스트) </button>			
		</form>
	</c:if>

</body>
</html>