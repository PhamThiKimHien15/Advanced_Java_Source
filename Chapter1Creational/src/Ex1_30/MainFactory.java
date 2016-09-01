package Ex1_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 01-Sep-2016 11:20:21 AM
 */
public class MainFactory {
	public static void main(String[] args) {
		BufferedReader input= new BufferedReader( new InputStreamReader(System.in));
		try {
			IShape ishap;
			int choose;
			while (true) {
				System.out.println("1. Circle");
				System.out.println("2. Square");
				System.out.println("3. Rectangle");
				System.out.println("Choose: ");
				choose = Integer.parseInt(input.readLine());
				if (choose == 1 || choose == 2 || choose == 3)
					break;
			}
			if (choose == 1){
				CircleFactory circle = new CircleFactory();
				ishap = circle.ShapeFactory();
				ishap.draw();
			}
			else if (choose == 2){
				SquareFactory square =new SquareFactory();
				ishap = square.ShapeFactory();
				ishap.draw();
			}else{
				RectangleFactory rec = new RectangleFactory();
				ishap = rec.ShapeFactory();
				ishap.draw();
			}			
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}

}