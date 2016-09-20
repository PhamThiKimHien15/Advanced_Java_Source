package ManageCD.JDBC;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/*
 * 	Author: Pham Thi Kim Hien
 *	Date: 19/09/2016
 *	Version: 1.0
 *  Description: use to show the list of functions that support program, 
 *  users choose a number that each number corresponds to a function has been mentioned below. 
 *  That function will perform. Once done, ask users: Do you want to continue? 
 *  If users choose "Y", the program will continue and vice versa
 */
public class MainCD {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		CDController cdController = new CDController();
		CD cd = null;
		try {
			String ansContinue = "Y";
			while (ansContinue.equalsIgnoreCase("Y")) {				
				int ans = 1;
				// choose function
				while (true) {
					System.out.println("1. Add CD");
					System.out.println("2. Search CD");
					System.out.println("3. Update CD");
					System.out.println("4. Delete CD");
					System.out.println("5. Show information of CD");
					System.out.print("Choose: ");
					ans = Integer.parseInt(input.readLine());
					if (ans >= 1 && ans <= 5)
						break;
				}
				
				switch (ans) {
				case 1:
					// Add CD
					System.out.println("Enter name(*): ");
					String name = input.readLine();
					System.out.println("Enter singer(*): ");
					String singer = input.readLine();				
					System.out.println("Enter numbersongs(*): ");
					int numbersongs = Integer.parseInt(input.readLine());
					System.out.println("Enter price(*): ");
					double price = Double.parseDouble(input.readLine());						
					if (!name.equals("") && !singer.equals("")){
						cd = new CD(name, singer, numbersongs, price);
						cdController.addCD(cd);
						System.out.println("success");
					}else{
						System.out.println("Error: Name and singer is not empty");
					}
					break;
				case 2:
					// Search CD
					int assSearch;
					while (true){
						System.out.println("1. By name");
						System.out.println("2. By singer");
						System.out.println("3. By price");
						System.out.print("Choose: ");
						assSearch = Integer.parseInt(input.readLine());
						if (assSearch >= 1 && assSearch <= 3)
							break;
					}
					// Search CD by name
					if (assSearch == 1){
						System.out.println("Enter name need search: ");
						String searchName = input.readLine();
						List<CD> listCD = cdController.searchCDByName(searchName);
						System.out.println("=======Result search========");
						if(listCD.size() > 0){
							for (CD cd2 : listCD) {
								System.out.println(cd2.toString());
							}			
						}else{
							System.out.println("Cannot find CD");
						}
					}
					else if (assSearch == 2){
						// Search CD by singer
						System.out.println("Enter singer need search: ");
						String searchSinger = input.readLine();
						List<CD> listCD = cdController.searchCDBySinger(searchSinger);
						System.out.println("=======Result search========");
						if(listCD.size() > 0){							
							for (CD cd2 : listCD) {
								System.out.println(cd2.toString());
							}			
						}else{
							System.out.println("Cannot find CD");
						}
					}
					else{
						// Search CD by price
						List<CD> listCD = searchCDByPrices (cdController);
						System.out.println("=======Result search========");
						if(listCD.size() > 0){							
							for (CD cd2 : listCD) {
								System.out.println(cd2.toString());
							}			
						}else{
							System.out.println("Cannot find CD");
						}
					}
					break;
				case 3:
					// Update CD
					System.out.println("=======Update CD=========");
					int idCD = showInfoCD(cdController, cd);
					
					System.out.println("Enter number songs need update: ");
					int numbersongsUpdate = Integer.parseInt(input.readLine());
					System.out.println("Enter price need update: ");
					double priceUpdate = Double.parseDouble(input.readLine());
					
					cd = new CD(idCD, numbersongsUpdate, priceUpdate);
					cdController.updateCD(cd);
					System.out.println("update success");
					break;
				case 4:
					//  Delete CD
					System.out.println("=======Delete CD=========");
					int idCDDelete = showInfoCD(cdController, cd);
					String anss;
					while(true){
						System.out.println("Do you sure want to delete?(Y/N): ");
						anss = input.readLine();
						if (anss.equalsIgnoreCase("Y") || anss.equalsIgnoreCase("N")){
							if (anss.equalsIgnoreCase("Y")){
								cdController.deleteCD(idCDDelete);
								System.out.println("delete success");
							}
							break;
						}
					}					
					break;
				case 5:
					//  Show information of CD
					System.out.println("=======Information CD=========");
					List<CD> list = cdController.getAllCD();
					for (CD cd2 : list) {
						System.out.println(cd2.toString());
					}				
					break;
				}
				
				while (true){
					System.out.println("Do you want to continue the program?(Y/N): ");
					ansContinue = input.readLine();
					if (ansContinue.equalsIgnoreCase("Y") || ansContinue.equalsIgnoreCase("N"))
						break;
				}				
			}		
		} catch (HeadlessException | IOException | NumberFormatException e) {
			System.err.println(e.getMessage());
		}
	}
	
	// Search CD by price
	private static List<CD> searchCDByPrices(CDController cdController) throws NumberFormatException, IOException {
		final double PRICE1 = 100000;
		final double PRICE2 = 200000;
		final double PRICE3 = 400000;
		final double PRICE4 = 600000;
		final double PRICE5 = 1000000;
		int searchPrice;
		while (true) {
			System.out.println("-------Search CD by price");
			System.out.println("1. 0 - " +  PRICE1);
			System.out.println("2. " + PRICE1 + " - " +  PRICE2);
			System.out.println("3. " + PRICE2 + " - " +  PRICE3);
			System.out.println("4. " + PRICE3 + " - " +  PRICE4);
			System.out.println("5. " + PRICE4 + " - " +  PRICE5);
			System.out.print("Choose: ");
			searchPrice = Integer.parseInt(input.readLine());
			if (searchPrice >= 1 && searchPrice <= 5)
				break;
		}
		List<CD> listCD = null;
		switch (searchPrice) {
		case 1:
			listCD = cdController.searchCDByPrice(0, PRICE1);
			break;
		case 2:
			listCD = cdController.searchCDByPrice(PRICE1, PRICE2);
			break;
		case 3:
			listCD = cdController.searchCDByPrice(PRICE2, PRICE3);
			break;
		case 4:
			listCD = cdController.searchCDByPrice(PRICE3, PRICE4);
			break;
		case 5:
			listCD = cdController.searchCDByPrice(PRICE4, PRICE5);
			break;
		}
		return listCD;
	}

	// show information of all CD
	private static int showInfoCD(CDController cdController,
			CD cd) throws NumberFormatException, IOException {
		List<CD> list = cdController.getAllCD();
		for (CD cd2 : list) {
			System.out.println(cd2.toString());
		}
		/*
		 *  users have selected the a CD, 
		 *  then start checking view users has selected the correct CD by id, 
		 *  if true, the end of the loop, 
		 *  if the wrong is for the user to choose again.
		 */
		int chooseCD;
		while(true){
			System.out.println("Choose: ");
			chooseCD = Integer.parseInt(input.readLine());
			int result = 0;
			for (CD cd2 : list) {
				if (cd2.getId() == chooseCD){
					result = 1;
					break;
				}
			}
			if (result == 1)
				break;
		}	
		return chooseCD;
	}

}
