<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
<%-- 
	# .jsp에 자바를 쓰는 경우
		= 값 읽을 때
		= 출력형식 때문에
		= 조건문, 반복문

	# EL (Expresstion Language) : view에서 java 코드를 빼기 위해
		= 값 읽을 때
		= 연산자 사용 가능
		= import 없어도 됨
		= 값이 없으면 넘어감 : 리퀘스트 안에 없는 값은 넘어간다.
		
	# EL로 읽는 방법
		= Parameter 읽기 : ${param.이름}
		= Attribute 읽기 : ${어트리뷰트 이름}
		= 객체 읽기 : ${이름.멤버변수}
		
	# 기본형[] , ArrayList<Type> : ${이름[인덱스]}
	        		    객체 [] : ${이름[인덱스].멤버변수}
		
		
 --%>
	
	<!-- 파라미터 값 그대로 사용하기 -->
	이름 : ${param.name} <br>
	중간 : ${param.mid} <br>
	기말 : ${param.last} <br>
	
	<!-- 어트리뷰트에 있는 객체 값 그대로 사용하기 -->
	평균 : ${re.avg} <br>
	등급 : ${re.grade}
	<hr>
	
	<!-- 어트리뷰트 값 그대로 사용하기 -->
	a : ${a} <br>
	b : ${b} <br>
	c : ${c[1]} 
	<hr>
	
	<!-- 어트리뷰트에 있는 배열 객체 그대로 사용하기 -->
	d1 : ${d[0].name} <br>
	d2 : ${d[1].grade}
	<hr>
	
	<!-- 어트리뷰트에 있는 어레이리스트 그대로 사용하기ㅇ -->
	e1 : ${e[0].name } <br>
	e2 : ${e[1].name } <br>
	e3 : ${e[2].name } 
	<hr>
	
</body>
</html>