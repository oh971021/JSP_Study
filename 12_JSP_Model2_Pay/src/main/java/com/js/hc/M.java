package com.js.hc;

import javax.servlet.http.HttpServletRequest;

public class M {

	public static void calc(HttpServletRequest request) {
		
		// �� �ޱ�
		int e = Integer.parseInt(request.getParameter("earn"));
		int s = Integer.parseInt(request.getParameter("spend"));
		
		// ���� �� ��� �ϱ�
		int result = e - s;
		
		// log ���
		System.out.println(e);
		System.out.println(s);
		System.out.println(result);
		
		// �� ����� �� �ֵ��� �����ϱ�
		Remain r = new Remain();
		r.setE(e);
		r.setS(s);
		r.setR(result);
		
		request.setAttribute("r", r);
		
	}

}
