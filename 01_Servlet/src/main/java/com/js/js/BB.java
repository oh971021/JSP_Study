package com.js.js;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @xxx : anotation - �ڵ����� ���� ����

// servlet 2.x �� ��� �� ���
// 		   3.x ���ķδ� @WebServlet ���� ��ü ��� ����

// Tomcat 5.x ���� : ��Ĺ ���� ���Ͽ� ���� ��� �� ���

// /~~ �� ������ �ּҸ� ��Ÿ���ش�.
// �׷��� �� Ŭ������ �ּҸ� BB�� ��������� ��.
@WebServlet("/BB")
public class BB extends HttpServlet {
// ������̼� ���ǻ���
	// 1. �����ص� �ȹٲ��� �������� �ٲ���� �� (CTRL+C,V)
	// 2. �����ͷ� �ٲ㵵 �������� �ٲ���� �� (RENAME)
	
	// Get �޼ҵ�
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

	// Post �޼ҵ�
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

}
