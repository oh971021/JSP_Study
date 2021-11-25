<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/result.css">
</head>
<body>

<!-- BMI지수= 몸무게(kg) ÷ (신장(m) × 신장(m)) -->

<%
	// 멀티파트 셋팅
	String path = request.getSession().getServletContext().getRealPath("img");
	System.out.println(path);
	
	// 멀티파트 객체 생성
	MultipartRequest mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "utf-8", new DefaultFileRenamePolicy());	

	// 포스트형식 한글처리
	// request.setCharacterEncoding("utf-8");
	
	// 값 받기
	String name =  mr.getParameter("name");
	double height = Double.parseDouble(mr.getParameter("height"));
	double weight = Double.parseDouble(mr.getParameter("weight"));
	String profile = mr.getFilesystemName("profile");
	
	// 콘솔에 값 출력해보기
	System.out.println(name);
	System.out.println(height);
	System.out.println(weight);
	System.out.println(profile);	
	
	// 값 계산하고 대입
	double bmi = (weight) / ((height / 100) * (height / 100));
	// System.out.println(bmi);	

	// 값에 따른 결과 값
	String result = "비만";
	if (bmi < 18.5) {
		result = "저체중";
	} else if (bmi < 23) {
		result = "정상";
	} else if (bmi >= 23 && bmi < 25) {
		result = "과체중";
	}
%>

	<form action="index.html">
		<table border="0">
			<tr>
				<td colspan="2" id="title">BMI 결과</td>
			</tr>
			<!-- 제목 -->
				
			<tr>
				<td>사진</td>
				<td class="profile"> <img src="img/<%=profile %>" class="image"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td class="result"> <%=name %> 님 </td>
			</tr>
			<tr>
				<td>키</td>
				<td class="result"> <%=height %> cm </td>
			</tr>
			<tr>
				<td>체중</td>
				<td class="result"> <%=weight %> kg </td>
			</tr>
			<tr>
				<td>BMI</td>
				<td class="result"> <%=String.format("%20.2f", bmi) %></td>
			</tr>
			<tr>
				<td>결과</td>
				<td class="result"> <%=result %>입니다 </td>
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