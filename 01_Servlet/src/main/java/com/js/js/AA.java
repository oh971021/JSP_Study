package com.js.js;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 기본적으로 Web에 연결해주는 클래스
@WebServlet("/AA")
public class AA extends HttpServlet {

	// Get 메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Test!!!!!");
	}

	// Post 메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

}
