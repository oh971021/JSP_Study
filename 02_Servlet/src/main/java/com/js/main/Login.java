package com.js.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String Jid = "js";
		String Jpw = "1004";
		
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"utf-8\">");
		out.print("</head>");
		out.print("<style>");
		out.print("h2 {color : red}");
		out.print("</style>");
		out.print("<body>");
		
		out.printf("id : %s <br>", id);
		out.printf("pw : %s <br>", pw);
		
		out.print("<hr>");
		
//		if (id.equals(Jid) && pw.equals(Jpw)) {
//			out.print("<h2> �α��� ����! </h2>");
//		} else if (id.equals(Jid) && !pw.equals(Jpw)) {
//			out.print("<h2> ��� ����! </h2");
//		} else {
//			out.print("<h2'> �������� �ʴ� ȸ���Դϴ�. </h2>");
//		}
		
		if (id.equals(Jid)) {
			if (pw.equals(Jpw)) {
				out.print("<h2> �α��� ����! </h2>");
			} else {
				out.print("<script>");
				out.print("alert('��й�ȣ �����Դϴ�.')");
				out.print("history.back()");
				out.print("</script>");
				out.print("<h2> ��� ����! </h2");
			}
		} else {
			out.print("<script>");
			out.print("alert('�������� �ʴ� ȸ���Դϴ�.')");
			out.print("history.back()");
			out.print("</script>");
			out.print("<h2> �������� �ʴ� ȸ���Դϴ�. </h2>");
		}
		
		out.print("</body>");
		out.print("</html>");			
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// id�� �ѱ��� ���� ������ POST����� �ѱ� ó���� �̷��� �Ѵ�.
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String Jid = "js";
		String Jpw = "1004";
		
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"utf-8\">");
		out.print("</head>");
		out.print("<style>");
		out.print("h2 {color : red}");
		out.print("</style>");

		
		if (id.equals(Jid)) {
			if (pw.equals(Jpw)) {
				out.print("<h2> �α��� ����! </h2>");
			} else {
				out.println("<script>");
				out.println("alert('��й�ȣ �����Դϴ�.')");
				out.println("history.back()");
				out.println("</script>");
			}
		} else {
			out.println("<script>");
			out.println("alert('�������� �ʴ� ȸ���Դϴ�.')");
			out.println("history.back()");
			out.println("</script>");
		}
		
		out.print("</head>");
		
		out.print("</html>");	
		
	}

}
