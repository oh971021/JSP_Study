package com.js.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// C (Controller) - ��������
// ��Ȳ �Ǵ� �� �ʿ��� ������ ����

// ������Ʈ�� ������(������)
@WebServlet("/C")
public class C extends HttpServlet {
	
	// �ּҸ� �ļ� �����ϰų�, Ŭ���ؼ� ���� ��� (GET)
//		: ��� ����Ʈ�� ó������ ��δ� get��û 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get��� ��û ������ v.html�� ������
		
		// 1) response.sendRedirect("v.html");
			// �� ó�� �����ϴ� ��θ� ������ �� ��� ����������
			// �������ʹ� �ٷ� forward�� ����. �׷��� �׳� ÷���� ������ �� ������ ��
		
		// 2) request.getRequestDispatcher("v.html");
		request.getRequestDispatcher("v.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		M.calc(request);
		
		// M���� �� ���� �޾Ƽ� v2�� ������
		request.getRequestDispatcher("v2.jsp").forward(request, response);
		
	}

}
