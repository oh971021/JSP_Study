<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name="";
	String value="";
	// Header에 쿠키가 생성 되어있는지 확인한다.
	String cookie = request.getHeader("Cookie");
	
	if (cookie != null) {
		// 리스폰스로 응답해서 생성 된 클라이언트의 쿠키를 배열로 가져온다.
		Cookie cookies[] = request.getCookies();
		
		// 있으면 배열에 쿠키 정보를 셋팅해준다.
			// 쿠키 배열 객체에 담긴 각각의 쿠키 객체들을 반복하면서 
			// "name" 이라는 이름을 가진 쿠키 객체를 걸러서
			// 그 값을 각각 name, value 변수에 할당한다.
		for (int i=0; i<cookies.length; i++) {
			// Test1 에서 설정해준 쿠키의 이름인 name과 같으면
			if (cookies[i].getName().equals("name")) {
				name = cookies[i].getName();
				value = cookies[i].getValue();
			}
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
	<h2>쿠키 이름 : <%=name %></h2>
	<h2>쿠키 값 : <%=value %></h2>
</body>
</html>