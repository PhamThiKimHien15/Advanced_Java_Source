package phamThiKimHien.source;

import java.awt.Choice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
 * Author: Pham Thi Kim Hien
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Main: CD class
 */
public class MainCD {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		try {
			String choice;
			CollectionCDs list = new CollectionCDs();
			do {
				System.out.print("Enter CD code: ");
				String id = input.readLine();
				System.out.print("Enter name of CD: ");
				String name = input.readLine();
				System.out.print("Enter name of singer: ");
				String singer = input.readLine();
				System.out.print("Enter number of Songs: ");
				int numOfSongs = Integer.parseInt(input.readLine());
				System.out.print("Enter price: ");
				double price = Double.parseDouble(input.readLine());
				CD cd = new CD(id, name, singer, numOfSongs, price);
				list.addCD(cd);				
				System.out.println("Do you want to add the new CD?(Y/N): ");
				choice = input.readLine();
			} while (choice.equalsIgnoreCase("Y"));
			list.outList();
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
