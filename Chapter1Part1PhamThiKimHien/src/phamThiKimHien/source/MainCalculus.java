package phamThiKimHien.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.omg.CORBA.PRIVATE_MEMBER;

/*
 * Author: Pham Thi Kim Hien
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Main: Calculus class
 */
public class MainCalculus {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		try {
			// use the default constructor method
			Calculus cal = new Calculus();
			cal.setFirstNumber((float) 7.5);
			cal.setSecondNumber((float) 2.5);
			System.out.println("result of Total = " + cal.calculateTotal());
			System.out.println("result of Subtraction = " + cal.calculateSubtraction());
			System.out.println("result of Multiplication = " + cal.calculateMultiplication());
			System.out.println("result of Division = " + String.format("%.2f", cal.calculateDivision()));
			// use the constructor method have parameter 
			System.out.println("Input first number: ");
			float firstNumber = Float.parseFloat(input.readLine());
			System.out.println("Input second number: ");
			float secondNumber = Float.parseFloat(input.readLine());
			Calculus cal2 = new Calculus(firstNumber, secondNumber);
			System.out.println("result of Total = " + cal2.calculateTotal());
			System.out.println("result of Subtraction = " + cal2.calculateSubtraction());
			System.out.println("result of Multiplication = " + cal2.calculateMultiplication());
			System.out.println("result of Division = " + String.format("%.2f", cal2.calculateDivision()));
		} catch (NumberFormatException | IOException | ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		
		
	}
}
