package com.js.bmi;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BmiCalc {

	public static void bmi(HttpServletRequest request) throws IOException {

		String path = request.getSession().getServletContext().getRealPath("img");
		System.out.println(path);
		
		// ��Ƽ��Ʈ ��ü ����
		MultipartRequest mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "utf-8", new DefaultFileRenamePolicy());			
		
		String name = mr.getParameter("name");
		double height = Double.parseDouble(mr.getParameter("height"));
		double weight = Double.parseDouble(mr.getParameter("weight"));
		String profile = mr.getFilesystemName("profile");
		
		// �ֿܼ� �� ����غ���
		System.out.println(name);
		System.out.println(height);
		System.out.println(weight);
		
		// �� ����ϰ� ����
		double bmi = (weight) / ((height / 100) * (height / 100));
		System.out.println(bmi);	

		// ���� ���� ��� ��
		String result = "��";
		if (bmi < 18.5) {
			result = "��ü��";
		} else if (bmi < 23) {
			result = "����";
		} else if (bmi >= 23 && bmi < 25) {
			result = "��ü��";
		}
		
		String bmi2 = String.format("%.2f", bmi);
		
		BmiResult br = new BmiResult(name, height, weight, bmi2, result, profile);
		
		request.setAttribute("br", br);
		
	}

}
