package com.js.fu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/FileUpload")
public class FileUpload extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
				
	// 1. �� �ޱ� 
	//	( enctype�� ���� request ����� �޶���. )
		// = ����ڰ� ������ ������ ������ ���� ��� (������ ��� ��)
									// ������ ��ǻ�� ����, ��Ĺ �������� ��θ� ������
		
		// String path = "C:\\user\\Desktop";
		
		// �Ʒ� PATH ������ ���� ��Ĺ ������ �ִ� ���� ��ġ���ִ� ��
		String path = request.getSession().getServletContext().getRealPath("img");
		System.out.println(path);		
		
		// ���� ���ε� -> cos.jar (multipart)
		// �̹� ���ε� ��� ó�� ����
		MultipartRequest mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "utf-8", new DefaultFileRenamePolicy());
												// (��û, ���, ó������ �ִ� ���뷮 byte ���� (������ �����߻�) , ���ڵ���� (�ѱ�ó��), ��ü �ҷ�����)
																														// �������� ���ϸ� �ߺ��Ǵ� ��Ȳ ó��
																														// a.jpg a1.jpg a2.jpg ...
		// �ڽ� ���� �� Multipart ��ü�� ���ؼ� �����ؾ� ��.
		String name = mr.getParameter("n");
		System.out.println(name);

		// ���� ���� ��
			// �ߺ� �ȵǰ� ó���� �� ������ �Ŀø� �� �����̸��� �߿����� ����.
			// ���� �� ������ �ö� ���ϸ��� �߿�
		String file = mr.getFilesystemName("f");
		System.out.println(file);
		
		String etc = mr.getFilesystemName("e");
		System.out.println(etc);
		
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><meta charset=\"utf-8\"></head><body>");
		
		out.print("<h1>"+ name +"</h1>");
		out.printf("<img src='img/%s' width=200px>", file);
		out.printf("<a href='img/%s'>��������</a>", file);
		out.printf("<a href='img/%s'>�ٿ�ε�</a>", etc);
		
		out.print("</body>");
		out.print("</html>");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
