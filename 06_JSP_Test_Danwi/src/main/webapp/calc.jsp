<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/result_1.css">
</head>
<body>
	
	<% 
	double value = Double.parseDouble(request.getParameter("value"));
	int calc = Integer.parseInt(request.getParameter("calc"));
	double result = 0;

	String format = "#.#";
	java.text.DecimalFormat df = new java.text.DecimalFormat(format);
	
	if (calc == 1) {
		result = value / 2.54;
	} else if (calc == 2) {
		result = value / 3.306;
	} else if (calc == 3) {
		result = (value * 1.8) + 32;
	} else { 
		result = value / 1.609;
	}
	
	%>
	
	<div id="wrap">
		<table border="0"> 
			<% if (calc == 1) { %>
				<tr class="header1">
			<% } else if (calc == 2) { %>
				<tr class="header2">
			<% } else if (calc == 3) { %>
				<tr class="header3">
			<% } else { %>
				<tr class="header4">
			<% } %>

				<td><h1>변환 결과</h1></td>
			</tr>
			<tr>
				<td><h1>
				<%=value %> 
				<% if (calc == 1) { %>
					cm
				<% } else if (calc == 2) { %>
					㎡
				<% } else if (calc == 3) { %>
					℃
				<% } else { %>
					km/h
				<% } %>
				</h1></td>
			</tr>
			<tr>
				<td><h1>↓</h1></td>
			</tr>
			<tr>
				<td><h1>
				<%=df.format(result) %> 
				<% if (calc == 1) { %>
					inch
				<% } else if (calc == 2) { %>
					평
				<% } else if (calc == 3) { %>
					℉
				<% } else { %>
					mi/h
				<% } %>
				</h1></td>
			</tr>
		</table>
	</div>
</body>
</html>