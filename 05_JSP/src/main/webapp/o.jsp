<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	// Method 를 정의 할때는 %! 안에 써줘야 함 
	public int getMul(int x, int y) {
		return x * y;
	}

	public int getDiv(int x, int y) {
		return x / y;
	}
%>
<%
	// 1. 값 받기
	int x = Integer.parseInt(request.getParameter("x"));
	int y = Integer.parseInt(request.getParameter("y"));
	
	int add = x + y;
	int sub = x - y;
	int mul = getMul(x, y);
	int div = getDiv(x, y);
	
%>
<!-- 
	Mission : 합이 10이 넘었을 때만 결과가 나오게 해라
 -->
 <h1>계산 결과</h1>
 
<%	if (add > 10) { %>
	<marquee> <%=x %> + <%=y %> = <%=add %> </marquee>
	<marquee> <%=x %> - <%=y %> = <%=sub %> </marquee>
	<marquee> <%=x %> x <%=y %> = <%=mul %> </marquee>
	<marquee> <%=x %> / <%=y %> = <%=div %> </marquee>
<% } %>

</body>
</html>