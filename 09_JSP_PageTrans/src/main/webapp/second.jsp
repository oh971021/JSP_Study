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
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));
	int c = a + b;
	
/* 
	요청 처리 값
	
	1) Parameter : HTML 에서 만든 값
		: 자료형 String, String[]
		: 그 값이 request 객체에 실려서 전송
		
	상황 : second에서 만든 c를 thrid 에서 사용하고 싶음. (파라미터로 받은 값을 계산해서 다른 곳에서 쓰고 싶음)
	2) attribute : JAVA 에서 만든 값
		: Object(객체)면 다 된다.
		: 그 값이 request 객체에 실려서 전송	
*/
		request.setAttribute("ccc", c);	


/*
		// 페이지 자동으로 이동하는 법 (자동이동시리즈)
		
		(1) redirect : 공사 중, 페이지 개선 중
			// response.sedRedirect("third.jsp");
	
		(2) forward : 이 친구를 제일 많이 사용 함.
			: first에서 second로 넘어올 때 요청한 정보를 third까지 넘겨준다.
			// RequestDispatcher rd = request.getRequestDispatcher("third.jsp");
			// rd.forward(request, response);
			
		(3) includ : 어떤 JSP 속에 다른 JSP 포함
			// rd.include(request, response);
*/
	RequestDispatcher rd = request.getRequestDispatcher("third.jsp");
	// 아규먼트로 리퀘스트, 리스폰스를 보냄으로 파라미터를 그대로 보내준다.
	rd.forward(request, response);
	
	// = forward를 많이 사용하는데, first에서 second로 넘어온 request까지 third로 보내줌
			// request에 값이 실려 넘어오는 건데 그 request까지 같이 넘겨서 third가 그 값을 쓸 수 있음.
			
	// = redirect는 그냥 페이지만 넘기는 것
	
	// = include는 위치 조정이 안되고, 가장 위에 출력된다.
		// 나중에 위치 조절이 되는 다른 include가 있음.
	
%>
	<h1>Second Page</h1>
<%=c %>
<% // rd.include(request, response); %>
</body>
</html>