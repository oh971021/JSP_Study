package com.js.hc;

import javax.servlet.http.HttpServletRequest;

public class M {

	public static void calc(HttpServletRequest request) {
		
		// 값 받기
		int e = Integer.parseInt(request.getParameter("earn"));
		int s = Integer.parseInt(request.getParameter("spend"));
		
		// 남은 돈 계산 하기
		int result = e - s;
		
		// log 찍기
		System.out.println(e);
		System.out.println(s);
		System.out.println(result);
		
		// 값 사용할 수 있도록 셋팅하기
		Remain r = new Remain();
		r.setE(e);
		r.setS(s);
		r.setR(result);
		
		request.setAttribute("r", r);
		
	}

}
