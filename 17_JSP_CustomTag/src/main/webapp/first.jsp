<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	
	# .jps에 java를 쓰는 이유
		1. 값을 읽으려고 - EL로 해결
      
      - CustomTag 로 해결 -
		2. 출력형식 때문에 
		3. 조건문, 반복문
		4. 이동하려고 
	  -------------------
	
	# Custom Tag 
		- DOM객체 모양 (HTML과 유사하다)
		- 실행 시 자바코드로 바뀌어서 실행 됨
		- .jsp(view) 에서만 사용 
		- 생김새 
			<접두어 : xxx></접두어 : xxx>
			ex ) <jsp:include page="second.jsp"></jsp:include>	
	# Custom Tag 종류
		1. JSP 표준 액션 태그 (정품)
			- .jsp에서 기본적으로 사용 가능
			
		2. jstl (jsp + html) (싸제)
			- 
		
 -->
 	<% // request.getRequestDispatcher("second.jsp").include(request, response); %>
 	<h1>First Page</h1>
 	<%-- <jsp:forward page="second.jsp"></jsp:forward> --%>
 	<!-- redirect는 표준 액션 태그에 없음. 자동이동은 forward로 처리 -->
 	<jsp:include page="second.jsp"></jsp:include>
 
 
</body>
</html>