package com.sapient.service;

public class Interest {
	
	public double amt;
	public int years;
	public float rate;
	/* performs simple interest  */
	public double calcSimple(){
		double si = amt * years * rate /100;
		return si;
	}
	
	
	public double calcCompound(){
		return amt * Math.pow((1 + rate/100), years);
		
	}
	
	public void display(){
		System.out.println(amt + " " + years + " " + rate );
		System.out.println("simple=" + calcSimple() );
		System.out.println(("compound=" + calcCompound()));
	}
}
