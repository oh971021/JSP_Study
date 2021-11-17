<%@page import="com.js.hc.Result"%>
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
	Result r = (Result)request.getAttribute("rr");
%>
	<table>
		<tr>
			<td> 상품 가격 : <%=r.getPrice() %> </td>
		</tr>
		<tr>
			<td> 지불한 돈 : <%=r.getMoney() %> </td>
		</tr>
		<tr>
			<td> 잔돈 : <%=r.getExchange() %> </td>
		</tr>
		<tr>
			<td> 멘트 : <%=r.getSay() %> </td>
		</tr>
	</table>
	
<!-- 버튼을 눌렀을 때 output3.jps
	1. 돈이 모자를때만 나오게
	2. 잔돈 안내  -->

	<% if (r.getPrice() > r.getMoney()) { 
		// int how = r.getPrice() - r.getMoney();
		int how = (Integer)request.getAttribute("ex2");
	%>
		<a href="output3.jsp?how=<%=how %>">
			<button>얼마 모자른데요? (a tag : get)</button>
		</a>	<p>
		
		<button onclick="location.href='output3.jsp?how=<%=how %>'">얼마 모자른데요? (onclick : get)</button> <p>
		
		<form action="output3.jsp" method="post">
			<input name="how" type="hidden" value="<%=how %>">
			<button>얼마 모자른데요? ( form : post )</button>
		</form> <p>
		
		<form action="output3.jsp" method="post">
			<button name="how" value="<%=how %>">얼마 모자른데요? ( form : post )</button>
		</form> <p>
		
		<form action="ExController" method="post">
			<button name="how" value="<%=how %>">얼마 모자른데요? ( form.MVC : post )</button>			
		</form>
		
		<form action="ExController">
			<button name="how" value="<%=r.getExchange() %>">얼마 모자른데요? ( form.MVC2 : post )</button>			
		</form>
		
	<% } %>
</body>
</html>