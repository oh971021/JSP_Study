package com.js.hc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExController")
public class ExController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Exchange.MakeRightValue(request);
		request.getRequestDispatcher("output3.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 잔돈에 대해 추가 처리가 없으므로 결과 페이지로 잘 보내주기만 하면 된다.
		request.getRequestDispatcher("output3.jsp").forward(request, response);
		
	}

}
