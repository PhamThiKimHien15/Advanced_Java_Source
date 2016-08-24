package Ex1_18.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 24/08/2016
 * Version: 1.0
 * 
 */
public class MainGifBox {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		try {
			System.out.println("Enter shape: ");
			String shape = input.readLine();
			System.out.println("Enter color: ");
			String color = input.readLine();
			System.out.println("Enter name: ");
			String name = input.readLine();
			System.out.println("Enter weight: ");
			double weight = Double.parseDouble(input.readLine());
			GiftBox gb = new GiftBox(shape, color);
			GiftBox.Gift gift = gb.new Gift(name, weight);
			System.out.println("\tShap: " + shape + "\tColor: " + color + 
					"\tName: " + name + "\tWeight: " + weight + "\tFee: " + gift.calFee());			
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
