package phamThiKimHien.source;


/*
 * Author: Pham Thi Kim Hien
 * Date : 8/19/2016
 * Vesion: 1.0
 * 
 * Include functions: calcPerimeter() method, and calcArea() method
 */
public class Rectangle {

	final double PI = 3.14;
	// calculate about width  of the circle
	// input is 2 object depend on Point class
	// output is result Width of a Rectangle
	public double calcWidth(Point pointA, Point pointB) {
		return Math.sqrt(Math.pow(pointB.y - pointA.x, 2) + Math.pow(pointA.x - pointA.y, 2));
	}
	// calculate about length of the circle
	// input is 2 object depend on Point class
	// output is result Length of a circle
	public double calcLength(Point pointA, Point pointB) {
		return Math.sqrt(Math.pow(pointB.x - pointB.y, 2) + Math.pow(pointB.y - pointA.x, 2));
	}
	// calculate about Perimeter of the circle
	// input is 2 object depend on Point class
	// output is result Perimeter of a Rectangle
	public double calcPerimeter(Point pointA, Point pointB) {
		return (calcLength(pointA, pointB) + calcWidth(pointA, pointB))*2;
	}
	// calculate about Area of the circle
	// input is 2 object depend on Point class
	// output is result Area of a Rectangle
	public double calcArea(Point pointA, Point pointB) {
		return calcLength(pointA, pointB) * calcWidth(pointA, pointB);
	}
}
