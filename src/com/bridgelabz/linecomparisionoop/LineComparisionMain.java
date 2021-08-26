package com.bridgelabz.linecomparisionoop;

import java.util.Scanner;

public class LineComparisionMain {

	public static void main(String[] args) {
		
		System.out.println("----- Welcome To Line Comparision -----");
		
		Scanner scannerObject = new Scanner(System.in);
		Line line1 = new Line();
		Line line2 = new Line();
		
		System.out.println("Enter Line 1 Coordinates");
		System.out.println("x1: ");
		int line1X1 = scannerObject.nextInt();
		System.out.println("y1: ");
		int line1Y1 = scannerObject.nextInt();
		line1.setStartCoordinates(line1X1, line1Y1);
		System.out.println("x2: ");
		int line1X2 = scannerObject.nextInt();
		System.out.println("y2: ");
		int line1Y2 = scannerObject.nextInt();
		line1.setEndCoordinates(line1X2, line1Y2);
		
		System.out.println("Enter Line 2 Coordinates");
		System.out.println("x1: ");
		int line2X1 = scannerObject.nextInt();
		System.out.println("y1: ");
		int line2Y1 = scannerObject.nextInt();
		line2.setStartCoordinates(line2X1, line2Y1);
		System.out.println("x2: ");
		int line2X2 = scannerObject.nextInt();
		System.out.println("y2: ");
		int line2Y2 = scannerObject.nextInt();
		line2.setEndCoordinates(line2X2, line2Y2);
		
		LengthComparisionIF lengthComparator = new LengthComparisionImpl();
		System.out.println("Checking if the Lines are Equal:");
		lengthComparator.checkEqual(line1, line2);
		System.out.println();
		System.out.println("Comparing the two lines: ");
		lengthComparator.compareLength(line1, line2);
		
	}

}
