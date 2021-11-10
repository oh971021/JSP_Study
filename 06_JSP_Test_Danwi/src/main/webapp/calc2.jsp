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
	double result = value / 1.609;
	String cn = "c4";
	String color = "gray";
	String unit1 = "km/h";
	String unit2 = "mi/h";
	
	String format = "#.#";
	java.text.DecimalFormat df = new java.text.DecimalFormat(format);
	
	if (calc == 1) {
		result = value / 2.54;
		unit1 = "cm";
		unit2 = "inch";
		cn = "c1";
		color = "red";
	} else if (calc == 2) {
		result = value / 3.306;
		unit1 = "㎡";
		unit2 = "평";
		cn = "c2";
		color = "blue";
	} else if (calc == 3) {
		result = (value * 1.8) + 32;
		unit1 = "℃";
		unit2 = "℉";
		cn = "c3";
		color = "green";
	}
	
	%>
	
	<div id="wrap">
		<table style="border-color: <%=color %>" border="0"> 
			<tr class=<%=cn %>>
				<td><h1>변환 결과</h1></td>
			</tr>
			<tr>
				<td><h1>
				<%=value %> 
				<%=unit1 %>
				</h1></td>
			</tr>
			<tr>
				<td><h1>↓</h1></td>
			</tr>
			<tr>
				<td><h1>
				<%=df.format(result) %> 
				<%=unit2 %>
				</h1></td>
			</tr>
		</table>
	</div>
</body>
</html>