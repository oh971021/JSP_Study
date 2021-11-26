package com.js.hc;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Model {
	
	public static void print1(HttpServletRequest request) {
		/*
		1. parameter : V에서 만든 값
			= String or String[] 타입으로 변환
			= request에 실려서 값이 움직인다.
		
		2. attribute : M(Java)에서 만든 값
			= Object (자료형에 제한이 없다)
			= request에 실려서 값이 움직인다.
		
		3. request : parameter와 attribute가 실려있음
		
		4. 값을 읽을 때, 
			1) 파라미터
				= java : request.getParameter("파라미터명");
				= EL : ${param.파라미터명 }
				
			2) 어트리뷰트
				= java : request.getAttribute("어트리뷰트명");
				= EL : ${어트리뷰트명 }
		*/
		
		// parameter
		String aa = request.getParameter("a");
		
		// attribute : 자료형이 Object라 캐스팅 해줘야 함
		String bb = (String)request.getAttribute("b");
		
	}
	
	public static void Make1(HttpServletRequest request, HttpServletResponse response) {
		
		String bbb = "ㅋㅋㅋ";
		request.setAttribute("b", bbb);
		
		// 사용하는 값 (총 4가지)
		//	1. parameter
		//	2. attribute
			// 특징상 third에선 못씀, 새로운 리퀘스트이기때문에
		
		
		//	3. Session
		//		= session.attribute(세션의 attr)
		String ccc = "세션!!!";
		HttpSession hs = request.getSession();
		hs.setMaxInactiveInterval(5); // 의미상 세션유지 시간 10초
		hs.setAttribute("c", ccc);
		// 서버와 클라이언트의 연결상태
			// 서버와 클라이언트의 연결만 살아있으면 이 사이트 어디서든 사용이 가능한 값이다.
			// 연결이 끊어지면 세션값도 날아간다. (접속 종료/ 모든 브라우저 닫은 상태)
			// 시간 내 '요청'이 일어나지 않으면 시간이 지나고 삭제 됨
			// 시간 내 '요청'이 일어나면 시간 갱신이 된다.
			// 세션 유지시간 : 셋팅안하면 기본 30분
		

		//	4. Cookie (response 필요)
		// 		= 사용자 컴퓨터에 존재한다.
		String ddd = "쿠키!!!";
		Cookie coo = new Cookie("d", ddd);
		coo.setMaxAge(5*60);	// 5분
		
		// 서버에서 클라이언트로 보내는 작업이라 response가 필요하다.
		response.addCookie(coo);
		// cookie도 시간제한이 있다.
			
	}
	
	public static void print2(HttpServletRequest request) {
		
		// session.attr (session의 attr)
		// Model 에서 값 생성
		// 서버 ---------- 클라이언트 연결 상태에 담김 (----안에 있음)
		// 시간 제한이 있따.
		// Object type 으로 생성된다.
		
		// 값 읽을때
			// Java = request.getSession().getAttribute("어트리뷰트명");
			// EL = ${sessionScope.어트리뷰트명 }
		String ccc = (String)request.getSession().getAttribute("c");
		
		
		// Cookie
		// M 에서 만든 값
		
		// 클라이언트 컴퓨터에 파일로 저장 된다.
		// 접속을 끊어도, 재부팅을 헤도 살아있음.
		
		// 값 읽을때
			// Java =  배열로 받아서 if문으로 걸러준다
			// EL = ${cookie.쿠키명.value }
		
		// 현재 만들어져 있는 쿠키들을 생각하고 만들어야 함
			// 그래서 사용자의 컴퓨터 상에 있는 모든 쿠키를 불러와야 함
		Cookie[] cookies = request.getCookies(); 
	
		for (Cookie c : cookies) {
			System.out.println(c);
			if (c.getName().equals("d")) {
				System.out.println(c.getValue());
			}
		}
		
	}
	
}
