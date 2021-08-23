package com.bridgelabz.linecomparisioncomputation;

import java.util.Random;

public class LineComparitionCalculator {

	public static void main(String[] args) {
		
		System.out.println("------------- Welcome to Line Comparision Computation! --------------");
		
		Random rand = new Random();
		int x1 = rand.nextInt(10);
		int x2 = rand.nextInt(10);
		int y1 = rand.nextInt(10);
		int y2 = rand.nextInt(10);
		
		Double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("x1 : "+x1);
		System.out.println("x2 : "+x2);
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		System.out.println("Length of the line is : "+length);		
	}
}
