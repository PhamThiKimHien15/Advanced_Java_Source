package Ex1_13.source;

import phamThiKimHien.source.Employee;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Business Employee
 */
public class BusinessEmployee extends Employee {
	private double salary;
	private double sales;

	public BusinessEmployee(String name, double ceoSalary, int numOfPeople,
			double subsidize, double salary, double sales) {
		super(name, ceoSalary, numOfPeople, subsidize);
		this.salary = salary;
		this.sales = sales;
	}
	
	public BusinessEmployee(double salary, double sales) {
		super();
		this.salary = salary;
		this.sales = sales;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(Double sales) {
		this.sales = sales;
	}

	/*
	 *  function: calculate Bonuses
	 *  input is field include salary, sales
	 *  output is result of the calculation
	 */
	public double calcBonuses() {
		return salary * sales;
	}
}
