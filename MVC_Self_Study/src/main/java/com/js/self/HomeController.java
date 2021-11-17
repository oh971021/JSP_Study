package com.js.self;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 실행 리모콘 타워
		request.getRequestDispatcher("index.html").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Model 계산하기
		Calc.calc(request);
		
		// 계산 후 결과 창을 보내기
		request.getRequestDispatcher("output.jsp").forward(request, response);
		
	}

}
