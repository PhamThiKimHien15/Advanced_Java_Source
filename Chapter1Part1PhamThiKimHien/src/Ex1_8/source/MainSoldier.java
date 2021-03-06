package Ex1_8.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 2.0
 * 
 * described fighting: show the power of Infantryman and Trooper when fighting, the user will enter the 
 * information of Infantryman and Trooper, then the user chooses the Infantryman or Trooper will be beaten 
 * corresponding to the numbers mentioned, and will be reduced power, the game will be repeated until the 
 * Infantryman or Trooper has power less than or equal to 0, the user can enter the number 3 to exit the program
 */
public class MainSoldier {

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
			System.out.println("1.Infantryman be beaten");
			System.out.println("2.Trooper be beaten");
			System.out.println("3.Quit");
			System.out.print("Choose infantryman or trooper be beaten: \n");
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
