package Ex3_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 09/09/2016
 * Version: 1.0
 */
public class MainArea {
	public static void main(String[] args) {
		BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
		try {
			calAreaCircle(input);
			calAreaRectangle(input);
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}
	private static void calAreaRectangle(BufferedReader input) throws NumberFormatException, IOException {
		System.out.println("Enter radius: ");
		double radius = Double.parseDouble(input.readLine());
		Area rectangle = (x1,x2) -> x1 * Math.pow(x2, 2);
		System.out.println("\tArea Rectangle: " + rectangle.calArea(Math.PI, radius));
	}
	public static void calAreaCircle(BufferedReader input) throws NumberFormatException, IOException {
			System.out.println("Enter length: ");
			double lenght = Double.parseDouble(input.readLine());
			System.out.println("Enter width: ");
			double width = Double.parseDouble(input.readLine());
			Area circle = (x1, x2) -> x1*x2;
			System.out.println("\tArea Circle: " + circle.calArea(lenght, width));
		
	}
}
