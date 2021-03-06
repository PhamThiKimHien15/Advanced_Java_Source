package Ex1_13.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Description: use to show information list of Production Employee and Business Employee.
 * Users enter general information of Production Employee and Business Employee. 
 * Next, users choose a figure that each number corresponds to Production Employee and Business Employee,
 * then users enter its own information and outputting information list corresponding 
 */
public class MainEmployee {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static String name;
	static double ceoSalary;
	static int numOfPeople;
	static double subsidize;
	public static void main(String[] args) {
		try {
			String choice;
			ListBusinessEmployee listBE = new ListBusinessEmployee();
			ListProductionEmployee listPE = new ListProductionEmployee();
			do {
				enterInfo();
				System.out.println("1.Enter information of the Business Employee");
				System.out.println("2.Enter information of the Production Employee");
				System.out.println("Please choose: ");
				int choice2 = Integer.parseInt(input.readLine());
				if(choice2 != 1 && choice2 !=2)
					throw new ArithmeticException("You choose not suitable");
				if (choice2 ==1){
					System.out.println("Enter business salary: ");
					double salary = Double.parseDouble(input.readLine());
					if (salary < 0) 
						throw new ArithmeticException("You enter not suitable.");
					System.out.println("Enter Business wage rate: ");
					double sales = Float.parseFloat(input.readLine());
					if (sales <= 0) 
						throw new ArithmeticException("You enter not suitable.");
					BusinessEmployee bus = new BusinessEmployee(name, ceoSalary, numOfPeople, subsidize, salary, sales);
					listBE.addBusEmployee(bus);
					listBE.showInfo();
				}else{
					System.out.println("Enter product number: ");
					int number = Integer.parseInt(input.readLine());
					if (number < 0) 
						throw new ArithmeticException("You enter not suitable.");
					ProductionEmployee pro = new ProductionEmployee(name, ceoSalary, numOfPeople , subsidize, number);
					listPE.addProEmployee(pro);
					listPE.showInfo();
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
	// get information of Employee
	public static void enterInfo() throws NumberFormatException, IOException {
		System.out.println("enter full name of the employee: ");
		name = input.readLine();
		System.out.println("Enter the employee's salary coefficient ");
		ceoSalary = Double.parseDouble(input.readLine());
		if (ceoSalary <= 0) 
			throw new ArithmeticException("You enter not suitable.");
		System.out.println("Enter the number of family allowances: ");
		numOfPeople = Integer.parseInt(input.readLine());
		if (numOfPeople <= 0) 
			throw new ArithmeticException("You enter not suitable.");
		System.out.println("Enter subsidies: ");
		subsidize = Double.parseDouble(input.readLine());	
		if (subsidize < 0) 
			throw new ArithmeticException("You enter not suitable.");
	}
}
