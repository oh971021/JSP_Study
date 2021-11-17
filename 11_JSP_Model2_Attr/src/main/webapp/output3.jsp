<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%    
    request.setCharacterEncoding("UTF-8");
    String how = request.getParameter("how");
%>
<body>
	<table>
		<tr>
			<td> <%=how %> 원 부족합니다. </td>
		</tr>
	</table>
</body>
</html>