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
		
		// ���� ������ Ÿ��
		request.getRequestDispatcher("index.html").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Model ����ϱ�
		Calc.calc(request);
		
		// ��� �� ��� â�� ������
		request.getRequestDispatcher("output.jsp").forward(request, response);
		
	}

}
