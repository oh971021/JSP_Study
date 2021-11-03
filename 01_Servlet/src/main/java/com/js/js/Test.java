package com.js.js;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test")
public class Test extends HttpServlet {
	
	// 의미 : 기존 servlet의 기능을 다 가지고 있고,
	// 		내가 뭔가 추가해서 쓰겠다.
	
	// 지금까지 작업 한 것 -> servlet class : 기본적인거 다 만들어 주는거
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		System.out.println("test");
	}
	
}
