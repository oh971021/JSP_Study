package com.js.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// C (Controller) - 교통정리
// 상황 판단 후 필요한 곳으로 전달

// 웹사이트의 진입점(시작점)
@WebServlet("/C")
public class C extends HttpServlet {
	
	// 주소를 쳐서 접속하거나, 클릭해서 들어가는 경우 (GET)
//		: 어느 사이트든 처음들어가는 경로는 get요청 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get방식 요청 들어오면 v.html로 포워딩
		
		// 1) response.sendRedirect("v.html");
			// 맨 처음 접속하는 경로를 지정할 때 사용 가능하지만
			// 다음부터는 바로 forward를 쓴다. 그래서 그냥 첨부터 끝까지 다 포워드 씀
		
		// 2) request.getRequestDispatcher("v.html");
		request.getRequestDispatcher("v.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		M.calc(request);
		
		// M에서 온 값을 받아서 v2로 보낸다
		request.getRequestDispatcher("v2.jsp").forward(request, response);
		
	}

}
