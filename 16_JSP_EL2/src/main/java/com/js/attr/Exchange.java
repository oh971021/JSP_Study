package com.js.attr;

import javax.servlet.http.HttpServletRequest;

public class Exchange {

	public static void calc(HttpServletRequest request) {
		
		// �� �ޱ�
		int price = Integer.parseInt(request.getParameter("p")); 
		int money = Integer.parseInt(request.getParameter("m"));
		int ex = 0;
		int ex2 = 0;
		
		String say = null;
		
		if (price < money) {
			ex = money - price;
			say = "�ܵ� ���� �ֽ��ϴ�~";
		} else if (price > money) {
			ex = money - price; 
			ex2 = price - money;
			say = "���� ���ڶ�׿�?";	
		} else {
			say = "�����մϴ�";
		}
		
//		request.setAttribute("price", price);
//		request.setAttribute("money", money);
//		request.setAttribute("exchange", ex);
//		request.setAttribute("say", say);
		
		// ����ó�� �ʿ��� �͵��� ���� �Ǿ ������ �Ǵµ�
			// ���ϰ� �ϳ��� ���ļ� ������. (��ü�� ���ļ� ������ ��)
		request.setAttribute("ex2", ex2);
		Result r = new Result(price, money, ex, say);
		request.setAttribute("rr", r);
		
	}

	public static void MakeRightValue(HttpServletRequest request) {
		
		String how = request.getParameter("how");
		
		int how2 = Integer.parseInt(how) * -1;
		
		request.setAttribute("how", how);
		request.setAttribute("how2", how2);
		
	}
	
}
