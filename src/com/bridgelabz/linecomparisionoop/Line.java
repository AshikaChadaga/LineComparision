package com.bridgelabz.linecomparisionoop;

public class Line {
	Point startCoordinates = new Point();
	Point endCoordinates = new Point();
	
	public Point getEndCoordinates() {
		return endCoordinates;
	}
	public Point getStartCoordinates() {
		return startCoordinates;
	}
	
	public void setStartCoordinates(int x1, int y1) {
		startCoordinates.setXCoordinate(x1);
		endCoordinates.setYCoordinate(y1);
	}
	
	public void setEndCoordinates(int x2, int y2) {
		startCoordinates.setXCoordinate(x2);
		endCoordinates.setYCoordinate(y2);
	}
}
