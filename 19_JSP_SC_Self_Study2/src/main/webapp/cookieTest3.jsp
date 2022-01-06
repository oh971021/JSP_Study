<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%Cookie cookie[] = request.getCookies(); %>
</head>
<body>
	<h2>쿠키 이름 <%=cookie[1].getName() %></h2>
</body>
</html>