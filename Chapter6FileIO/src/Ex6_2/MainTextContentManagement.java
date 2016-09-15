package Ex6_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
/*
 * author: Pham Thi Kim Hien
 * date: 14/09/2016
 * Version: 1.0
 */
public class MainTextContentManagement {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {			
			TextContentManagement list;
			String s = readFile();			
			list = new TextContentManagement();
			list.splitWord(s);
			int choose;
			while (true) {
				while (true){
					System.out.println("1.Show text content");
					System.out.println("2.Search a word in the text content");
					System.out.println("3.Exit");
					choose = Integer.parseInt(input.readLine());
					if(choose >= 1 && choose <= 3)
						break;
				}
				// Show text content
				if(choose == 1){					
					list.showInfo();
				}
				// Search a word in the text content
				else if (choose == 2){
					System.out.println("Enter a word need search: ");
					String word = input.readLine();
					list.searchWord(word);
				}
				else
					break;
			}			
		} catch (NumberFormatException | IOException | NullPointerException e) {
			System.err.println(e.getMessage());
		}
	}

	private static String readFile() {
		String s ="";
		String strings;
		try (BufferedReader in = new BufferedReader(new FileReader("src/Ex6_2/document.txt"))) {
			while ((strings= in.readLine()) != null) {
				s += strings ;
			}
			in.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return s;
	}
}
