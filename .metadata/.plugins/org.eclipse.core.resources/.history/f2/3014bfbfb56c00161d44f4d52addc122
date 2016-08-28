package phamThiKimHien;
/*
 * Author: Pham Thi Kim Hien
 * Date : 8/19/2016
 * Vesion: 1.0
 * 
 * Include functions: calculatePerimeter() method, and calculateArea() method
 */
public class Circle {

	final double PI = 3.14;
	double radius;
	Point PointO;
	Point PointR;
	public Circle(Point PointO, Point PointR) {
		super();
		this.PointO = PointO;
		this.PointR = PointR;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public void setRadius(Point PointO, Point PointR) {
		Distance dis = new Distance();
		this.radius = dis.calcDistance(PointO, PointR);
	}	
	// calculate about Perimeter of a circle
	// input is radius field
	// output is result Perimeter of a circle
	public double calculatePerimeter() {
		return radius*2*PI;
	}
	// calculate about area of a circle
	// input is radius field
	// output is result area of a circle
	public double calculateArea() {
		return Math.pow(radius,2)*PI;
	}
}
