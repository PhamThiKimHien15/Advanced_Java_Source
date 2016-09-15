package Ex9_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;
/*
 * Author: Pham Thi Kim Hien
 * Date: 14/09/2016
 * Version: 1.0
 */
public class MainCD {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		ListCD list = new ListCD();
		CD cd = null;
		try {
			int ans;
			// choose language
			while (true){
				System.out.println("1. Viet Nam");
				System.out.println("2. English");
				ans = Integer.parseInt(input.readLine());
				if (ans == 1 || ans == 2)
					break;
			}
			Locale curr;
			ResourceBundle message;
			switch (ans) {
			case 1:		
				curr = new Locale("vi", "VN");
				message = ResourceBundle.getBundle("Ex9_2/resource_vi_VN", curr);
				while (true) {
					// choose add, sort by name, show information and exit of CD
					int choose1 = chooseCD(message);
						
					// add cd into CD list
					if (choose1 == 1){	
						addCD(message, list, cd);
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
				break;
			case 2:
				curr = new Locale("en", "EN");
				message = ResourceBundle.getBundle("Ex9_2/resource_en_US", curr);						
				while (true) {
					// choose add, sort by name, show information and exit of CD
					int choose1 = chooseCD(message);
						
					// add cd into CD list
					if (choose1 == 1){	
						addCD(message, list, cd);
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
				break;
			default:
				break;
			}								
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	// choose add, sort by name, show information and exit of CD
	public static int chooseCD(ResourceBundle message) throws NumberFormatException, IOException {
		int choose1;
		while (true) {
			System.out.println("1. " + message.getString("add"));
			System.out.println("2. " + message.getString("sortByName"));
			System.out.println("3. " + message.getString("showInfo"));
			System.out.println("4. " + message.getString("exit"));
			choose1 = Integer.parseInt(input.readLine());
			if(choose1 >= 1 && choose1 <= 4)
				break;
		}
		return choose1;
	}
	
	// add cd into CD list
	public static void addCD(ResourceBundle message, ListCD list, CD cd) throws IOException {
		String choose;
		do {				
			System.out.println(message.getString("id") + ": ");
			String id = input.readLine();							
			System.out.println(message.getString("name") + ": ");
			String name = input.readLine();
			System.out.println(message.getString("singer") + ": ");
			String singer = input.readLine();
			System.out.println(message.getString("number") + ": ");
			int numOfSongs = Integer.parseInt(input.readLine());
			System.out.println(message.getString("price") + ": ");
			double price = Double.parseDouble(input.readLine());
			cd = new CD(id, name, singer, numOfSongs, price);
			list.addCD(cd);						
			while (true) {
				System.out.println(message.getString("continue") + ": ");
				choose = input.readLine();
				if (choose.equalsIgnoreCase(message.getString("yes")) || choose.equalsIgnoreCase(message.getString("no")))
					break;
			}			
		} while (choose.equalsIgnoreCase(message.getString("yes")));
	}
}
