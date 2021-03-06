package com.js.hc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 리퀘스트 받았을 때, 파라미터가 있는지 없는지 학인하는 문구
		// !NOT으로 뒤집었기 떄문에 현재는 파라미터가 없다는 뜻
		if(!request.getParameterNames().hasMoreElements()) {
			request.getRequestDispatcher("index.html").forward(request, response);			
		} else {
			M.calc(request);			
			request.getRequestDispatcher("output.jsp").forward(request, response);
		}

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
