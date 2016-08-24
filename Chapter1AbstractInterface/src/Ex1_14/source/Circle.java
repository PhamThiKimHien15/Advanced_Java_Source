package Ex1_14.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Circle
 */
public class Circle extends Shape {

	private double radius;
	private final double PI = 3.14;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	/*
	 * function: use to calculate perimeter of the Circle
	 * input is radius fields
	 * output is result of the calculation
	 */
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	/*
	 * function: use to calculate area of the Circle
	 * input is radius fields
	 * output is result of the calculation
	 */
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}
