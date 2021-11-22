<%@page import="com.js.dan.Result"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/result.css">
</head>
<%
	Result r = (Result)request.getAttribute("re");
%>
<body>
	<div id="wrap">
		<table border="0"> 
			<tr>
				<td style="background-color: <%=r.getColor() %>; color: white;"><h1>변환 결과</h1></td>
			</tr>
			<tr>
				<td><h1>
				<%=r.getValue() %>
				<span class="<%=r.getCn() %>"> <%=r.getUnit1() %> </span>
				</h1></td>
			</tr>
			<tr>
				<td><h1>↓</h1></td>
			</tr>
			<tr>
				<td><h1>
				<%=String.format("%.2f", r.getResult()) %>
				<span class="<%=r.getCn() %>"> <%=r.getUnit2() %> </span>
				</h1></td>
			</tr>
		</table>
	</div>
</body>
</html>