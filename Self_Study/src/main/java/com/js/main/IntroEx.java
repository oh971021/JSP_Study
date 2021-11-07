package com.js.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/IntroEx")
public class IntroEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public IntroEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		
		// POST ����� �ѱ�ó�� (RQ Encoding)
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// ���� �ΰ� �̻��̸� �Ķ���͸� �迭�� �޴´�.
		String[] hobbys = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		
		// ContentType : �� ������ �ؼ�, ���
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.write("<html><head></head><body>");
		out.write("�̸� : " + name + "<br/>");
		out.write("���̵� : " + id + "<br/>");
		out.write("��й�ȣ : " + pw + "<br/>");
		// �迭�� ��� ���� ��� �ϴ� �޼ҵ� (toString)
		out.write("��� : " + Arrays.toString(hobbys) + "<br/>");
		out.write("���� : " + major + "<br/>");
		out.write("</body></html>");
		
		out.close();
	}

}
