package com.js.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

@WebServlet("/Reg")
public class Reg extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		// 1. ���� �ޱ�
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		String[] hobby = request.getParameterValues("hobby");
		String intro = request.getParameter("intro");
		
		// 2. ���� �� Ȯ���ϱ�
//		System.out.println(name);
//		System.out.println(id);
//		System.out.println(pw);
//		System.out.println(gender);
//		System.out.println(address);
//		System.out.println(Arrays.toString(hobby));
//		System.out.println(intro);
		
		// 3. ���� �� ��� ����ϱ�
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"utf-8\">");
		out.print("</head>");
		out.print("<body>");
		
		out.print("�̸� : " + name + "<br>");
		out.print("���̵� : " + id + "<br>");
		out.print("��й�ȣ : " + pw + "<br>");
		out.print("���� : " + gender + "<br>");
		out.print("�ּ� : " + address + "<br>");
		out.print("��� : ");
		for (String s : hobby) {
			out.print(s + ", ");
		}
		out.print("<hr>");
		
		// ��� ������ ���ͱ��� ����ϴ� ���.
		intro = intro.replace("\r\n", "<br>");
		out.print("�ڱ�Ұ� : <br>" + intro);
		
		out.print("</body>");
		out.print("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ����Ʈ �ѱ� ó��
		request.setCharacterEncoding("utf-8");
		
		// 1. ���� �ޱ�
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		String[] hobby = request.getParameterValues("hobby");
		String intro = request.getParameter("intro");
		
		// 2. ���� �� Ȯ���ϱ�
//		System.out.println(name);
//		System.out.println(id);
//		System.out.println(pw);
//		System.out.println(gender);
//		System.out.println(address);
//		System.out.println(Arrays.toString(hobby));
//		System.out.println(intro);
		
		// 3. ���� �� ��� ����ϱ�
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"utf-8\">");
		out.print("<link rel=\"stylesheet\" href=\"reg.css\">");
		out.print("</head>");
		out.print("<body>");
		
		out.print("<table border=\"1\">\r\n"
				+ "			<tr>\r\n"
				+ "				<td colspan=\"2\">���ԿϷ�!</td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td>�̸� </td>\r\n"
				+ "				<td> "+ name +" </td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td>ID </td>\r\n"
				+ "				<td> "+ id +" </td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td>PW </td>\r\n"
				+ "				<td> \r\n"
				+ "					"+ pw +""
				+ "				</td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td>���� </td>\r\n"
				+ "				<td> \r\n"
				+ "					"+ gender 
				+ "				</td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td>�ּ� </td>\r\n"
				+ "				<td> \r\n"
				+ "					"+ address
				+ "				</td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td>���ɻ� </td>\r\n"
				+ "				<td> \r\n");
				
				for (String s : hobby) {
					out.print(s + "  ");
				}
				
				out.print("				</td>\r\n"
				+ "			</tr>\r\n"
				+ "			<tr>\r\n"
				+ "				<td>�ڱ�Ұ� </td>\r\n"
				+ "				<td> " + intro.replace("\r\n", "<br>")
				+ " </td>\r\n"
				+ "			</tr>\r\n"
				+ "		</table>");
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
