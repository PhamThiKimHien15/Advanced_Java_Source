package Ex1_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 5/09/2016
 * Version: 1.0
 */
public class Main {
	public static void main(String[] args) {
		final double AMOUNT = 10000000;	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			Account acc = new Account();
			MobiObserver mobile = new MobiObserver(acc);
			EmailObserver email = new EmailObserver(acc);
			System.out.println("Enter the amount you want to withdraw: ");
			double state = Double.parseDouble(input.readLine());
			if(state > AMOUNT)
				System.out.println("Money want to withdrawal is incorrect");
			else{
				acc.setState(AMOUNT - state);
				System.out.println(mobile.update() + "\n" + email.update());
			}
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
