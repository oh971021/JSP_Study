<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 여기는 값을 받는 곳
	String a = request.getParameter("a");
	String b = request.getParameter("b");
	
	Object c = request.getAttribute("ccc");
%>
	<h1>계산결과</h1>
	<%=a %> + <%=b %> =	<%=c %>
</body>
</html>