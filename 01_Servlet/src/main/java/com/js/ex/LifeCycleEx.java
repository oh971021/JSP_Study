package com.js.ex;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleEx
 */
@WebServlet("/LC")
public class LifeCycleEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LifeCycleEx() {
        super();
        // TODO Auto-generated constructor stub
    }
    // ������ ������ ����Ŭ�� �˾ƺ���
    
    // ��ó���۾� (init �� �ѹ�)
    @PostConstruct
    private void initPostConstruct() {
		// TODO Auto-generated method stub
    	System.out.println("initPostConstruct");
	}
    
    // ���� �ѹ� ����
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	System.out.println("init");
    }
    
    // ��û�� ��� ����
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
	}

    // ��û�� ��� ����
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
	}
	
    // ������ �ѹ� ����
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	System.out.println("destroy");
    }

    // ��ó�� (destroy �� �ѹ�)
    @PreDestroy
    private void destroyPreDestroy() {
		// TODO Auto-generated method stub
    	System.out.println("destroyPreDestroy");
	}
}
