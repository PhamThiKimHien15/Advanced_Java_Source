package Ex2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 07/09/2016
 * Version: 1.0
 */
public class MainWordEnglish {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		ListWordEnglish list = new ListWordEnglish();
		WordEnglish weng;
		try {
			int choose1;
			while (true) {
				while (true) {
					System.out.println("1. Add new words to the dictionary");
					System.out.println("2. View the entire dictionary");
					System.out.println("3. Search words in the dictionary");
					System.out.println("4. Delete a word in the dictionary");
					System.out.println("5. Exit");
					choose1 = Integer.parseInt(input.readLine());
					if(choose1 >= 1 && choose1 <= 5)
						break;
				}
				
				// Add new words to the dictionary					
				if (choose1 == 1){	
					String choose;
					do {
						System.out.println("Enter word: ");
						String word = input.readLine();
						System.out.println("Enter meaning: ");
						String meaning = input.readLine();
						weng = new WordEnglish(word, meaning);
						list.addWork(weng);									
						while (true) {
							System.out.println("Do you want to enter next?(Y/N): ");
							choose = input.readLine();
							if (choose.equalsIgnoreCase("Y") || choose.equalsIgnoreCase("N"))
								break;
						}			
					} while (choose.equalsIgnoreCase("Y"));
				}
				
				// View the entire dictionary
				else if (choose1 == 2){
					list.showInfo();
				}
				
				// Search and delete words in the dictionary
				else if (choose1 == 3 || choose1 == 4){
					System.out.println("Enter word need search: ");
					String word2 = input.readLine();
					
					// Search words in the dictionary
					if (choose1 == 3)
						list.searchWord(word2);
					
					// Delete a word in the dictionary
					else
						list.deleteWord(word2);
				}
				
				// Exit loop
				else
					break;
			}					
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
