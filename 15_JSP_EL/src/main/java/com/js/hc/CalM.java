package com.js.hc;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class CalM {

	public static void calc(HttpServletRequest request) {

		try {
			request.setCharacterEncoding("utf-8");
			
			String name = request.getParameter("name");
			double mid = Double.parseDouble(request.getParameter("mid"));
			double last = Double.parseDouble(request.getParameter("last"));
			
			double avg = (mid + last) / 2;
			
			String grade = "F";
			if (avg >= 90) {
				grade = "A";
			} else if (avg >= 80) {
				grade = "B";
			} else if (avg >= 70) {
				grade = "C";
			} else if (avg >= 60) {
				grade = "D";
			}
	
			String avg2 = String.format("%.2f", avg);
	
			// log
//			System.out.println(name);
//			System.out.println(mid);
//			System.out.println(last);
//			System.out.println(grade);
//			System.out.println(avg2);
			
			Result r = new Result(name, mid, last, avg2, grade);
			request.setAttribute("re", r);
			
			/////////////////////////////////////////////////////////
			
			request.setAttribute("a", "준석");
			request.setAttribute("b", "솔리");
			
			int[] ar = {3, 6, 9};
			request.setAttribute("c", ar);
			
			Result[] ar2 = new Result[2];
			ar2[0] = new Result("준석", 77, 88, "90", "A");
			ar2[1] = new Result("솔리", 88, 99, "96", "S");
			
			request.setAttribute("d", ar2);
			
//			Type 제한 (제네릭), 가변 배열
			ArrayList<Result> al = new ArrayList<Result>();
	         al.add(new Result("사", 10, 20, "50", "A"));
	         al.add(new Result("랑", 10, 20, "60", "B"));
	         al.add(new Result("해", 10, 20, "70", "C"));
			
			request.setAttribute("e", al);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}
