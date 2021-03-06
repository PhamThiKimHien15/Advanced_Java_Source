package phamThiKimHien.source;


/*
 * Author: Pham Thi Kim Hien
 * Date : 8/19/2016
 * Vesion: 1.0
 * 
 * Include functions: calcDistance() method
 */
public class Distance {
	// calculate about distance between 2 points
	// input is 2 object depend on Point class
	// output is result the distance between 2 points
	public double calcDistance(Point PointA, Point PointB) {
		return (Math.sqrt((PointA.x-PointB.x)*(PointA.x-PointB.x) + (PointA.y-PointB.y)*(PointA.y-PointB.y)));
	}
	
}
