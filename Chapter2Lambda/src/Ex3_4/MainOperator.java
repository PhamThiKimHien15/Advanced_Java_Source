package Ex3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 09/09/2016
 * Version: 1.0
 */
public class MainOperator {
	public static void main(String[] args) {
		BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter first number: ");
			double firstNumber = Double.parseDouble(input.readLine());
			System.out.println("Enter second number: ");
			double secondNumber = Double.parseDouble(input.readLine());
			calAdd(firstNumber, secondNumber);
			calSub(firstNumber, secondNumber);
			calMultiplication (firstNumber,secondNumber);
			calDivision(firstNumber, secondNumber);
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void calDivision(double firstNumber, double secondNumber) {
		Operator div = (x1, x2) -> x1/x2;
		System.out.println("\tResult calculate add: " + div.operate(firstNumber, secondNumber));
	}

	private static void calMultiplication(double firstNumber, double secondNumber) {
		Operator mul = (x1, x2) -> x1*x2;
		System.out.println("\tResult calculate add: " + mul.operate(firstNumber, secondNumber));
	}

	private static void calSub(double firstNumber, double secondNumber) {
		Operator sub = (x1, x2) -> x1-x2;
		System.out.println("\tResult calculate add: " + sub.operate(firstNumber, secondNumber));
	}

	private static void calAdd(double firstNumber, double secondNumber) {
		Operator add = (x1, x2) -> x1+x2;
		System.out.println("\tResult calculate add: " + add.operate(firstNumber, secondNumber));		
	}
}
