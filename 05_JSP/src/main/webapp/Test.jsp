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
	
	JSP ( Java Server Program/Page ) : 자바기반 프로그래밍
	.jsp ( java servlet page ) : 확장자는 서블릿 자바를 가르킴
	
	Servlet : JAVA 안의 HTML (자바베이스에서 HTML 작업)
	JSP : HTML 안의 JAVA (HTML베이스에서 자바 작업)
		-> Servlet 이 불편해서 나온 것
		-> Tomcat이 Servlet 으로 바꿔서 실행 해준다.	
		
 -->
 
 <%
 	int a = 10 + 20;
 %> <!-- 일반 작업 할 때 -->
 
<!-- 데이터 출력할 때 -->
<h1> <%=a %> </h1>


 
</body>
</html>