package Ex1_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 01-Sep-2016 10:43:50 AM
 */
public class Student {

	public static void main(String[] args) {
		BufferedReader input= new BufferedReader( new InputStreamReader(System.in));
		try {
			String ask;
			while (true){
				System.out.println("Have you want to create Teacher(Y/N)? ");
				ask = input.readLine();
				if (ask.equalsIgnoreCase("y") || ask.equalsIgnoreCase("n"))
					break;
			}
			if (ask.equalsIgnoreCase("Y")){
				Teacher obj = Teacher.getInstance();
				System.out.println(obj.shareDocument());
			}
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
		
		
	}

}