package Ex1_13;

import phamThiKimHien.Employee;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Business Employee
 */
public class BusinessEmployee extends Employee {
	private double salary;
	private float sales;
	public BusinessEmployee(String name, double ceoSalary, int numOfPeople,
			double subsidize, double salary, float sales) {
		super(name, ceoSalary, numOfPeople, subsidize);
		this.salary = salary;
		this.sales = sales;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public float getSales() {
		return sales;
	}
	public void setSales(Float sales) {
		this.sales = sales;
	}
	// function: calculate Bonuses
	public double calcBonuses() {
		return salary*sales;
	}
}
