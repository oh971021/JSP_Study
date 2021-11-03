package com.js.reg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL ���� �Ǿ�����.
@WebServlet("/Test2")
public class Test2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Test2.java ���� (����)
		// �����ϸ� ~~~/������Ʈ��/Test2 (URL�ּ�)
		
		response.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"euc-kr\">");
		out.print("</head>");
		out.print("<body>");
		
		for (int i = 1; i <= 500; i++) {
			out.printf("<h1> ���� ���� %d </h1>", i);
			if ( i % 10 == 0 ) {
				out.print("<font color='red'><h1> ~~~~~ 10�� ���� </h1></font>");	
			}
		}
		
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
