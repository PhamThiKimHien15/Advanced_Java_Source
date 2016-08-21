package phamThiKimHien;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Main: LinearEquation class
 */
public class TestingLinearEquation {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		try {
			System.out.println("Input a= ");
			int a = Integer.parseInt(input.readLine());
			System.out.println("Input b= ");
			int b = Integer.parseInt(input.readLine());			
			LinearEquation le = new LinearEquation(a, b);
			double result = le.solveEquation();
			if (result ==  -1.1111)
				System.out.println("the equation has more solution");
			else if (result == -1.0001)
				System.out.println("the equation has no solution");
			else
				System.out.println("result = " + String.format("%.2f", result));
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
