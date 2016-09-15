package Ex6_4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/*
 * author: Pham Thi Kim Hien
 * date: 14/09/2016
 * Version: 1.0
 *
 */
public class MainEmployee {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static String name;
	static double ceoSalary;
	static int numOfPeople;
	static double subsidize;
	public static void main(String[] args) {
		try {
			ListEmployee list;
			Employee employee = new Employee(name, ceoSalary, numOfPeople, subsidize);
			int ans;
			do {
				while (true) {
					System.out.println("=========================");
					System.out.println("1. Add Employee");
					System.out.println("2. Search Employee");
					System.out.println("3. Show information of Employee");
					System.out.println("4. Exit");
					System.out.println("Choose: ");
					ans = Integer.parseInt(input.readLine());
					if (ans >=1 && ans <= 4)
						break;
				}
				list = new ListEmployee();
				readEmployee(list, employee);
				switch (ans) {
				case 1:
					// add employee
					addEmployee(employee);
					readEmployee(list, employee);
					break;
				case 2:
					// search employee
					System.out.println("Enter name need search: ");
					String nameSearch = input.readLine();
					list.searchByName(nameSearch);
					break;
				case 3:
					// show information of Employee
					list.showInfo();
					break;
				default:
					break;
				}
				
				
			} while (ans != 4);			
		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
	private static void readEmployee(ListEmployee list, Employee employee) throws ClassNotFoundException {
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/Ex6_4/employee.txt")))){
			while (true) {
				Employee emp = (Employee) in.readObject();
				list.addEmployee(emp);
			}
		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}		
	}
	
	private static void addEmployee(Employee employee) {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/Ex6_4/employee.txt", false)))) {
			System.out.println("enter full name of the employee: ");
			name = input.readLine();
			System.out.println("Enter the employee's salary coefficient ");
			ceoSalary = Double.parseDouble(input.readLine());
			System.out.println("Enter the number of family allowances: ");
			numOfPeople = Integer.parseInt(input.readLine());
			System.out.println("Enter subsidies: ");
			subsidize = Double.parseDouble(input.readLine());
			employee = new Employee(name, ceoSalary, numOfPeople, subsidize);
			out.writeObject(employee);
			out.close();
			System.out.println("Employee has been written");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
