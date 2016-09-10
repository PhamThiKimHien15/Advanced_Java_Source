package Ex2_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 10/9/2016
 * Version: 1.0
 */
public class MainContact {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		try {
			ContactManagement list = new ContactManagement();
			Contact contact;
			while (true){
				int choose;
				while (true) {
					System.out.println("1.Show all contact");
					System.out.println("2.Add contact");
					System.out.println("3.Search contact by name");
					System.out.println("4.Delete contact by name or number phone");
					System.out.println("5.Update contact");
					System.out.println("6.Exit");
					choose = Integer.parseInt(input.readLine());
					if (choose >= 1 && choose <=6)
						break;
				}								
				// use to exit the program
				if (choose == 6)
					break;
				switch (choose) {
				// Show all contact
				case 1:
					list.showInfo();
					break;
				// Add contact
				case 2:
					System.out.println("Enter name: ");
					String name = input.readLine();
					System.out.println("Enter number phone: ");
					String numPhone = input.readLine();
					contact = new Contact(name, numPhone);
					list.addContact(contact);
					break;
				// Search contact by name
				case 3:
					System.out.println("Enter name need search: ");
					String searchName = input.readLine();
					if (list.searchContact(searchName) == null)
						System.out.println("Not found");
					else
						System.out.println(list.searchContact(searchName).toString());
					break;
				// Delete contact by name or number phone and before show contact need delete
				case 4:
					System.out.println("Enter name or number phone need delete: ");
					String nameOrNumPhone = input.readLine();
					if(list.showInfoBeforeDelete(nameOrNumPhone) == null){
						System.out.println("Not found contact need delete");
					}else{						
						System.out.println(list.showInfoBeforeDelete(nameOrNumPhone).toString());
						String chooseDelete;
						while (true) {
							System.out.println("Do you want to delete?(Y/N): ");
							chooseDelete = input.readLine();
							if (chooseDelete.equalsIgnoreCase("y")){
								list.deleteContact(nameOrNumPhone);
								System.out.println("\tDeleted successfully");
								break;
							}
							else if (chooseDelete.equalsIgnoreCase("n"))
								break;
						}						
					}
					break;
				// Update number phone by name
				case 5:
					System.out.println("====Update contact======");
					System.out.println("Enter name: ");
					String updateName = input.readLine();
					if(list.searchContact(updateName) == null)
						System.out.println("Not found");
					else{
						System.out.println(list.searchContact(updateName).toString());
						System.out.println("Enter new phone number: ");
						String newNumber = input.readLine();
						list.updateContact(updateName, newNumber);
					}
					break;
				}				
			}
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
		
		
	}
}
