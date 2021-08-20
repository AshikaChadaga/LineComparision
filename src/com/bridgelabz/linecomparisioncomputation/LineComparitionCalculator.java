package com.bridgelabz.linecomparisioncomputation;

public class LineComparitionCalculator {

	public static Double length(int x1, int y1, int x2, int y2) {
		Double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("x1 : "+x1);
		System.out.println("y1 : "+y1);
		System.out.println("x2 : "+x2);
		System.out.println("y2 : "+y2);
		return length;
	}
	
	public static void main(String[] args) {
		
		Ssytem.out.println("----------- Welcome to Line Comparision Computation -------------");
				
		int l1x1, l1y1, l1x2, l1y2;
		int l2x1, l2y1, l2x2, l2y2;
		Double length1, length2;
		boolean isEqual;
		int compareValue;
		
		l1x1 = 2;
		l1y1 = 3;
		l1x2 = 4;
		l1y2 = 10;
		length1 = length(l1x1, l1y1, l1x2, l1y2);
		System.out.println("Length 1 : "+length1);
		
		l2x1 = 2;
		l2y1 = 3;
		l2x2 = 4;
		l2y2 = 8;
		length2 = length(l2x1, l2y1, l2x2, l2y2);
		System.out.println("Length 2 : "+length2);
		
		isEqual = length1.equals(length2);
		if(isEqual)
			System.out.println("The Lines are equal");
		else
			System.out.println("The lines are not equal");
		
		compareValue = length1.compareTo(length2);
		if(compareValue < 0)
			System.out.println("Line 1 is smaller than Line 2");
		else if(compareValue == 0)
			System.out.println("Line 1 is equal to Line 2");
		else
			System.out.println("Line 1 is greater than Line 2");
		
		
	}

}
