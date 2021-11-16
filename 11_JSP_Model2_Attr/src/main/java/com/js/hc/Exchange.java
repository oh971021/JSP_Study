package com.js.hc;

import javax.servlet.http.HttpServletRequest;

public class Exchange {

	public static void calc(HttpServletRequest request) {
		
		// 값 받기
		int price = Integer.parseInt(request.getParameter("p")); 
		int money = Integer.parseInt(request.getParameter("m"));
		int ex = 0;
		String say = null;
		
		if (price < money) {
			ex = money - price;
			say = "잔돈 여기 있습니다~";
		} else if (price > money) {
			ex = money - price; 
			say = "돈이 모자라네요?";	
		} else {
			say = "감사합니다";
		}
		
//		request.setAttribute("price", price);
//		request.setAttribute("money", money);
//		request.setAttribute("exchange", ex);
//		request.setAttribute("say", say);
		
		// 위에처럼 필요한 것들을 따로 실어서 보내도 되는데
			// 편하게 하나로 뭉쳐서 보내자. (객체로 뭉쳐서 보내는 법)
		Result r = new Result(price, money, ex, say);
		request.setAttribute("rr", r);
		
	}
	
}
