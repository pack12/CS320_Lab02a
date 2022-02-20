package edu.ycp.cs320.lab02a_jkettula.model;

public class Numbers {
	private double first, second, third;
	private double result;
	public Numbers() {
		
	}
	
	public void setFirst(double first) {
		this.first = first;
	}
	public double getFirst() {
		return first;
	}
	public void setSecond(double second) {
		this.second = second;
	}
	
	public double getSecond() {
		return second;
	}
	
	public void setThird(double third) {
		this.third = third;
	}
	
	public double getThird() {
		return third;
	}
	
	public double multiply(Numbers num) {
		return num.getFirst() * num.getSecond();
	}
	
//	public double add(Numbers num) 
//	{
//		return num.getFirst() + num.getSecond() + num.getThird();
//	}
	
	public void setResult(double result) {
		this.result = result;
	}
	
	public double getResult() {
		return result;
	}
}
