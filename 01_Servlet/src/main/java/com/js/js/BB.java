package com.js.js;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @xxx : anotation - 자동으로 뭔가 해줌

// servlet 2.x 는 등록 후 사용
// 		   3.x 이후로는 @WebServlet 으로 대체 사용 가능

// Tomcat 5.x 이전 : 톰캣 설정 파일에 따로 등록 후 사용

// /~~ 는 도메인 주소를 나타내준다.
// 그래서 이 클래스의 주소를 BB로 지정해줘야 함.
@WebServlet("/BB")
public class BB extends HttpServlet {
// 어노테이션 주의사항
	// 1. 복붙해도 안바껴서 수동으로 바꿔줘야 함 (CTRL+C,V)
	// 2. 리펙터로 바꿔도 수동으로 바꿔줘야 함 (RENAME)
	
	// Get 메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"euc-kr\">");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1> Hello JSP </h1>");
		out.print("</body>");
		out.print("</html>");
		
		
		
		
		
		
		
		
		
		
		
	}

	// Post 메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

}
