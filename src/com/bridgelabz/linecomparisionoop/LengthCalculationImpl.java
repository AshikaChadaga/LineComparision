package com.bridgelabz.linecomparisionoop;

public class LengthCalculationImpl implements LengthCalculationIF{
	
	@Override
	public double calculateLength(Line line1) {
		int x1 = line1.getStartCoordinates().getXCoordinate();
		int y1 = line1.getStartCoordinates().getYCoordinate();
		int x2 = line1.getEndCoordinates().getXCoordinate();
		int y2 = line1.getEndCoordinates().getYCoordinate();
		
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
				
	}
	
}
