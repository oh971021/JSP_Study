package com.js.self;

import javax.servlet.http.HttpServletRequest;

public class Calc {

	public static void calc(HttpServletRequest request) {
		
		// �� �ޱ�
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		int r = x+y;
		String c = request.getParameter("calc");
		
		// ����ϱ�
		if (c.equals("-")) {
			r = x - y;
		} else if (c.equals("*")) {
			r = x * y;
		} else if (c.equals("/")) {
			r = x / y;			
		}
		
		// ��� �� ������
//		request.setAttribute("r", r);
//		request.setAttribute("c", c);
		
		// ��� �� �ѹ��� ������
		Re re = new Re(x, y, r, c);
		
		request.setAttribute("re", re);
	}

	public static void div(HttpServletRequest request) {
		
		int r = Integer.parseInt(request.getParameter("result"));
		
		int result = r / 2;
		
		request.setAttribute("r", r);
		request.setAttribute("result", result);
		
	}

}
