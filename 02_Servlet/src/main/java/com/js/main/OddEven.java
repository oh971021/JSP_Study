package com.js.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OddEven")
public class OddEven extends HttpServlet {	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int val = Integer.parseInt(request.getParameter("val"));

		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"utf-8\">");
		out.print("</head>");
		out.print("<body>");
		
		if (val % 2 == 0) {
			out.print("<h1> Â¦ÀÔ´Ï´Ù. </h1>");
		} else {
			out.print("<h1> È¦ÀÔ´Ï´Ù. </h1>");
		}
		
		out.print("</body>");
		out.print("</html>");		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	}

}
