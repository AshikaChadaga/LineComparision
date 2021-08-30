package com.bridgelabz.linecomparisionoop;

public class LengthComparisionImpl implements LengthComparisionIF{
	
	LengthCalculationIF lengthCalculatorObject = new LengthCalculationImpl();
	
	@Override
	public void checkEqual(Line line1, Line line2) {
		
		Double lengthOfLine1 = lengthCalculatorObject.calculateLength(line1);
		System.out.println("The length of the First Line is: "+lengthOfLine1);
		Double lengthOfLine2 = lengthCalculatorObject.calculateLength(line2);
		System.out.println("The length of the Second Line is: "+lengthOfLine2);
		
		if(lengthOfLine1.equals(lengthOfLine2)) {
			System.out.println("Line 1 and Line 2 are Equal");
		}
		else {
			System.out.println("Line 1 and Line 2 are not equal");
		}
	}
	
	@Override
	public void compareLength(Line line1, Line line2) {
		Double lengthOfLine1 = lengthCalculatorObject.calculateLength(line1);
		System.out.println("The length of the First Line is: "+lengthOfLine1);
		Double lengthOfLine2 = lengthCalculatorObject.calculateLength(line2);
		System.out.println("The length of the Second Line is: "+lengthOfLine2);
		
		int compareValue = lengthOfLine1.compareTo(lengthOfLine2);
		
		if(compareValue < 0)
			System.out.println("Line 1 is smaller than Line 2");
		else if(compareValue == 0)
			System.out.println("Line 1 is equal to Line 2");
		else
			System.out.println("Line 1 is greater than Line 2");
		
	}
	
}
