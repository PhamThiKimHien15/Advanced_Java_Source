package Ex1_16.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Description: use to show information list of car or ship.
 * Users enter general information of cars and ship. 
 * Next, users choose a figure that each number corresponds to the car and ship, 
 * then users enter its own information and outputting information list corresponding 
 */

public class MainVehicle {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static String id;
	static String owner;
	static String color;
	static String manufac;
	static double distance;
	static double time;
	static double liters;

	public static void main(String[] args) {
		try {
			String choice;
			ListCar listCar = new ListCar();
			ListShip listShip = new ListShip();
			do {
				enterInfo();
				System.out.println("1.Enter information of the Car");
				System.out.println("2.Enter information of the Ship");
				System.out.println("Please choose: ");
				int choice2 = Integer.parseInt(input.readLine());
				if (choice2 != 1 && choice2 != 2)
					throw new ArithmeticException("You choose not suitable");
				if (choice2 == 1) {
					System.out.println("Enter gearbox(manual or automatic): ");
					String gearbox = input.readLine();
					if (!gearbox.equalsIgnoreCase("manual")
							&& !gearbox.equalsIgnoreCase("automatic"))
						throw new ArithmeticException("You enter not suitable");
					System.out.println("Enter car type: ");
					String carType = input.readLine();
					Car car = new Car(distance, time, liters, id, owner, color,
							manufac, gearbox, carType);
					listCar.add(car);
					listCar.showInfo();
				} else {
					System.out.println("Enter weight: ");
					double weight = Double.parseDouble(input.readLine());
					System.out.println("Enter capacity: ");
					double capacity = Double.parseDouble(input.readLine());
					System.out.println("Enter downStream water speed: ");
					double downSpeed = Double.parseDouble(input.readLine());
					System.out.println("Enter upStream water speed: ");
					double upSpeed = Double.parseDouble(input.readLine());
					System.out.println("Enter startup fuel consumption: ");
					double startupFuelCons = Double.parseDouble(input
							.readLine());
					System.out.println("Enter fuel type: ");
					String fuelType = input.readLine();
					Ship ship = new Ship(distance, time, liters, id, owner,
							color, manufac, weight, capacity, downSpeed,
							upSpeed, startupFuelCons, fuelType);
					listShip.add(ship);
					listShip.showInfo();
				}
				System.out.println("Do you would like to enter next?(Y/N)");
				choice = input.readLine();
				if (!choice.equalsIgnoreCase("Y")
						&& !choice.equalsIgnoreCase("N"))
					throw new ArithmeticException("You enter not suitable");
			} while (choice.equalsIgnoreCase("Y"));
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}

	// get information of vehicle
	public static void enterInfo() throws NumberFormatException, IOException {
		System.out.println("Enter id: ");
		id = input.readLine();
		System.out.println("Enter owner: ");
		owner = input.readLine();
		System.out.println("Enter color: ");
		color = input.readLine();
		System.out.println("Enter manufacturer: ");
		manufac = input.readLine();
		System.out.println("Enter distance: ");
		distance = Double.parseDouble(input.readLine());
		System.out.println("Enter time: ");
		time = Double.parseDouble(input.readLine());
		System.out.println("Enter liters of fuel use : ");
		liters = Double.parseDouble(input.readLine());
	}
}
