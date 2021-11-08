package com.js.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calc3")
public class Calc3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double x = Double.parseDouble(request.getParameter("x"));
		String[] cal =  request.getParameterValues("cal");
		double y = Double.parseDouble(request.getParameter("y"));
			
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><meta charset=\"utf-8\"></head><body>");
		out.print("<table border=\"3\" style=\"width: 300px; height: 100px\">");
		
		for (String s : cal) {
			if (s.equals("1")) { 	
				out.printf("<tr><td>%.0f + %.0f = %.2f</td></tr>", x, y, x+y);
			} 
			else if (s.equals("2")) {
				out.printf("<tr><td>%.0f - %.0f = %.2f</td></tr>", x, y, x-y);
			}
			else if (s.equals("3")) {	
				out.printf("<tr><td>%.0f * %.0f = %.2f</td></tr>", x, y, x*y);
			}
			else {	
				out.printf("<tr><td>%.0f / %.0f = %.2f</td></tr>", x, y, x/y);
			}		
		}
		
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
