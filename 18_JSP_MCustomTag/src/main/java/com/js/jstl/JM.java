package com.js.jstl;

import java.util.ArrayList;
//import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class JM {

	public static void calc(HttpServletRequest request) {
		
		int brith = Integer.parseInt(request.getParameter("birth"));
		int today = Calendar.getInstance().get(Calendar.YEAR);
		
		// Date Type À¸·Î »ý¼º
//		Date d = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
//		int year = Integer.parseInt(sdf.format(d));
		
		int age = today - (brith - 1);
		
		request.setAttribute("age", age);
		
		int[] ar = {1, 3, 5, 7, 9};
		request.setAttribute("ar", ar);
		
		
		ArrayList<Menu> menus = new ArrayList<Menu>();
		
		menus.add(new Menu("±èÄ¡Âî°Ô", 6000));
		menus.add(new Menu("ººÀ½¹ä", 7000));
		menus.add(new Menu("Œc¾ç½Ò±¹¼ö", 10000));
		menus.add(new Menu("ÆÌÅ¸ÀÌ", 13000));
		
		request.setAttribute("menus", menus);
		
	}
}
