package com.js.hc;

import java.util.Iterator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MoveValue {

	public static void move(HttpServletRequest request, HttpServletResponse response) {

		request.setAttribute("a", "Attribute!!");
		
		String b = "Session!!";
		HttpSession hs = request.getSession();
		hs.setMaxInactiveInterval(5);
		hs.setAttribute("b", b);
		
		String d = "Cookie!!";
		Cookie coo = new Cookie("d", d);
		coo.setMaxAge(5*60); // 5Ка
		response.addCookie(coo);
				
		Cookie[] cookies = request.getCookies();
		
		for (Cookie c : cookies) {
			System.out.println(c);
			if (c.getName().equals("d")) {
				System.out.println(c.getValue());
			}
		}
	}

	public static void second(HttpServletRequest request) {

		String a = request.getParameter("a");
		String b = (String)request.getAttribute("a");
		
		System.out.println(a);
		System.out.println(b);
		
		request.setAttribute("valueA", a);
		request.setAttribute("valueB", b);
		
		Cookie[] cookies = request.getCookies();
		
		for (Cookie c : cookies) {
			System.out.println(c);
			if (c.getName().equals("d")) {
				System.out.println(c.getValue());
			}
		}
	}

}
