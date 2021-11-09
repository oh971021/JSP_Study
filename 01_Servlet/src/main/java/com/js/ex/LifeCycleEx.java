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
    // 서블렛의 라이프 사이클을 알아보자
    
    // 선처리작업 (init 전 한번)
    @PostConstruct
    private void initPostConstruct() {
		// TODO Auto-generated method stub
    	System.out.println("initPostConstruct");
	}
    
    // 최초 한번 생성
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	System.out.println("init");
    }
    
    // 요청시 계속 실행
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
	}

    // 요청시 계속 실행
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
	}
	
    // 마지막 한번 실행
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	System.out.println("destroy");
    }

    // 후처리 (destroy 후 한번)
    @PreDestroy
    private void destroyPreDestroy() {
		// TODO Auto-generated method stub
    	System.out.println("destroyPreDestroy");
	}
}
