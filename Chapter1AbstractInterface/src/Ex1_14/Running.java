package Ex1_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * 
 */
public class Running {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		try {
			System.out.println("1.Circle");
			System.out.println("2.Rectangle");
			System.out.println("3.Square");
			System.out.println("Please choose: ");
			int choice = Integer.parseInt(input.readLine());
			if (choice != 1 && choice != 2 && choice != 3)
				throw new ArithmeticException("You choose not be suitable");
			if (choice == 1) {
				System.out.println("Enter radius: ");
				double radius = Double.parseDouble(input.readLine());
				Circle cir = new Circle(radius);
				System.out.println("Circle Perimeter: "
						+ String.format("%.2f", cir.perimeter()));
				System.out.println("Circle Area: "
						+ String.format("%.2f", cir.area()));
			} else if (choice == 2) {
				System.out.println("Enter length: ");
				double length = Double.parseDouble(input.readLine());
				System.out.println("Enter width: ");
				double width = Double.parseDouble(input.readLine());
				Rectangle rec = new Rectangle(width, length);
				System.out.println("Circle Perimeter: " + rec.perimeter());
				System.out.println("Circle Area: " + rec.area());
			} else {
				System.out.println("Enter edge: ");
				double edge = Double.parseDouble(input.readLine());
				Square sq = new Square(edge);
				System.out.println("Circle Perimeter: " + sq.perimeter());
				System.out.println("Circle Area: " + sq.area());
			}
		} catch (NumberFormatException | IOException | ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}
}
