package com.js.hc;

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
		
		int how = Integer.parseInt(request.getParameter("how"));
		how = how * -1;
		
		request.setAttribute("how", how);
		
	}
	
}
