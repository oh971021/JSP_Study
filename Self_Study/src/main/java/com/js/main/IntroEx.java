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
		
		// POST 방식의 한글처리 (RQ Encoding)
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 값이 두개 이상이면 파라미터를 배열로 받는다.
		String[] hobbys = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		
		// ContentType : 이 파일의 해석, 언어
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.write("<html><head></head><body>");
		out.write("이름 : " + name + "<br/>");
		out.write("아이디 : " + id + "<br/>");
		out.write("비밀번호 : " + pw + "<br/>");
		// 배열의 모든 값을 출력 하는 메소드 (toString)
		out.write("취미 : " + Arrays.toString(hobbys) + "<br/>");
		out.write("전공 : " + major + "<br/>");
		out.write("</body></html>");
		
		out.close();
	}

}
