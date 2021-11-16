package com.js.main;

import javax.servlet.http.HttpServletRequest;

// M (Model) : 비즈니스 로직 처리
// 				즉, 계산이나 DB작업은 여기서

public class M {

	public static void calc(HttpServletRequest request) {
		// a, b가 request에 담겨있다.
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		System.out.println(a);
		System.out.println(b);
		int c = a+b;		
		
		// 여기서 나온 c를 v2(output)로 보낼 수 있게 작업한다.
		request.setAttribute("ccc", c);
	}
	

	
}
