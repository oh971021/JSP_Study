<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#loginArea { width: 400px; margin : auto; border : 1px solid black; }
	table { margin : auto; }
	td { text-align : cetner; }
</style>
</head>
<body>
	<section id="loginArea">
		<form action="sessionLogin2.jsp" method="post">
			<table>
				<tr>
					<!-- Label은 input 요소에 이름을 붙힌다.
						- label 의 for = "" 값과
						- input 의 name = "" 값이 동일해야 연결된다.	
					 -->
					<td><label for="id">아이디 :</label></td>
					<td><input type="text" name="id" id="id"></td>
				</tr>
				<tr>
					<td><label for="pass">비밀번호 :</label></td>
					<td><input type="password" name="pass" id="pass"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="로그인">
					<input type="reset" value="다시 작성"></td>
				</tr>
			</table>
		</form>
	</section>
</body>
</html>