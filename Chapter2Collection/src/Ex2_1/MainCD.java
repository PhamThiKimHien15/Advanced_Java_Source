package Ex2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 07/09/2016
 * Version: 1.0
 */
public class MainCD {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		ListCD list = new ListCD();
		CD cd;
		try {
			int choose1;
			while (true) {
				while (true) {
					System.out.println("1. Add CD");
					System.out.println("2. Sort by name");
					System.out.println("3. Show information CD");
					System.out.println("4. Exit");
					choose1 = Integer.parseInt(input.readLine());
					if(choose1 >= 1 && choose1 <= 4)
						break;
				}
					
				// add cd into CD list
				if (choose1 == 1){	
					String choose;
					do {
						System.out.println("Enter id: ");
						String id = input.readLine();
						System.out.println("Enter name: ");
						String name = input.readLine();
						System.out.println("Enter singer: ");
						String singer = input.readLine();
						System.out.println("Enter number of songs: ");
						int numOfSongs = Integer.parseInt(input.readLine());
						System.out.println("Enter price: ");
						double price = Double.parseDouble(input.readLine());
						cd = new CD(id, name, singer, numOfSongs, price);
						list.addCD(cd);											
						while (true) {
							System.out.println("Do you want to enter next?(Y/N): ");
							choose = input.readLine();
							if (choose.equalsIgnoreCase("Y") || choose.equalsIgnoreCase("N"))
								break;
						}			
					} while (choose.equalsIgnoreCase("Y"));
				}
				// sort the list by cd name
				else if (choose1 == 2){
					list.listSort();
				}
				// show list of cd
				else if (choose1 == 3)
					list.showInfo();
				// Exit loop
				else
					break;
			}					
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
