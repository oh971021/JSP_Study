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
				
	// 1. 값 받기 
	//	( enctype에 따라 request 방식이 달라짐. )
		// = 사용자가 보내준 파일을 저장할 폴더 경로 (절대경로 써야 함)
									// 개발자 컴퓨터 말고, 톰캣 서버상의 경로를 적어줌
		
		// String path = "C:\\user\\Desktop";
		
		// 아래 PATH 설정은 실제 톰캣 서버가 있는 곳에 설치해주는 것
		String path = request.getSession().getServletContext().getRealPath("img");
		System.out.println(path);		
		
		// 파일 업로드 -> cos.jar (multipart)
		// 이미 업로드 기능 처리 됐음
		MultipartRequest mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "utf-8", new DefaultFileRenamePolicy());
												// (요청, 경로, 처리파일 최대 허용용량 byte 단위 (넘으면 오류발생) , 인코딩방식 (한글처리), 객체 불러오기)
																														// 서버에서 파일명 중복되는 상황 처리
																														// a.jpg a1.jpg a2.jpg ...
		// 박스 포장 시 Multipart 객체를 통해서 접근해야 됨.
		String name = mr.getParameter("n");
		System.out.println(name);

		// 파일 읽을 때
			// 중복 안되게 처리한 것 때문ㅇ ㅔ올릴 때 파일이름이 중요하지 않음.
			// 서버 상에 실제로 올라간 파일명이 중요
		String file = mr.getFilesystemName("f");
		System.out.println(file);
		
		String etc = mr.getFilesystemName("e");
		System.out.println(etc);
		
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><meta charset=\"utf-8\"></head><body>");
		
		out.print("<h1>"+ name +"</h1>");
		out.printf("<img src='img/%s' width=200px>", file);
		out.printf("<a href='img/%s'>사진보기</a>", file);
		out.printf("<a href='img/%s'>다운로드</a>", etc);
		
		out.print("</body>");
		out.print("</html>");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
