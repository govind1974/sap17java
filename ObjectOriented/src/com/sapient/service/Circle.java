package com.sapient.service;

public class Circle {

	public double radius;
	
	public double calcArea(){
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public double calcPeri(){
		double pmtr = 2 * Math.PI * radius ;
		return pmtr;
	}
}
