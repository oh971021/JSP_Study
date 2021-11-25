<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 이 친구드 .jar 불러와서 사용하는 싸제품 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 숫자의 출력형식을 조정하는 기능 -->
	<fmt:formatNumber value="${a }" type="currency"></fmt:formatNumber>
	<hr>
	
	<!-- symbol 수정 가능 -->
	<fmt:formatNumber value="${a }" type="currency" currencySymbol="$"></fmt:formatNumber>
	<hr>
	
	<fmt:formatNumber value="${b }" type="percent"></fmt:formatNumber>
	<hr>	
	
	<fmt:formatNumber value="${b }" pattern="0.000"></fmt:formatNumber>
	<hr>
	
	<!--
		# : 값이 있으면 출력하고 없으면 생략
		0 : 값이 없을 경우 0으로 대신 출력
	 -->
	<fmt:formatNumber value="${c }" pattern="#,###.00"></fmt:formatNumber>
	<hr>	
	
	
	<!-- Date 관련 포맷은 formatDate 로 바꿔준다. -->
	<fmt:formatDate value="${d }" type="date" dateStyle="long"></fmt:formatDate>
	<hr>	
	
	<fmt:formatDate value="${d }" type="date" dateStyle="short"></fmt:formatDate>
	<hr>	

	<fmt:formatDate value="${d }" type="time" timeStyle="long"></fmt:formatDate>
	<hr>	

	<fmt:formatDate value="${d }" type="time" timeStyle="short"></fmt:formatDate>
	<hr>	

	<!-- 연, 월, 일, 시간, 분, 초 다 출력하려면 both로 출력. -->
	<fmt:formatDate value="${d }" type="both" dateStyle="long" timeStyle="long"></fmt:formatDate>
	<hr>	

	<fmt:formatDate value="${d }" type="both" dateStyle="short" timeStyle="short"></fmt:formatDate>
	<hr>	

	<fmt:formatDate value="${d }" pattern="yyyy. MM. dd / hh:mm"></fmt:formatDate>
	<hr>
	
	<table border="1" width=500px;> 
		<tr>
			<th> 과자명 </th>
			<th> 가격 </th>
			<th> 제조일 </th>
		</tr>
		<c:forEach var="s" items="${snacks }">
			<tr>
				<th> ${s.name } </th>
				<th> 
					<fmt:formatNumber value="${s.price }" type="currency"></fmt:formatNumber> 
				</th>
				<th> 
					<fmt:formatDate value="${s.date }" pattern="yyyy. MM. dd"/>
				</th>
			</tr>
		</c:forEach>
	</table>
	
	
	
	




</body>
</html>