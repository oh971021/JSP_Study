<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	String path = request.getSession().getServletContext().getRealPath("img");
	System.out.println(path);
	
	// 멀티파트 객체 생성
	MultipartRequest mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "utf-8", new DefaultFileRenamePolicy());			
	String profile = mr.getFilesystemName("profile");
%>
<body>
	<img src="img/<%=profile %>" class="image">
</body>
</html>