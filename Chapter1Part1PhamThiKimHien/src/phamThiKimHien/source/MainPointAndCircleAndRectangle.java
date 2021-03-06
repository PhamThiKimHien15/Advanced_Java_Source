package phamThiKimHien.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Main: Point class, Circle class, rectangle class
 */
public class MainPointAndCircleAndRectangle {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		try {
			System.out.print("Input for Point A with\nx = ");
			int x = Integer.parseInt(input.readLine());
			System.out.print("y= ");
			int y = Integer.parseInt(input.readLine());
			System.out.print("Input for Point B with\nx = ");
			int x2 = Integer.parseInt(input.readLine());
			System.out.print("y= ");
			int y2 = Integer.parseInt(input.readLine());
			
			// input is 2 object depend on Point class
			Point PointA = new Point(x, y);
			Point PointB = new Point(x2, y2);
						
			// output is result the distance between 2 points
			Distance op = new Distance();
			System.out.println("------------------------Distance between 2 point-----------------");
			System.out.println("result: " + String.format("%.2f", op.calcDistance(PointA, PointB)));	
			
			// output is result Perimeter and Area of a circle
			Circle oc = new Circle(PointA,PointB);
			oc.setRadius(PointA, PointB);
			System.out.println("------------------------Circle--------------------");
			System.out.println("result Perimeter of a circle: " + String.format("%.2f", oc.calculatePerimeter()));	
			System.out.println("result area of a circle: " + String.format("%.2f", oc.calculateArea()));
			
			//output is result Perimeter and Area of a Rectangle		
			Rectangle or = new Rectangle();
			System.out.println("------------------------Rectangle------------------");
			System.out.println("result Perimeter of a Rectangle: " + String.format("%.2f", or.calcPerimeter(PointA, PointB) ));	
			System.out.println("result area of a Rectangle: " + String.format("%.2f", or.calcArea(PointA, PointB)));
			
		} catch (NumberFormatException | IOException ex) {
			System.err.println(ex.getMessage());
		}	
		
	}	
}
