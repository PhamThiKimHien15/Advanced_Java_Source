package Ex1_12.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Description: use to show information list of Text Book and Reference Book.
 * Users enter general information of Text Book and Reference Book. 
 * Next, users choose a figure that each number corresponds to Text Book and Reference Book,
 * then users enter its own information and outputting information list corresponding
 */
public class MainBook {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static String id;
	static String name;
	static String days;
	static double price;
	static int number;
	static String pubHouse;
	public static void main(String[] args) {
		try {
			String choice;
			ListTextBook listTB = new ListTextBook();
			ListReferenceBook listRB = new ListReferenceBook();
			do {
				enterInfo();
				System.out.println("1.Enter information of the Text Book");
				System.out.println("2.Enter information of the Reference Book");
				System.out.println("Please choose: ");
				int choice2 = Integer.parseInt(input.readLine());
				if(choice2 != 1 && choice2 !=2)
					throw new ArithmeticException("You choose not suitable");
				if (choice2 ==1){
					System.out.println("Enter status(new or old): ");
					String status = input.readLine();
					if (! status.equalsIgnoreCase("new") && ! status.equalsIgnoreCase("old"))
						throw new ArithmeticException ("You choose not suitable");
					TextBook tb = new TextBook(id, name, days, price, number, pubHouse, status);
					listTB.addTextBook(tb);
					listTB.showInfo();
				}else{
					System.out.println("Enter tax(from 1 to 100): ");
					int tax = Integer.parseInt(input.readLine());
					if (tax <= 0  || tax > 100)
						throw new ArithmeticException ("You enter not suitable");
					ReferenceBook rb = new ReferenceBook(id, name, days, price, number, pubHouse, tax);
					listRB.addRefBook(rb);
					listRB.showInfo();
				}
				System.out.println("Do you would like to enter next?(Y/N)");
				choice = input.readLine();
				if(! choice.equalsIgnoreCase("Y") && ! choice.equalsIgnoreCase("N"))
					throw new ArithmeticException ("You choose not suitable");
			} while (choice.equalsIgnoreCase("Y"));		
		} catch (NumberFormatException | IOException | ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}
	// get information of Book
	public static void enterInfo() throws NumberFormatException, IOException, ArithmeticException {
		System.out.print("Enter id: \n");
		id = input.readLine();
		System.out.print("Enter name: \n");
		name = input.readLine();
		System.out.print("Enter date: \n");
		days = input.readLine();
		System.out.print("Enter price: \n");
		price = Double.parseDouble(input.readLine());
		if (price < 0)
			throw new ArithmeticException ("You enter not suitable");
		System.out.print("Enter number: \n");
		number = Integer.parseInt(input.readLine());
		if (number < 0)
			throw new ArithmeticException ("You enter not suitable");
		System.out.print("Enter Publishing House: \n");
		pubHouse = input.readLine();		
	}
}
