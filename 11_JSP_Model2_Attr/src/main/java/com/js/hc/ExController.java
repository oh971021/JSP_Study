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
		
		request.getRequestDispatcher("output3.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// �ܵ��� ���� �߰� ó���� �����Ƿ� ��� �������� �� �����ֱ⸸ �ϸ� �ȴ�.
		request.getRequestDispatcher("output3.jsp").forward(request, response);
		
	}

}
