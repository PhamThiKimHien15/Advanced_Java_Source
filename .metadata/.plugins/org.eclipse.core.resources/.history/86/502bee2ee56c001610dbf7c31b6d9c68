package Ex1_13;

import java.util.ArrayList;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * create list to manage information of Business Employee
 */
public class ListBusinessEmployee {
	ArrayList<BusinessEmployee> list;
	
	public ListBusinessEmployee(){
		this.list = new ArrayList<BusinessEmployee>();
	}
	public void addBusEmployee(BusinessEmployee bus) {
		list.add(bus);
	}
	// function: calculate average salary
	public double calcAverSalary() {
		double result = 0;
		for (int i = 0; i < list.size(); i++) {
			result += list.get(i).calcRealSalary();
		}
		return result/list.size();
	}
	// function: show information of Business Employee
	public void showInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString() + "\tBonuses: " + String.format("%.2f", list.get(i).calcBonuses()));
		}
		System.out.println("\tAverage Salary: " + String.format("%.2f", calcAverSalary()));
	}
}
