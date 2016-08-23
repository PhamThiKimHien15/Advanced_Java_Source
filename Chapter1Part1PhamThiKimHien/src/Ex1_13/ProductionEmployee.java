package Ex1_13;

import phamThiKimHien.Employee;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Production Employee
 */
public class ProductionEmployee extends Employee {
	private int number;
	private final double BONUSESRATE = 0.05;
	private final double PRONORMS = 0.05;
	public ProductionEmployee(String name, double ceoSalary, int numOfPeople,
			double subsidize, int number) {
		super(name, ceoSalary, numOfPeople, subsidize);
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	// function: calculate Bonuses
	public double calcBonuses() {
		return (getNumber()-PRONORMS)*BONUSESRATE;
	}
}