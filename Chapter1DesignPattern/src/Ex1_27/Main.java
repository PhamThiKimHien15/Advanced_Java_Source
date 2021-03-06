package Ex1_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author: Pham Thi Kim Hien
 * Date: 31/08/2016
 * Version: 1.0
 */
public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			int choose;
			// choose drawings
			while (true) {
				System.out.println("1. Circle");
				System.out.println("2. Rectangle");
				choose = Integer.parseInt(input.readLine());
				if(choose >= 1  && choose <= 2)
					break;
			}
			String chooseDeco;
			while (true) {
				System.out.println("Do you want to decorate?(Y/N): ");
				chooseDeco = input.readLine();
				if(chooseDeco.equalsIgnoreCase("Y") || chooseDeco.equalsIgnoreCase("N"))
					break;					
			}
			RedShapeDecorator redShap;
			if (choose == 1 && chooseDeco.equalsIgnoreCase("Y")){
				Circle circle = new Circle();
				redShap = new RedShapeDecorator(circle);
				System.out.println(redShap.draw(chooseDeco));
			}
			else if (choose == 1 && chooseDeco.equalsIgnoreCase("N")){
				Circle circle = new Circle();
				redShap = new RedShapeDecorator(circle);
				System.out.println(redShap.draw(chooseDeco));
			}
			else if (choose == 2 && chooseDeco.equalsIgnoreCase("Y")){
				Rectangle rec = new Rectangle();
				redShap = new RedShapeDecorator(rec);
				System.out.println(redShap.draw(chooseDeco));
			}
			else{
				Rectangle rec = new Rectangle();
				redShap = new RedShapeDecorator(rec);
				System.out.println(redShap.draw(chooseDeco));
			}			
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}		
	}
}
