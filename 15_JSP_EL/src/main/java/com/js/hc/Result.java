package com.js.hc;

public class Result {

	private String name;
	private double mid;
	private double last;
	private String avg;
	private String grade;
	
	public Result() {}

	public Result(String name, double mid, double last, String avg, String grade) {
		super();
		this.name = name;
		this.mid = mid;
		this.last = last;
		this.avg = avg;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMid() {
		return mid;
	}

	public void setMid(double mid) {
		this.mid = mid;
	}

	public double getLast() {
		return last;
	}

	public void setLast(double last) {
		this.last = last;
	}

	public String getAvg() {
		return avg;
	}

	public void setAvg(String avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
