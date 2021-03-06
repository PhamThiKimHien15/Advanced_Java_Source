package Ex1_17.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 */

public class MainAnimal {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static String name;
	static String food;

	public static void main(String[] args) {
		try {
			String choice;
			ListBird listBird = new ListBird();
			ListFish listFish = new ListFish();
			ListTiger listTiger = new ListTiger();
			ListBoa listBoa = new ListBoa();
			do {
				enterInfo();
				System.out.println("1.Bird");
				System.out.println("2.Fish");
				System.out.println("3.Tiger");
				System.out.println("4.Boa");
				System.out.println("Please choose: ");
				int choice2 = Integer.parseInt(input.readLine());
				if (choice2 != 1 && choice2 != 2 && choice2 != 3
						&& choice2 != 4)
					throw new ArithmeticException("You choose not suitable");
				if (choice2 == 1) {
					Bird bird = new Bird(name, food);
					listBird.add(bird);
					listBird.showInfo();
				} else if (choice2 == 2) {
					Fish fish = new Fish(name, food);
					listFish.add(fish);
					listFish.showInfo();
				} else if (choice2 == 3) {
					Tiger tiger = new Tiger(name, food);
					listTiger.add(tiger);
					listTiger.showInfo();
				} else {
					Boa boa = new Boa(name, food);
					listBoa.add(boa);
					listBoa.showInfo();
				}
				System.out.println("Do you would like to enter next?(Y/N)");
				choice = input.readLine();
				if (!choice.equalsIgnoreCase("Y")
						&& !choice.equalsIgnoreCase("N"))
					throw new ArithmeticException("You enter not suitable");
			} while (choice.equalsIgnoreCase("Y"));
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	// get information of Animal
	public static void enterInfo() throws IOException {
		System.out.println("Enter name: ");
		name = input.readLine();
		System.out.println("Enter food: ");
		food = input.readLine();
	}
}
