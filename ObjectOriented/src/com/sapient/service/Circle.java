package com.sapient.service;

/*
 * Ciorcle class have 3 states and 2 bhaviour
 */
public class Circle {

	public double radius;
	
	/* 
	 * performs area of a circle
	 */
	public double calcArea(){
		double area = Math.PI * radius * radius;
		return area;
	}
	
	/* 
	 * performs area of a perimeter
	 */
	public double calcPeri(){
		double pmtr = 2 * Math.PI * radius ;
		return pmtr;
	}
}
