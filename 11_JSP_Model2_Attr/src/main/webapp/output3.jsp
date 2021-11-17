<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td> <%=request.getParameter("how") %> 원 부족합니다. </td>
		</tr>
		<tr>
			<td> <%=request.getAttribute("how") %> 원 부족합니다. </td>
		</tr>
	</table>
</body>
</html>