package com.js.main;

import javax.servlet.http.HttpServletRequest;

// M (Model) : ����Ͻ� ���� ó��
// 				��, ����̳� DB�۾��� ���⼭

public class M {

	public static void calc(HttpServletRequest request) {
		// a, b�� request�� ����ִ�.
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		System.out.println(a);
		System.out.println(b);
		int c = a+b;		
		
		// ���⼭ ���� c�� v2(output)�� ���� �� �ְ� �۾��Ѵ�.
		request.setAttribute("ccc", c);
	}
	

	
}
