<%@page import="com.js.self.Re"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<% Re r = (Re)request.getAttribute("re"); %>
<body>
	<h1> <%=r.getX() %> <%=r.getC() %> <%=r.getY() %> = <%=r.getR() %> </h1>	
	
	<!-- 결과를 2로 나눠서 출력하기 -->
	
	<form action="DivController">
		<button name="result" value="<%=r.getR() %>">2로 나누기</button>
	</form>

</body>
</html>