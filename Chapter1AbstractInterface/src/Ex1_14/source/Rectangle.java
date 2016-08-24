package Ex1_14.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Rectangle
 */
public class Rectangle extends Shape {

	private double width;
	private double length;

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	/*
	 * (non-Javadoc)
	 * @see Ex1_14.source.Shape#perimeter()
	 * function: use to calculate perimeter of the Rectangle
	 * input is field include length and width
	 * output is result of the calculation
	 */
	@Override
	public double perimeter() {
		return (length + width) * 2;
	}
	/*
	 * (non-Javadoc)
	 * @see Ex1_14.source.Shape#area()
	 * function: use to calculate area of the Rectangle
	 * input is field include length and width
	 * output is result of the calculation
	 */
	@Override
	public double area() {
		return length * width;
	}

}
