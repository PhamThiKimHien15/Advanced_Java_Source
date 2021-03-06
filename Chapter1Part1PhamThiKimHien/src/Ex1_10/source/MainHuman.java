package Ex1_10.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Description: use to show information list of students or teachers.
 * Users enter general information of students and teachers. 
 * Next, users choose a figure that each number corresponds to the students or teachers, 
 * then users enter its own information and outputting information list corresponding 
 */
public class MainHuman {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static String name;
	static String days;
	static String address;
	static String phone;
	public static void main(String[] args) {
		try {
			String choice;
			CollectionTeacher listTeacher = new CollectionTeacher();
			CollectionStudent listStudent = new CollectionStudent();
			do {
				enterInfo();
				System.out.println("1.Enter information of the Teacher");
				System.out.println("2.Enter information of the Strudent");
				System.out.println("Please choose: ");
				int choice2 = Integer.parseInt(input.readLine());
				if(choice2 != 1 && choice2 !=2)
					throw new ArithmeticException("You choose not suitable");
				if (choice2 ==1){
					System.out.println("Enter homeroom class: ");
					String homeroomClass = input.readLine();
					System.out.println("Enter Coefficients salary: ");
					float ceoSalary = Float.parseFloat(input.readLine());
					System.out.println("Enter Allowance: ");
					double allowance = Double.parseDouble(input.readLine());
					Teacher te = new Teacher(name, days, address, phone, homeroomClass, ceoSalary, allowance);
					listTeacher.addTeacher(te);
					listTeacher.showInfo();
				}else{
					System.out.println("Enter the classroom: ");
					String stuClass = input.readLine();
					System.out.println("Enter ponit HK1: ");
					double hK1 = Double.parseDouble(input.readLine());
					if (hK1 < 0)
						throw new ArithmeticException("You enter not suitable");
					System.out.println("Enter ponit HK2: ");
					double hK2 = Double.parseDouble(input.readLine());
					if (hK2 < 0)
						throw new ArithmeticException("You enter not suitable");
					Student st = new Student(name, days, address, phone, stuClass, hK1, hK2);
					listStudent.addStudent(st);
					listStudent.showInfo();
				}
				System.out.println("Do you would like to enter next?(Y/N)");
				choice = input.readLine();
				if(! choice.equalsIgnoreCase("Y") && ! choice.equalsIgnoreCase("N"))
					throw new ArithmeticException ("You choose not suitable");
			} while (choice.equalsIgnoreCase("Y"));			
		} catch (NumberFormatException | IOException | ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}
	// get information of Human
	public static void enterInfo() throws NumberFormatException, IOException {
		System.out.print("Enter name: \n");
		name = input.readLine();
		System.out.print("Enter birthday: \n");
		days = input.readLine();
		System.out.print("Enter address: \n");
		address = input.readLine();
		System.out.print("Enter phone: \n");
		phone = input.readLine();
		checkNumberPhone(phone);
	}
	/*
	 * function: check the phone numbers
	 * input is phone field 
	 * output is error if the phone number is entered incorrectly
	 */	
	public static void checkNumberPhone(String phone) {
		Pattern pa = Pattern.compile("^[0-9]*$");
		Matcher ma = pa.matcher(phone);
		if (! ma.matches())
			throw new ArithmeticException("string enter is not a number");
		else{
			if(phone.length() == 10 || phone.length() == 11){
				if(phone.length() == 10 && ! phone.substring(0, 2).equals("09"))
						throw new ArithmeticException("number phone is invalid");
				else if (phone.length() == 11 && ! phone.substring(0, 2).equals("01"))
					throw new ArithmeticException("number phone is invalid");
			}else{
				throw new ArithmeticException("length of the string is invalid");
			}
		}
	}
}
