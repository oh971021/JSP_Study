<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie cookie = new Cookie("language", request.getParameter("language"));
	cookie.setMaxAge(60*60*24);
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	location.href="cookieExample1.jsp"
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>