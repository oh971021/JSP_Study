package com.js.format;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class DataMaker {

	public static void make(HttpServletRequest request) {

		int a = 123456789;
		request.setAttribute("a", a);
		
		double b = 0.4566;
		request.setAttribute("b", b);
		
		double c = 123123.456456;
		request.setAttribute("c", c);
		
		Date d = new Date();
		request.setAttribute("d", d);
		
		// 과자 (객체) 여러개를 저장
			// 3개, 이름과 가격만 있다.		
		ArrayList<Snack> s = new ArrayList<Snack>();
		
		s.add(new Snack("새우깡", 1500, d));
		s.add(new Snack("감자깡", 1300, d));
		s.add(new Snack("고구마깡", 1400, d));
		
		request.setAttribute("snacks", s);
		
	}
}
