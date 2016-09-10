package Ex2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Author: Pham Thi Kim Hien
 * Date: 07/09/2016
 * Version: 1.0
 */
public class MainStudent {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		ListStudent list = new ListStudent();
		Student stu;
		String key;
		try {
			int choose1;
			while (true) {
				while (true) {
					System.out.println("1. Add student");
					System.out.println("2. show information of all student");
					System.out.println("3. Search student");
					System.out.println("4. Delete student");
					System.out.println("5. Exit");
					choose1 = Integer.parseInt(input.readLine());
					if(choose1 >= 1 && choose1 <= 5)
						break;
				}
				
				// Add student					
				if (choose1 == 1){	
					String choose;
					do {
						System.out.println("Enter key: ");
						key = input.readLine();
						System.out.println("Enter name: ");
						String name = input.readLine();
						System.out.println("Enter age: ");
						int age = Integer.parseInt(input.readLine());
						System.out.println("Enter place of birth: ");
						String placeOfBirth = input.readLine();
						stu = new Student(name, age, placeOfBirth);
						list.addStudent(key, stu);									
						while (true) {
							System.out.println("Do you want to enter next?(Y/N): ");
							choose = input.readLine();
							if (choose.equalsIgnoreCase("Y") || choose.equalsIgnoreCase("N"))
								break;
						}			
					} while (choose.equalsIgnoreCase("Y"));
				}
				
				// show information of all student
				else if (choose1 == 2){
					list.showInfo();
				}
				
				// Search and delete Student
				else if (choose1 == 3 || choose1 == 4){
					System.out.println("Enter id: ");
					String id = input.readLine();
					
					// Search words in the dictionary
					if (choose1 == 3){
						if (list.searchStudent(id) == null)
							System.out.println("\tNot found");
						else
							System.out.println("\tID: " + id + list.searchStudent(id).toString());						
					}		
					
					// Delete a word in the dictionary
					else{
						if(list.deleteStudent(id) == true)
							System.out.println("\tDeleted successfully");
						else
							System.out.println("\tDeleted not succeed");
					}						
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
