package com.js.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calc2")
public class Calc2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double x = Double.parseDouble(request.getParameter("x"));
		String cal =  request.getParameter("cal");
		double y = Double.parseDouble(request.getParameter("y"));
		double result = 0;
		
		if (cal.equals("+")) { result = x+y; } 
		else if (cal.equals("-")) {	result = x-y; }
		else if (cal.equals("*")) {	result = x*y; }
		else if (cal.equals("/")) {	result = x/y; }
		else { result = 0; }
		
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><meta charset=\"utf-8\"></head><body>");
		
		out.print("<h1>Calc ÆÄÀÏ</h1>");
		
		out.print("<table border=\"3\" style=\"width: 200px; height: 100px\">");
		out.printf("<tr><td>%.0f %s %.0f = %.2f</td></tr>", x, cal, y, result);
		out.print("</table>");
		
		out.print("</body>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
