<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- prefix : 접두어 설정 / uri : 어떤거 가져올지 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 
	
	# 20살이 넘으면 어서오세요
	# 20살 미만이면 어서와
		= if문, html에선 사용하기 싫다.
		
	# CustomTag
		1. JSP 표준 액션 태그 (정품) : include
		
		2. CustomTag (싸제) : 기본으로 생각하면 됨.  
			- JSTL ( Jsp Standard Tag Library )
			- .jar 가져와서 사용함. ( https://mvnrepository.com/ ) 
			- core : if, for (핵심문법)
-->
<body>
	<h1>당신은 ${age }살 입니다.</h1>
	<!-- 20살이 넘으면 '안녕하세요' -->
	<c:if test="${age >= 20}">
		<h1>안녕하세요</h1>
	</c:if>
<%-- 	<c:otherwise>
		<h1>이거 else인데 나오나?</h1>
	</c:otherwise> --%>
	
	<!-- if, else if문을 CustomTag로 사용하는 법 -->
	<c:choose>
		<c:when test="${age >= 20}">
			<h1>어서오세요</h1>
		</c:when>
		<c:when test="${age >= 10}">
			<h1>어서와</h1>
		</c:when>
		<c:otherwise>
			<h1>길 잃었니?</h1>
		</c:otherwise>
	</c:choose>
	
	<hr>
	
	<!-- JSTL의 단점 : For문의 역순이 안됨 -->
	<c:forEach var="i" begin="1" end="${age }" step="3">
		${i }
	</c:forEach>

	<hr>

	<!-- 배열과 for문을 html에서 사용하기 -->
	<c:forEach var="c" items="${ar }">
		${c }
	</c:forEach>
	
	<hr>
	
	<!-- 게시판의 기초 -->
	<c:forEach var="m" items="${menus }">
		${m.name }
		${m.price }
	</c:forEach>

	<hr>
	
	<!-- 게시판 심화 -->
	<table border="1">
		<tr>
			<td> 메뉴명 </td>
			<td> 가격 </td>
		</tr>
		<c:forEach var="m" items="${menus }">
			<tr>
				<td> ${m.name } </td>
				<td> ${m.price } </td>
			</tr>
		</c:forEach>
	</table>
	
	
	
	


</body>
</html>