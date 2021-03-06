package Ex1_9.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 */
public class MainComputer {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static String id;
	static double price;
	static String manufac;
	static int number;
	public static void main(String[] args) {
		try {
			String choice;
			CollectionDesktop listDes = new CollectionDesktop();
			CollectionLaptop listLap = new CollectionLaptop();
			do {
				enterInfo();
				System.out.println("1.Enter information of the Desktop.");
				System.out.println("2.Enter information of the Laptop.");
				System.out.println("Please choose: ");
				int choice2 = Integer.parseInt(input.readLine());
				if(choice2 == 1 ){
					System.out.println("Enter CPU: ");
					String cPU = input.readLine();
					System.out.println("Enter RAM: ");
					String ram = input.readLine();
					Desktop des = new Desktop(id, price, manufac, number, cPU, ram);				
					listDes.addDesk(des);
					listDes.showInfo();
				}
				if(choice2 == 2 ){
					System.out.println("Enter weight: ");
					int weight = Integer.parseInt(input.readLine());
					System.out.println("Enter time PIN: ");
					int timePin = Integer.parseInt(input.readLine());
					System.out.println("Enter screen size: ");
					String scrSize = input.readLine();
					Laptop lap = new Laptop(id, price, manufac, number, weight, timePin, scrSize);					
					listLap.addLap(lap);
					listLap.showInfo();
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
	// get information of Desktop
	public static void enterInfo() throws NumberFormatException, IOException {
		System.out.print("Enter id: \n");
		id = input.readLine();
		System.out.print("Enter price: \n");
		price = Double.parseDouble(input.readLine());
		System.out.print("Enter manufacturer: \n");
		manufac = input.readLine();
		System.out.print("Enter number: \n");
		number = Integer.parseInt(input.readLine());
		
	}
}
