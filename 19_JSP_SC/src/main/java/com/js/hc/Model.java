package com.js.hc;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Model {
	
	public static void print1(HttpServletRequest request) {
		/*
		1. parameter : V���� ���� ��
			= String or String[] Ÿ������ ��ȯ
			= request�� �Ƿ��� ���� �����δ�.
		
		2. attribute : M(Java)���� ���� ��
			= Object (�ڷ����� ������ ����)
			= request�� �Ƿ��� ���� �����δ�.
		
		3. request : parameter�� attribute�� �Ƿ�����
		
		4. ���� ���� ��, 
			1) �Ķ����
				= java : request.getParameter("�Ķ���͸�");
				= EL : ${param.�Ķ���͸� }
				
			2) ��Ʈ����Ʈ
				= java : request.getAttribute("��Ʈ����Ʈ��");
				= EL : ${��Ʈ����Ʈ�� }
		*/
		
		// parameter
		String aa = request.getParameter("a");
		
		// attribute : �ڷ����� Object�� ĳ���� ����� ��
		String bb = (String)request.getAttribute("b");
		
	}
	
	public static void Make1(HttpServletRequest request, HttpServletResponse response) {
		
		String bbb = "������";
		request.setAttribute("b", bbb);
		
		// ����ϴ� �� (�� 4����)
		//	1. parameter
		//	2. attribute
			// Ư¡�� third���� ����, ���ο� ������Ʈ�̱⶧����
		
		
		//	3. Session
		//		= session.attribute(������ attr)
		String ccc = "����!!!";
		HttpSession hs = request.getSession();
		hs.setMaxInactiveInterval(5); // �ǹ̻� �������� �ð� 10��
		hs.setAttribute("c", ccc);
		// ������ Ŭ���̾�Ʈ�� �������
			// ������ Ŭ���̾�Ʈ�� ���Ḹ ��������� �� ����Ʈ ��𼭵� ����� ������ ���̴�.
			// ������ �������� ���ǰ��� ���ư���. (���� ����/ ��� ������ ���� ����)
			// �ð� �� '��û'�� �Ͼ�� ������ �ð��� ������ ���� ��
			// �ð� �� '��û'�� �Ͼ�� �ð� ������ �ȴ�.
			// ���� �����ð� : ���þ��ϸ� �⺻ 30��
		

		//	4. Cookie (response �ʿ�)
		// 		= ����� ��ǻ�Ϳ� �����Ѵ�.
		String ddd = "��Ű!!!";
		Cookie coo = new Cookie("d", ddd);
		coo.setMaxAge(5*60);	// 5��
		
		// �������� Ŭ���̾�Ʈ�� ������ �۾��̶� response�� �ʿ��ϴ�.
		response.addCookie(coo);
		// cookie�� �ð������� �ִ�.
			
	}
	
	public static void print2(HttpServletRequest request) {
		
		// session.attr (session�� attr)
		// Model ���� �� ����
		// ���� ---------- Ŭ���̾�Ʈ ���� ���¿� ��� (----�ȿ� ����)
		// �ð� ������ �ֵ�.
		// Object type ���� �����ȴ�.
		
		// �� ������
			// Java = request.getSession().getAttribute("��Ʈ����Ʈ��");
			// EL = ${sessionScope.��Ʈ����Ʈ�� }
		String ccc = (String)request.getSession().getAttribute("c");
		
		
		// Cookie
		// M ���� ���� ��
		
		// Ŭ���̾�Ʈ ��ǻ�Ϳ� ���Ϸ� ���� �ȴ�.
		// ������ ���, ������� �쵵 �������.
		
		// �� ������
			// Java =  �迭�� �޾Ƽ� if������ �ɷ��ش�
			// EL = ${cookie.��Ű��.value }
		
		// ���� ������� �ִ� ��Ű���� �����ϰ� ������ ��
			// �׷��� ������� ��ǻ�� �� �ִ� ��� ��Ű�� �ҷ��;� ��
		Cookie[] cookies = request.getCookies(); 
	
		for (Cookie c : cookies) {
			System.out.println(c);
			if (c.getName().equals("d")) {
				System.out.println(c.getValue());
			}
		}
		
	}
	
}
