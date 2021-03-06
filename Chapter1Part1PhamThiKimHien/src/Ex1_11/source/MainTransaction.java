package Ex1_11.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Description: use to show information list of Currency Transaction and Gold Transaction.
 * Users enter general information of Currency Transaction and Gold Transaction. 
 * Next, users choose a figure that each number corresponds to Currency Transaction and Gold Transaction,
 * then users enter its own information and outputting information list corresponding
 */
public class MainTransaction {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static String id;
	static String days;
	static double number;
	public static void main(String[] args) {
		try {
			String choice;
			ListOfGoldTransaction listGold = new ListOfGoldTransaction();
			ListOfCurrTrans listCurr = new ListOfCurrTrans();
			do {
				enterInfo();
				System.out.println("1.Enter information of the gold transaction");
				System.out.println("2.Enter information of the currency transaction");
				System.out.println("Please choose");
				int choice2 = Integer.parseInt(input.readLine());
				if(choice2 != 1 && choice2 !=2)
					throw new ArithmeticException("You choose not suitable");
				if (choice2 ==1){
					System.out.println("Enter type of gold(24k or SJC): ");
					String typeOfGold = input.readLine();
					if(! typeOfGold.equalsIgnoreCase("24K") && ! typeOfGold.equals("SJC"))
						throw new ArithmeticException("You choose not suitable");
					GoldTransaction gol = new GoldTransaction(id, days, number, typeOfGold);
					listGold.addGoldTrans(gol);
					listGold.showInfo();
				}else{
					System.out.println("Enter type of currency(USD or EUR or AUD): ");
					String typeOfCurr = input.readLine();
					if(! typeOfCurr.equalsIgnoreCase("USD") && ! typeOfCurr.equals("EUR") && ! typeOfCurr.equalsIgnoreCase("AUD"))
						throw new ArithmeticException("You choose not suitable");
					CurrencyTransaction cur = new CurrencyTransaction(id, days, number, typeOfCurr);
					listCurr.addCurrTrans(cur);
					listCurr.showInfo();
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
	// get information of Transaction
	public static void enterInfo() throws NumberFormatException, IOException, ArithmeticException {
		System.out.print("Enter id: \n");
		id = input.readLine();
		System.out.print("Enter date: \n");
		days = input.readLine();
		System.out.print("Enter number: \n");
		number = Integer.parseInt(input.readLine());
		if (number < 0)
			throw new ArithmeticException("You enter not suitable");
	}
}
