package Ex1_14;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Square
 */
public class Square extends Shape {

	private double edge;

	public Square(double edge) {
		super();
		this.edge = edge;
	}

	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

	@Override
	public double perimeter() {
		return edge * 4;
	}

	@Override
	public double area() {
		return Math.pow(edge, 2);
	}

}