package Ex1_13.source;

import java.util.ArrayList;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * create list to manage information of Production Employee
 */
public class ListProductionEmployee {

	ArrayList<ProductionEmployee> list;

	public ListProductionEmployee() {
		this.list = new ArrayList<ProductionEmployee>();
	}

	public void addProEmployee(ProductionEmployee pro) {
		list.add(pro);
	}

	// function: calculate average of salary
	public double calcAverSalary() {
		double result = 0;
		for (int i = 0; i < list.size(); i++) {
			result += list.get(i).calcRealSalary();
		}
		return result / list.size();
	}

	// function: show information of Production Employee
	public void showInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString() + "\tBonuses: "
					+ String.format("%.2f", list.get(i).calcBonuses()));
		}
		System.out.println("\tAverage Salary: "
				+ String.format("%.2f", calcAverSalary()));
	}
}
