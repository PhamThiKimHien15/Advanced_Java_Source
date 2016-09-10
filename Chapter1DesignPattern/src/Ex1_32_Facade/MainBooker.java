package Ex1_32_Facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainBooker {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			 int choose;
	            while (true) {
	                System.out.println("1: hotel");
	                System.out.println("2: fight");
	                System.out.println("3: train");
	                choose = Integer.parseInt(input.readLine());
	                if (choose >= 1 && choose <= 3) {
	                    break;
	                }
	            }
	            System.out.print("Enter start date: ");
	            String date = input.readLine();
	            if(choose == 2 || choose == 3){
	            	System.out.print("Enter Departure time: ");	 	           
	            }else{
	            	System.out.print("Enter end date: ");	 	           
	            }	
	            String hour = input.readLine();
	            System.out.print("Enter place: ");
	            String place = input.readLine();
	            BookingFacade booking = new BookingFacade();
	            switch (choose) {
	                case 1:
	                    System.out.println(booking.getInfoHotel(date, hour, place));
	                    break;
	                case 2:
	                    System.out.println(booking.getInfoFight(date, hour, place));
	                    break;
	                case 3:
	                    System.out.println(booking.getInfoTrain(date, hour, place));
	            }
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
		
		
	}
}
