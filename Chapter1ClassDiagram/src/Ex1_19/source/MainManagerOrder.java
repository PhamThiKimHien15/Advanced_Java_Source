package Ex1_19.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Arrays;
/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 30-Aug-2016 8:22:27 AM
 */
public class MainManagerOrder {
	static BufferedReader input = new BufferedReader(new InputStreamReader(
			System.in));
	static String name;
	static String identityCard;
	static String email;
	static String phone;
	static String address;

	public static void main(String[] args) {
		try {
			enterInfo();
			//show customer's information
            System.out.println("== Customer's information == ");
            System.out.println("Full name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Email: " + email);
            System.out.println("Identify Card Number: " + identityCard);
            System.out.println("Phone Number: " + phone);
            
			// the customer buy Item
			Product product;
			OrderDetail detail;
			OrderDetail[] m_detail = new OrderDetail[0];
			String choice;
			do {
				int item = 1;
				while (true) {
					System.out.println("Product: ");
					for (int i = 0; i < Item.values().length; i++) {
						System.out.println((i + 1) + ". "
								+ Item.values()[i].name() + "  "
								+ Item.values()[i].getPrice());
					}
					System.out.print("Choose product: ");
					item = Integer.parseInt(input.readLine());
					if (item > 0 && item <= Item.values().length) {
						break;
					}
				}

				int quantity;
				while (true) {
					System.out.println("Enter Product quantity: ");
					quantity = Integer.parseInt(input.readLine());
					if (quantity > 0)
						break;
				}
				
				product = new Product(Item.values()[item - 1].name(),
						Item.values()[item - 1].getPrice());
				detail = new OrderDetail(quantity, product);
				m_detail = Arrays.copyOf(m_detail, m_detail.length + 1);
				m_detail[m_detail.length - 1] = detail;
				while (true) {
					System.out.println("Have you want to enter next?(Y/N): ");
					choice = input.readLine();
					if (choice.equalsIgnoreCase("Y")
							|| choice.equalsIgnoreCase("N"))
						break;
				}
			} while (choice.equalsIgnoreCase("Y"));
			// choose status of your order
			int choice3;
			while (true) {
				System.out.println("1. Just order");
				System.out.println("2. Order and Payment");
				System.out.println("Please choose: ");
				choice3 = Integer.parseInt(input.readLine());
				if (choice3 == 1 || choice3 == 2)
					break;
				else
					System.out.println("You choose not suitable.");
			}
			// enter customer id
			System.out.println("Enter Customer id: ");
			String customerID = input.readLine();
			// Choose a payment method
			if (choice3 == 2) {
				System.out.println("Please choose your payment method");
				System.out.println("1.Credit Card");
				System.out.println("2.ATM Card");
				System.out.println("Please choose: ");
				int choice2 = Integer.parseInt(input.readLine());
				choosePaymentMethod(choice2);
			}
			// question print orders
			Order order = new Order(m_detail);
			boolean printOrder = false;
			while (true) {
				System.out
						.println("Have you want to print out the invoice?(Y/N): ");
				String ans = input.readLine();
				if (ans.equalsIgnoreCase("Y")) {
					printOrder = true;
					break;
				} else {
					printOrder = false;
					break;
				}
			}
			order.setPrintOrder(printOrder);
			order.calTotalAmount();
			order.showInfo();

		} catch (NumberFormatException | IOException | ParseException e) {
			System.err.println(e.getMessage());
		}
	}

	public static void choosePaymentMethod(int choice) throws IOException, ParseException {
		System.out.println("Enter Card ID: ");
		String cardID = input.readLine();
		if (choice == 1) {
			String expirationDate = "20/10/2018";
			double maxDebt = 4000000;

			CreditCard cre = new CreditCard(cardID, expirationDate, maxDebt);
			cre.showInfo();
		} else {
			double balance = 4000000;
			
			ATMCard atm = new ATMCard(cardID, balance);
			atm.showInfo();
		}
	}

	// function: enter infomation
	public static void enterInfo() throws IOException {
		name = "Nguyen Van A";
		identityCard = "124578963";
		email = "nguyenvana@gmail.com";
		phone = "01234569821";
		address = "12 Nguyen Van Bao, P.4, Quan Go Vap";
	}
}
