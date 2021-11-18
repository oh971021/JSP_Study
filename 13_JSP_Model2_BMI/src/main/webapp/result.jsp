<%@page import="com.js.bmi.BmiResult"%>
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
	BmiResult bc = (BmiResult)request.getAttribute("br");
%>
<body>
	<form action="HomeController">
		<table border="0">
			<tr>
				<td colspan="2" id="title">BMI 결과</td>
			</tr>
			<!-- 제목 -->
				
			<tr>
				<td>사진</td>
				<td class="profile"> <img src="img/<%=bc.getProfile() %>" class="image"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td class="result"> <%=bc.getName() %> 님 </td>
			</tr>
			<tr>
				<td>키</td>
				<td class="result"> <%=bc.getHeight() %> cm </td>
			</tr>
			<tr>
				<td>체중</td>
				<td class="result"> <%=bc.getWeight() %> kg </td>
			</tr>
			<tr>
				<td>BMI</td>
				<td class="result"> <%=String.format("%20.2f", bc.getBmi() ) %></td>
			</tr>
			<tr>
				<td>결과</td>
				<td class="result"> <%=bc.getResult() %>입니다 </td>
			</tr>
			<!-- 레이아웃 -->
			
			<tr>
				<td colspan="2" id="button"> 
					<button> 홈으로 </button> 
				</td>
			</tr>
			<!-- 돌아가기 -->
			
		</table>
	</form>
</body>
</html>