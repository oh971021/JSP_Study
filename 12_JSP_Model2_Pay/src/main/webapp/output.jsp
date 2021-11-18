<%@page import="com.js.hc.Remain"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	Remain r = (Remain)request.getAttribute("r");
%>
<body>
	<table>
		<tr>
			<td> 번 돈 : <%=r.getE() %></td>
		</tr>
		<tr>
			<td> 쓴 돈 : <%=r.getS() %></td>
		</tr>
		<tr>
			<td> 남은 돈 : <%=r.getR() %> </td>
		</tr>
	</table>
</body>
</html>