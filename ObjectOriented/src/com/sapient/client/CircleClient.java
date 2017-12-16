package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Circle;
import com.sapient.util.SapUtil;

public class CircleClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amt");
		double rad = scan.nextDouble();
		Circle obj = new Circle();
		obj.radius=rad;
		double area = obj.calcArea();
		double pmeter = obj.calcPeri();
		System.out.println("Area of circle " + SapUtil.roundUp2Dec(area));
		System.out.println("Perimater of circle " + SapUtil.roundUp2Dec(pmeter));
		scan.close();
	}

}
