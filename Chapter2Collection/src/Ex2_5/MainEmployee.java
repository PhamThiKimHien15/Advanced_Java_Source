package Ex2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEmployee {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		EmployeeManagement list = new EmployeeManagement();
		Employee emp;
		String key;
		try {
			int choose1;
			while (true) {
				while (true) {
					System.out.println("1. Add Employee");
					System.out.println("2. show information of all student");
					System.out.println("3. Exit");
					choose1 = Integer.parseInt(input.readLine());
					if(choose1 >= 1 && choose1 <= 3)
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
						System.out.println("Enter salary: ");
						double salary = Double.parseDouble(input.readLine());
						emp = new Employee(name, age, salary);
						list.addEmployee(key, emp);									
						while (true) {
							System.out.println("Do you want to enter next?(Y/N): ");
							choose = input.readLine();
							if (choose.equalsIgnoreCase("Y") || choose.equalsIgnoreCase("N"))
								break;
						}			
					} while (choose.equalsIgnoreCase("Y"));
				}
				
				// show information of all Employee
				else if (choose1 == 2){
					list.showInfo();
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
