package Ex1_15.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 */
public class MainInstrucment {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static String name;
	static String proUnit;

	public static void main(String[] args) {
		try {
			enterInfo();
			System.out.println("1.Stringed Instrument");
			System.out.println("2.Non Stringed Instrument");
			System.out.println("Please choose: ");
			int choice = Integer.parseInt(input.readLine());
			if (choice != 1 && choice != 2)
				throw new ArithmeticException("You choose not be suitable");
			if (choice == 1) {
				System.out.println("Enter number of Strings: ");
				double number = Double.parseDouble(input.readLine());
				StringedInstrument st = new StringedInstrument(name, proUnit,
						number);
				st.play();
			} else {
				System.out.println("Enter using: ");
				String use = input.readLine();
				NonStringedInstrument non = new NonStringedInstrument(name,
						proUnit, use);
				non.play();
			}

		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}

	// get information of Instrument
	public static void enterInfo() throws IOException {
		System.out.println("Enter name: ");
		name = input.readLine();
		System.out.println("Enter production unit: ");
		proUnit = input.readLine();
	}
}
