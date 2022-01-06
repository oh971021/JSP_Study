<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String language = "Korea";
	String cookie = request.getHeader("Cookie");
	
	if (cookie != null) {
		Cookie cookies[] = request.getCookies();
		
		for (int i=0; i < cookies.length; i++) {
			if(cookies[i].getName().equals("language"));
			language = cookies[i].getValue();
		}
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%if (language.equals("Korea")) { %>
		<h3>안녕하세요 쿠키 예제입니다.</h3>
	<%} else { %>
		<h3>Hello Cookie example.</h3>
	<%} %>
	
	<form action="cookieExample2.jsp">
		<input type="radio" name="language" value="Korea" <%if(language.equals("Korea")) { %>checked<% } %>> 한국어 페이지 보기
		<input type="radio" name="language" value="English" <%if(language.equals("English")) { %>checked<% } %>> 영어 페이지 보기
		<input type="submit" value="설정">
	</form>
</body>
</html>