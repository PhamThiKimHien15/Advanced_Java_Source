package Ex1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 */
public class TestingSoldier {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static int power;
	static String name;
	static String weapon;

	public static void main(String[] args) {
		try {
			System.out.println("Enter infantryman: ");
			enterInfo();
			System.out.println("\nEnter trooper: ");
			enterInfo();
			System.out.println("1.Infantryman beaten");
			System.out.println("2.Trooper beaten");
			System.out.println("3.Quit");
			System.out.print("Choose infantryman or trooper beaten: \n");
			int choice = Integer.parseInt(input.readLine());
			Soldier inf = new Infantryman(name, power, weapon);
			Soldier troo = new Trooper(name, power, weapon);
			while (choice != 3 && inf.getPower() > 0 && troo.getPower() > 0) {
				if (choice == 1) {
					inf.fight();
					System.out.println("Power of Infantryman: " + inf.getPower());
				} else if (choice == 2) {
					troo.fight();
					System.out.println("Power of Trooper: " + troo.getPower());
				} else {
					System.out.println("You choose not suitable. Please reselect");
				}
				if (inf.getPower() > 0 && troo.getPower() > 0) {
					System.out.println("Choose infantryman or trooper beaten: ");
					choice = Integer.parseInt(input.readLine());
				}
			}
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}
	//get information of Soldier 
	public static void enterInfo() throws NumberFormatException, IOException {
		System.out.print("Enter name: \n");
		name = input.readLine();
		System.out.print("Enter power: \n");
		power = Integer.parseInt(input.readLine());
		System.out.print("Enter weapon: \n");
		weapon = input.readLine();
	}

}